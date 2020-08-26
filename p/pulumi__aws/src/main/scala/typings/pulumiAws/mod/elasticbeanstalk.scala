package typings.pulumiAws.mod

import typings.pulumiAws.applicationVersionMod.ApplicationVersionArgs
import typings.pulumiAws.applicationVersionMod.ApplicationVersionState
import typings.pulumiAws.configurationTemplateMod.ConfigurationTemplateArgs
import typings.pulumiAws.configurationTemplateMod.ConfigurationTemplateState
import typings.pulumiAws.elasticbeanstalkApplicationMod.ApplicationArgs
import typings.pulumiAws.elasticbeanstalkApplicationMod.ApplicationState
import typings.pulumiAws.environmentMod.EnvironmentArgs
import typings.pulumiAws.environmentMod.EnvironmentState
import typings.pulumiAws.getApplicationMod.GetApplicationArgs
import typings.pulumiAws.getApplicationMod.GetApplicationResult
import typings.pulumiAws.getHostedZoneMod.GetHostedZoneArgs
import typings.pulumiAws.getHostedZoneMod.GetHostedZoneResult
import typings.pulumiAws.getSolutionStackMod.GetSolutionStackArgs
import typings.pulumiAws.getSolutionStackMod.GetSolutionStackResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elasticbeanstalk")
@js.native
object elasticbeanstalk extends js.Object {
  @js.native
  class Application protected ()
    extends typings.pulumiAws.elasticbeanstalkMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ApplicationVersion protected ()
    extends typings.pulumiAws.elasticbeanstalkMod.ApplicationVersion {
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
    extends typings.pulumiAws.elasticbeanstalkMod.ConfigurationTemplate {
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
    extends typings.pulumiAws.elasticbeanstalkMod.Environment {
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
  
  def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] = js.native
  def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] = js.native
  def getHostedZone(): js.Promise[GetHostedZoneResult] = js.native
  def getHostedZone(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetHostedZoneResult] = js.native
  def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] = js.native
  def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] = js.native
  def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] = js.native
  def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState): typings.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState, opts: CustomResourceOptions): typings.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.environmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.environmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: EnvironmentState): typings.pulumiAws.environmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): typings.pulumiAws.environmentMod.Environment = js.native
    /**
      * Returns true if the given object is an instance of Environment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = js.native
  }
  
}

