package typings.pulumiAws

import typings.pulumiAws.outputMod.opsworks.ApplicationAppSource
import typings.pulumiAws.outputMod.opsworks.ApplicationEnvironment
import typings.pulumiAws.outputMod.opsworks.ApplicationSslConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opsworksApplicationMod {
  
  @JSImport("@pulumi/aws/opsworks/application", "Application")
  @js.native
  class Application protected () extends CustomResource {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * SCM configuration of the app as described below.
      */
    val appSources: Output_[js.Array[ApplicationAppSource]] = js.native
    
    /**
      * Run bundle install when deploying for application of type `rails`.
      */
    val autoBundleOnDeploy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specify activity and workflow workers for your app using the aws-flow gem.
      */
    val awsFlowRubySettings: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The data source's ARN.
      */
    val dataSourceArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The database name.
      */
    val dataSourceDatabaseName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
      */
    val dataSourceType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A description of the app.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Subfolder for the document root for application of type `rails`.
      */
    val documentRoot: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of virtual host alias.
      */
    val domains: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
      */
    val enableSsl: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Object to define environment variables.  Object is described below.
      */
    val environments: Output_[js.UndefOr[js.Array[ApplicationEnvironment]]] = js.native
    
    /**
      * A human-readable name for the application.
      */
    val name: Output_[String] = js.native
    
    /**
      * The name of the Rails environment for application of type `rails`.
      */
    val railsEnv: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
      */
    val shortName: Output_[String] = js.native
    
    /**
      * The SSL configuration of the app. Object is described below.
      */
    val sslConfigurations: Output_[js.UndefOr[js.Array[ApplicationSslConfiguration]]] = js.native
    
    /**
      * The id of the stack the application will belong to.
      */
    val stackId: Output_[String] = js.native
    
    /**
      * Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object Application {
    
    @JSImport("@pulumi/aws/opsworks/application", "Application")
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
    inline def get(name: String, id: Input[ID]): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Application]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Application]
    inline def get(name: String, id: Input[ID], state: ApplicationState): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Application]
    inline def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Application]
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ Boolean]
  }
  
  trait ApplicationArgs extends StObject {
    
    /**
      * SCM configuration of the app as described below.
      */
    val appSources: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationAppSource]]]] = js.undefined
    
    /**
      * Run bundle install when deploying for application of type `rails`.
      */
    val autoBundleOnDeploy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify activity and workflow workers for your app using the aws-flow gem.
      */
    val awsFlowRubySettings: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The data source's ARN.
      */
    val dataSourceArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The database name.
      */
    val dataSourceDatabaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
      */
    val dataSourceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the app.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Subfolder for the document root for application of type `rails`.
      */
    val documentRoot: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of virtual host alias.
      */
    val domains: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
      */
    val enableSsl: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Object to define environment variables.  Object is described below.
      */
    val environments: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationEnvironment]]]
      ] = js.undefined
    
    /**
      * A human-readable name for the application.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Rails environment for application of type `rails`.
      */
    val railsEnv: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
      */
    val shortName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The SSL configuration of the app. Object is described below.
      */
    val sslConfigurations: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration]]]
      ] = js.undefined
    
    /**
      * The id of the stack the application will belong to.
      */
    val stackId: Input[String]
    
    /**
      * Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
      */
    val `type`: Input[String]
  }
  object ApplicationArgs {
    
    inline def apply(stackId: Input[String], `type`: Input[String]): ApplicationArgs = {
      val __obj = js.Dynamic.literal(stackId = stackId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationArgs]
    }
    
    extension [Self <: ApplicationArgs](x: Self) {
      
      inline def setAppSources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationAppSource]]]): Self = StObject.set(x, "appSources", value.asInstanceOf[js.Any])
      
      inline def setAppSourcesUndefined: Self = StObject.set(x, "appSources", js.undefined)
      
      inline def setAppSourcesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.ApplicationAppSource]*): Self = StObject.set(x, "appSources", js.Array(value :_*))
      
      inline def setAutoBundleOnDeploy(value: Input[String]): Self = StObject.set(x, "autoBundleOnDeploy", value.asInstanceOf[js.Any])
      
      inline def setAutoBundleOnDeployUndefined: Self = StObject.set(x, "autoBundleOnDeploy", js.undefined)
      
      inline def setAwsFlowRubySettings(value: Input[String]): Self = StObject.set(x, "awsFlowRubySettings", value.asInstanceOf[js.Any])
      
      inline def setAwsFlowRubySettingsUndefined: Self = StObject.set(x, "awsFlowRubySettings", js.undefined)
      
      inline def setDataSourceArn(value: Input[String]): Self = StObject.set(x, "dataSourceArn", value.asInstanceOf[js.Any])
      
      inline def setDataSourceArnUndefined: Self = StObject.set(x, "dataSourceArn", js.undefined)
      
      inline def setDataSourceDatabaseName(value: Input[String]): Self = StObject.set(x, "dataSourceDatabaseName", value.asInstanceOf[js.Any])
      
      inline def setDataSourceDatabaseNameUndefined: Self = StObject.set(x, "dataSourceDatabaseName", js.undefined)
      
      inline def setDataSourceType(value: Input[String]): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
      
      inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDocumentRoot(value: Input[String]): Self = StObject.set(x, "documentRoot", value.asInstanceOf[js.Any])
      
      inline def setDocumentRootUndefined: Self = StObject.set(x, "documentRoot", js.undefined)
      
      inline def setDomains(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      inline def setDomainsVarargs(value: Input[String]*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      inline def setEnableSsl(value: Input[Boolean]): Self = StObject.set(x, "enableSsl", value.asInstanceOf[js.Any])
      
      inline def setEnableSslUndefined: Self = StObject.set(x, "enableSsl", js.undefined)
      
      inline def setEnvironments(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationEnvironment]]]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
      
      inline def setEnvironmentsVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.ApplicationEnvironment]*): Self = StObject.set(x, "environments", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRailsEnv(value: Input[String]): Self = StObject.set(x, "railsEnv", value.asInstanceOf[js.Any])
      
      inline def setRailsEnvUndefined: Self = StObject.set(x, "railsEnv", js.undefined)
      
      inline def setShortName(value: Input[String]): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      inline def setSslConfigurations(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration]]]): Self = StObject.set(x, "sslConfigurations", value.asInstanceOf[js.Any])
      
      inline def setSslConfigurationsUndefined: Self = StObject.set(x, "sslConfigurations", js.undefined)
      
      inline def setSslConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration]*): Self = StObject.set(x, "sslConfigurations", js.Array(value :_*))
      
      inline def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplicationState extends StObject {
    
    /**
      * SCM configuration of the app as described below.
      */
    val appSources: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationAppSource]]]] = js.undefined
    
    /**
      * Run bundle install when deploying for application of type `rails`.
      */
    val autoBundleOnDeploy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify activity and workflow workers for your app using the aws-flow gem.
      */
    val awsFlowRubySettings: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The data source's ARN.
      */
    val dataSourceArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The database name.
      */
    val dataSourceDatabaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
      */
    val dataSourceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the app.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Subfolder for the document root for application of type `rails`.
      */
    val documentRoot: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of virtual host alias.
      */
    val domains: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
      */
    val enableSsl: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Object to define environment variables.  Object is described below.
      */
    val environments: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationEnvironment]]]
      ] = js.undefined
    
    /**
      * A human-readable name for the application.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Rails environment for application of type `rails`.
      */
    val railsEnv: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
      */
    val shortName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The SSL configuration of the app. Object is described below.
      */
    val sslConfigurations: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration]]]
      ] = js.undefined
    
    /**
      * The id of the stack the application will belong to.
      */
    val stackId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object ApplicationState {
    
    inline def apply(): ApplicationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationState]
    }
    
    extension [Self <: ApplicationState](x: Self) {
      
      inline def setAppSources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationAppSource]]]): Self = StObject.set(x, "appSources", value.asInstanceOf[js.Any])
      
      inline def setAppSourcesUndefined: Self = StObject.set(x, "appSources", js.undefined)
      
      inline def setAppSourcesVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.ApplicationAppSource]*): Self = StObject.set(x, "appSources", js.Array(value :_*))
      
      inline def setAutoBundleOnDeploy(value: Input[String]): Self = StObject.set(x, "autoBundleOnDeploy", value.asInstanceOf[js.Any])
      
      inline def setAutoBundleOnDeployUndefined: Self = StObject.set(x, "autoBundleOnDeploy", js.undefined)
      
      inline def setAwsFlowRubySettings(value: Input[String]): Self = StObject.set(x, "awsFlowRubySettings", value.asInstanceOf[js.Any])
      
      inline def setAwsFlowRubySettingsUndefined: Self = StObject.set(x, "awsFlowRubySettings", js.undefined)
      
      inline def setDataSourceArn(value: Input[String]): Self = StObject.set(x, "dataSourceArn", value.asInstanceOf[js.Any])
      
      inline def setDataSourceArnUndefined: Self = StObject.set(x, "dataSourceArn", js.undefined)
      
      inline def setDataSourceDatabaseName(value: Input[String]): Self = StObject.set(x, "dataSourceDatabaseName", value.asInstanceOf[js.Any])
      
      inline def setDataSourceDatabaseNameUndefined: Self = StObject.set(x, "dataSourceDatabaseName", js.undefined)
      
      inline def setDataSourceType(value: Input[String]): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
      
      inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDocumentRoot(value: Input[String]): Self = StObject.set(x, "documentRoot", value.asInstanceOf[js.Any])
      
      inline def setDocumentRootUndefined: Self = StObject.set(x, "documentRoot", js.undefined)
      
      inline def setDomains(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      inline def setDomainsVarargs(value: Input[String]*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      inline def setEnableSsl(value: Input[Boolean]): Self = StObject.set(x, "enableSsl", value.asInstanceOf[js.Any])
      
      inline def setEnableSslUndefined: Self = StObject.set(x, "enableSsl", js.undefined)
      
      inline def setEnvironments(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationEnvironment]]]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
      
      inline def setEnvironmentsVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.ApplicationEnvironment]*): Self = StObject.set(x, "environments", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRailsEnv(value: Input[String]): Self = StObject.set(x, "railsEnv", value.asInstanceOf[js.Any])
      
      inline def setRailsEnvUndefined: Self = StObject.set(x, "railsEnv", js.undefined)
      
      inline def setShortName(value: Input[String]): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      inline def setSslConfigurations(value: Input[js.Array[Input[typings.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration]]]): Self = StObject.set(x, "sslConfigurations", value.asInstanceOf[js.Any])
      
      inline def setSslConfigurationsUndefined: Self = StObject.set(x, "sslConfigurations", js.undefined)
      
      inline def setSslConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration]*): Self = StObject.set(x, "sslConfigurations", js.Array(value :_*))
      
      inline def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
