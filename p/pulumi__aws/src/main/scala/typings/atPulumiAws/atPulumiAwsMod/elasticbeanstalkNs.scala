package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.elasticbeanstalkApplicationMod.ApplicationArgs
import typings.atPulumiAws.elasticbeanstalkApplicationMod.ApplicationState
import typings.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersionArgs
import typings.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersionState
import typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateArgs
import typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateState
import typings.atPulumiAws.elasticbeanstalkEnvironmentMod.EnvironmentArgs
import typings.atPulumiAws.elasticbeanstalkEnvironmentMod.EnvironmentState
import typings.atPulumiAws.elasticbeanstalkGetApplicationMod.GetApplicationArgs
import typings.atPulumiAws.elasticbeanstalkGetApplicationMod.GetApplicationResult
import typings.atPulumiAws.elasticbeanstalkGetHostedZoneMod.GetHostedZoneArgs
import typings.atPulumiAws.elasticbeanstalkGetHostedZoneMod.GetHostedZoneResult
import typings.atPulumiAws.elasticbeanstalkGetSolutionStackMod.GetSolutionStackArgs
import typings.atPulumiAws.elasticbeanstalkGetSolutionStackMod.GetSolutionStackResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elasticbeanstalk")
@js.native
object elasticbeanstalkNs extends js.Object {
  @js.native
  class Application protected ()
    extends typings.atPulumiAws.elasticbeanstalkMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ApplicationVersion protected ()
    extends typings.atPulumiAws.elasticbeanstalkMod.ApplicationVersion {
    /**
      * Create a ApplicationVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApplicationVersionArgs) = this()
    def this(name: String, args: ApplicationVersionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ConfigurationTemplate protected ()
    extends typings.atPulumiAws.elasticbeanstalkMod.ConfigurationTemplate {
    /**
      * Create a ConfigurationTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationTemplateArgs) = this()
    def this(name: String, args: ConfigurationTemplateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Environment protected ()
    extends typings.atPulumiAws.elasticbeanstalkMod.Environment {
    /**
      * Create a Environment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EnvironmentArgs) = this()
    def this(name: String, args: EnvironmentArgs, opts: CustomResourceOptions) = this()
  }
  
  def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] with GetApplicationResult = js.native
  def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] with GetApplicationResult = js.native
  def getHostedZone(): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] with GetSolutionStackResult = js.native
  def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] with GetSolutionStackResult = js.native
  /* static members */
  @js.native
  object Application extends js.Object {
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typings.atPulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typings.atPulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/application.Application */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ApplicationVersion extends js.Object {
    /**
      * Get an existing ApplicationVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState): typings.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState, opts: CustomResourceOptions): typings.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
    /**
      * Returns true if the given object is an instance of ApplicationVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ConfigurationTemplate extends js.Object {
    /**
      * Get an existing ConfigurationTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState): typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): typings.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
    /**
      * Returns true if the given object is an instance of ConfigurationTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Environment extends js.Object {
    /**
      * Get an existing Environment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: EnvironmentState): typings.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): typings.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
    /**
      * Returns true if the given object is an instance of Environment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = js.native
  }
  
}

