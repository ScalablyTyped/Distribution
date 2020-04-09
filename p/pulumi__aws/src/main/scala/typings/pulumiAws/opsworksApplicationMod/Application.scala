package typings.pulumiAws.opsworksApplicationMod

import typings.pulumiAws.outputMod.opsworks.ApplicationAppSource
import typings.pulumiAws.outputMod.opsworks.ApplicationEnvironment
import typings.pulumiAws.outputMod.opsworks.ApplicationSslConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def get(name: String, id: Input[ID]): Application = js.native
  def get(name: String, id: Input[ID], state: ApplicationState): Application = js.native
  def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): Application = js.native
  /**
    * Returns true if the given object is an instance of Application.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ Boolean = js.native
}

