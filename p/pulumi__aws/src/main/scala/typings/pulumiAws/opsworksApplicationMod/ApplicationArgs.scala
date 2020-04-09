package typings.pulumiAws.opsworksApplicationMod

import typings.pulumiAws.inputMod.opsworks.ApplicationAppSource
import typings.pulumiAws.inputMod.opsworks.ApplicationEnvironment
import typings.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    stackId: Input[String],
    `type`: Input[String],
    appSources: Input[js.Array[Input[ApplicationAppSource]]] = null,
    autoBundleOnDeploy: Input[String] = null,
    awsFlowRubySettings: Input[String] = null,
    dataSourceArn: Input[String] = null,
    dataSourceDatabaseName: Input[String] = null,
    dataSourceType: Input[String] = null,
    description: Input[String] = null,
    documentRoot: Input[String] = null,
    domains: Input[js.Array[Input[String]]] = null,
    enableSsl: Input[Boolean] = null,
    environments: Input[js.Array[Input[ApplicationEnvironment]]] = null,
    name: Input[String] = null,
    railsEnv: Input[String] = null,
    shortName: Input[String] = null,
    sslConfigurations: Input[js.Array[Input[ApplicationSslConfiguration]]] = null
  ): ApplicationArgs = {
    val __obj = js.Dynamic.literal(stackId = stackId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appSources != null) __obj.updateDynamic("appSources")(appSources.asInstanceOf[js.Any])
    if (autoBundleOnDeploy != null) __obj.updateDynamic("autoBundleOnDeploy")(autoBundleOnDeploy.asInstanceOf[js.Any])
    if (awsFlowRubySettings != null) __obj.updateDynamic("awsFlowRubySettings")(awsFlowRubySettings.asInstanceOf[js.Any])
    if (dataSourceArn != null) __obj.updateDynamic("dataSourceArn")(dataSourceArn.asInstanceOf[js.Any])
    if (dataSourceDatabaseName != null) __obj.updateDynamic("dataSourceDatabaseName")(dataSourceDatabaseName.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (documentRoot != null) __obj.updateDynamic("documentRoot")(documentRoot.asInstanceOf[js.Any])
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (enableSsl != null) __obj.updateDynamic("enableSsl")(enableSsl.asInstanceOf[js.Any])
    if (environments != null) __obj.updateDynamic("environments")(environments.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (railsEnv != null) __obj.updateDynamic("railsEnv")(railsEnv.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (sslConfigurations != null) __obj.updateDynamic("sslConfigurations")(sslConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationArgs]
  }
}

