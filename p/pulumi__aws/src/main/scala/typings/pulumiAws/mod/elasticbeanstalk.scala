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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticbeanstalk {
  
  @JSImport("@pulumi/aws", "elasticbeanstalk")
  @js.native
  val ^ : js.Any = js.native
  
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Application {
    
    @JSImport("@pulumi/aws", "elasticbeanstalk.Application")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticbeanstalkApplicationMod.Application]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticbeanstalkApplicationMod.Application]
    inline def get(name: String, id: Input[ID], state: ApplicationState): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticbeanstalkApplicationMod.Application]
    inline def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typings.pulumiAws.elasticbeanstalkApplicationMod.Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticbeanstalkApplicationMod.Application]
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/application.Application */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/application.Application */ Boolean]
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
    
    @JSImport("@pulumi/aws", "elasticbeanstalk.ApplicationVersion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ApplicationVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.applicationVersionMod.ApplicationVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.applicationVersionMod.ApplicationVersion]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.applicationVersionMod.ApplicationVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.applicationVersionMod.ApplicationVersion]
    inline def get(name: String, id: Input[ID], state: ApplicationVersionState): typings.pulumiAws.applicationVersionMod.ApplicationVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.applicationVersionMod.ApplicationVersion]
    inline def get(name: String, id: Input[ID], state: ApplicationVersionState, opts: CustomResourceOptions): typings.pulumiAws.applicationVersionMod.ApplicationVersion = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.applicationVersionMod.ApplicationVersion]
    
    /**
      * Returns true if the given object is an instance of ApplicationVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ Boolean]
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
    
    @JSImport("@pulumi/aws", "elasticbeanstalk.ConfigurationTemplate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConfigurationTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate]
    inline def get(name: String, id: Input[ID], state: ConfigurationTemplateState): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate]
    inline def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationTemplateMod.ConfigurationTemplate]
    
    /**
      * Returns true if the given object is an instance of ConfigurationTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean]
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
    
    @JSImport("@pulumi/aws", "elasticbeanstalk.Environment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Environment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.environmentMod.Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.environmentMod.Environment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.environmentMod.Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.environmentMod.Environment]
    inline def get(name: String, id: Input[ID], state: EnvironmentState): typings.pulumiAws.environmentMod.Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.environmentMod.Environment]
    inline def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): typings.pulumiAws.environmentMod.Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.environmentMod.Environment]
    
    /**
      * Returns true if the given object is an instance of Environment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean]
  }
  
  inline def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplication")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetApplicationResult]]
  inline def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplication")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetApplicationResult]]
  
  inline def getHostedZone(): js.Promise[GetHostedZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZone")().asInstanceOf[js.Promise[GetHostedZoneResult]]
  inline def getHostedZone(args: Unit, opts: InvokeOptions): js.Promise[GetHostedZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetHostedZoneResult]]
  inline def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZone")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetHostedZoneResult]]
  inline def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetHostedZoneResult]]
  
  inline def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSolutionStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSolutionStackResult]]
  inline def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSolutionStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSolutionStackResult]]
}
