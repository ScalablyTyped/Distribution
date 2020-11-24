package typings.pulumiAws.opsworksApplicationMod

import typings.pulumiAws.inputMod.opsworks.ApplicationAppSource
import typings.pulumiAws.inputMod.opsworks.ApplicationEnvironment
import typings.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationArgs extends js.Object {
  
  /**
    * SCM configuration of the app as described below.
    */
  val appSources: js.UndefOr[Input[js.Array[Input[ApplicationAppSource]]]] = js.native
  
  /**
    * Run bundle install when deploying for application of type `rails`.
    */
  val autoBundleOnDeploy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specify activity and workflow workers for your app using the aws-flow gem.
    */
  val awsFlowRubySettings: js.UndefOr[Input[String]] = js.native
  
  /**
    * The data source's ARN.
    */
  val dataSourceArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The database name.
    */
  val dataSourceDatabaseName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
    */
  val dataSourceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * A description of the app.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Subfolder for the document root for application of type `rails`.
    */
  val documentRoot: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of virtual host alias.
    */
  val domains: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
    */
  val enableSsl: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Object to define environment variables.  Object is described below.
    */
  val environments: js.UndefOr[Input[js.Array[Input[ApplicationEnvironment]]]] = js.native
  
  /**
    * A human-readable name for the application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the Rails environment for application of type `rails`.
    */
  val railsEnv: js.UndefOr[Input[String]] = js.native
  
  /**
    * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
    */
  val shortName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The SSL configuration of the app. Object is described below.
    */
  val sslConfigurations: js.UndefOr[Input[js.Array[Input[ApplicationSslConfiguration]]]] = js.native
  
  /**
    * The id of the stack the application will belong to.
    */
  val stackId: Input[String] = js.native
  
  /**
    * Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
    */
  val `type`: Input[String] = js.native
}
object ApplicationArgs {
  
  @scala.inline
  def apply(stackId: Input[String], `type`: Input[String]): ApplicationArgs = {
    val __obj = js.Dynamic.literal(stackId = stackId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationArgs]
  }
  
  @scala.inline
  implicit class ApplicationArgsOps[Self <: ApplicationArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStackId(value: Input[String]): Self = this.set("stackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppSourcesVarargs(value: Input[ApplicationAppSource]*): Self = this.set("appSources", js.Array(value :_*))
    
    @scala.inline
    def setAppSources(value: Input[js.Array[Input[ApplicationAppSource]]]): Self = this.set("appSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppSources: Self = this.set("appSources", js.undefined)
    
    @scala.inline
    def setAutoBundleOnDeploy(value: Input[String]): Self = this.set("autoBundleOnDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBundleOnDeploy: Self = this.set("autoBundleOnDeploy", js.undefined)
    
    @scala.inline
    def setAwsFlowRubySettings(value: Input[String]): Self = this.set("awsFlowRubySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsFlowRubySettings: Self = this.set("awsFlowRubySettings", js.undefined)
    
    @scala.inline
    def setDataSourceArn(value: Input[String]): Self = this.set("dataSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceArn: Self = this.set("dataSourceArn", js.undefined)
    
    @scala.inline
    def setDataSourceDatabaseName(value: Input[String]): Self = this.set("dataSourceDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceDatabaseName: Self = this.set("dataSourceDatabaseName", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: Input[String]): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocumentRoot(value: Input[String]): Self = this.set("documentRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentRoot: Self = this.set("documentRoot", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: Input[String]*): Self = this.set("domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: Input[js.Array[Input[String]]]): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    
    @scala.inline
    def setEnableSsl(value: Input[Boolean]): Self = this.set("enableSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSsl: Self = this.set("enableSsl", js.undefined)
    
    @scala.inline
    def setEnvironmentsVarargs(value: Input[ApplicationEnvironment]*): Self = this.set("environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: Input[js.Array[Input[ApplicationEnvironment]]]): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRailsEnv(value: Input[String]): Self = this.set("railsEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRailsEnv: Self = this.set("railsEnv", js.undefined)
    
    @scala.inline
    def setShortName(value: Input[String]): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    
    @scala.inline
    def setSslConfigurationsVarargs(value: Input[ApplicationSslConfiguration]*): Self = this.set("sslConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setSslConfigurations(value: Input[js.Array[Input[ApplicationSslConfiguration]]]): Self = this.set("sslConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslConfigurations: Self = this.set("sslConfigurations", js.undefined)
  }
}
