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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticbeanstalk {
  
  @JSImport("@pulumi/aws", "elasticbeanstalk.Application")
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
  /* static members */
  object Application {
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticbeanstalk.Application.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticbeanstalk.Application.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/application.Application */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticbeanstalk.ApplicationVersion")
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
  /* static members */
  object ApplicationVersion {
    
    /**
      * Get an existing ApplicationVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticbeanstalk.ApplicationVersion.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.ApplicationVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.ApplicationVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState): typings.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.ApplicationVersion.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState, opts: CustomResourceOptions): typings.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    
    /**
      * Returns true if the given object is an instance of ApplicationVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticbeanstalk.ApplicationVersion.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticbeanstalk.ConfigurationTemplate")
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
  /* static members */
  object ConfigurationTemplate {
    
    /**
      * Get an existing ConfigurationTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticbeanstalk.ConfigurationTemplate.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.ConfigurationTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.ConfigurationTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.ConfigurationTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    
    /**
      * Returns true if the given object is an instance of ConfigurationTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticbeanstalk.ConfigurationTemplate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticbeanstalk.Environment")
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
  /* static members */
  object Environment {
    
    /**
      * Get an existing Environment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticbeanstalk.Environment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.environmentMod.Environment = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.Environment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.environmentMod.Environment = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.Environment.get")
    @js.native
    def get(name: String, id: Input[ID], state: EnvironmentState): typings.pulumiAws.environmentMod.Environment = js.native
    @JSImport("@pulumi/aws", "elasticbeanstalk.Environment.get")
    @js.native
    def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): typings.pulumiAws.environmentMod.Environment = js.native
    
    /**
      * Returns true if the given object is an instance of Environment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticbeanstalk.Environment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticbeanstalk.getApplication")
  @js.native
  def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] = js.native
  @JSImport("@pulumi/aws", "elasticbeanstalk.getApplication")
  @js.native
  def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] = js.native
  
  @JSImport("@pulumi/aws", "elasticbeanstalk.getHostedZone")
  @js.native
  def getHostedZone(): js.Promise[GetHostedZoneResult] = js.native
  @JSImport("@pulumi/aws", "elasticbeanstalk.getHostedZone")
  @js.native
  def getHostedZone(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetHostedZoneResult] = js.native
  @JSImport("@pulumi/aws", "elasticbeanstalk.getHostedZone")
  @js.native
  def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] = js.native
  @JSImport("@pulumi/aws", "elasticbeanstalk.getHostedZone")
  @js.native
  def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] = js.native
  
  @JSImport("@pulumi/aws", "elasticbeanstalk.getSolutionStack")
  @js.native
  def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] = js.native
  @JSImport("@pulumi/aws", "elasticbeanstalk.getSolutionStack")
  @js.native
  def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] = js.native
}
