package typings
package atPulumiAwsLib.opsworksApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationArgs extends js.Object {
  /**
    * SCM configuration of the app as described below.
    */
  val appSources: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PasswordRevisionSshKey]]
    ]
  ] = js.undefined
  /**
    * Run bundle install when deploying for application of type `rails`.
    */
  val autoBundleOnDeploy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specify activity and workflow workers for your app using the aws-flow gem.
    */
  val awsFlowRubySettings: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The data source's ARN.
    */
  val dataSourceArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The database name.
    */
  val dataSourceDatabaseName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
    */
  val dataSourceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A description of the app.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Subfolder for the document root for application of type `rails`.
    */
  val documentRoot: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of virtual host alias.
    */
  val domains: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
    */
  val enableSsl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Object to define environment variables.  Object is described below.
    */
  val environments: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeySecureValue]]]
  ] = js.undefined
  /**
    * A human-readable name for the application.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Rails environment for application of type `rails`.
    */
  val railsEnv: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
    */
  val shortName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The SSL configuration of the app. Object is described below.
    */
  val sslConfigurations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CertificateChainPrivateKey]
      ]
    ]
  ] = js.undefined
  /**
    * The id of the stack the application will belong to.
    */
  val stackId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The type of source to use. For example, "archive".
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ApplicationArgs {
  @scala.inline
  def apply(
    stackId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    appSources: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PasswordRevisionSshKey]]
    ] = null,
    autoBundleOnDeploy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    awsFlowRubySettings: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dataSourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dataSourceDatabaseName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dataSourceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    documentRoot: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    domains: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    enableSsl: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    environments: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeySecureValue]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    railsEnv: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    shortName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sslConfigurations: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CertificateChainPrivateKey]
      ]
    ] = null
  ): ApplicationArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
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

