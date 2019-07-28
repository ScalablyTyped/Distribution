package typings.atPulumiAws.mskConfigurationMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/msk/configuration", "Configuration")
@js.native
class Configuration protected () extends CustomResource {
  /**
    * Create a Configuration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConfigurationArgs) = this()
  def this(name: String, args: ConfigurationArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: Output[String] = js.native
  /**
    * Description of the configuration.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: Output[js.Array[String]] = js.native
  /**
    * Latest revision of the configuration.
    */
  val latestRevision: Output[Double] = js.native
  /**
    * Name of the configuration.
    */
  val name: Output[String] = js.native
  /**
    * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
    */
  val serverProperties: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/msk/configuration", "Configuration")
@js.native
object Configuration extends js.Object {
  /**
    * Get an existing Configuration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Configuration = js.native
  def get(name: String, id: Input[ID], state: ConfigurationState): Configuration = js.native
  def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): Configuration = js.native
  /**
    * Returns true if the given object is an instance of Configuration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean = js.native
}

