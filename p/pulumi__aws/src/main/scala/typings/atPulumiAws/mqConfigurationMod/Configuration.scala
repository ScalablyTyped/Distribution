package typings.atPulumiAws.mqConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mq/configuration", "Configuration")
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
    * The ARN of the configuration.
    */
  val arn: Output[String] = js.native
  /**
    * The broker configuration in XML format.
    * See [official docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/amazon-mq-broker-configuration-parameters.html)
    * for supported parameters and format of the XML.
    */
  val data: Output[String] = js.native
  /**
    * The description of the configuration.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The type of broker engine.
    */
  val engineType: Output[String] = js.native
  /**
    * The version of the broker engine.
    */
  val engineVersion: Output[String] = js.native
  /**
    * The latest revision of the configuration.
    */
  val latestRevision: Output[Double] = js.native
  /**
    * The name of the configuration
    */
  val name: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/mq/configuration", "Configuration")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean = js.native
}

