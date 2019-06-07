package typings
package atPulumiAwsLib.opsworksApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/application", "Application")
@js.native
class Application protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Application resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ApplicationArgs) = this()
  def this(name: java.lang.String, args: ApplicationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * SCM configuration of the app as described below.
    */
  val appSources: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_PasswordRevision]] = js.native
  /**
    * Run bundle install when deploying for application of type `rails`.
    */
  val autoBundleOnDeploy: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specify activity and workflow workers for your app using the aws-flow gem.
    */
  val awsFlowRubySettings: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The data source's ARN.
    */
  val dataSourceArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The database name.
    */
  val dataSourceDatabaseName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
    */
  val dataSourceType: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A description of the app.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Subfolder for the document root for application of type `rails`.
    */
  val documentRoot: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of virtual host alias.
    */
  val domains: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
    */
  val enableSsl: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Object to define environment variables.  Object is described below.
    */
  val environments: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_KeySecure]]] = js.native
  /**
    * A human-readable name for the application.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the Rails environment for application of type `rails`.
    */
  val railsEnv: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
    */
  val shortName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The SSL configuration of the app. Object is described below.
    */
  val sslConfigurations: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_CertificateChain]]] = js.native
  /**
    * The id of the stack the application will belong to.
    */
  val stackId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type of source to use. For example, "archive".
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/opsworks/application", "Application")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksApplicationMod.Application = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksApplicationMod.ApplicationState
  ): atPulumiAwsLib.opsworksApplicationMod.Application = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksApplicationMod.ApplicationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksApplicationMod.Application = js.native
  /**
    * Returns true if the given object is an instance of Application.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ scala.Boolean = js.native
}

