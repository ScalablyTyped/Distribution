package typings
package atPulumiAwsLib.sesEventDestinationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/eventDestination", "EventDestination")
@js.native
class EventDestination protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a EventDestination resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: EventDestinationArgs) = this()
  def this(name: java.lang.String, args: EventDestinationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_DimensionNameDefaultValue]]] = js.native
  /**
    * The name of the configuration set
    */
  val configurationSetName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * If true, the event destination will be enabled
    */
  val enabled: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Send the events to a kinesis firehose destination
    */
  val kinesisDestination: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_RoleArnStreamArnString]] = js.native
  /**
    * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
    */
  val matchingTypes: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The name of the event destination
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_TopicArnString]] = js.native
}

@JSImport("@pulumi/aws/ses/eventDestination", "EventDestination")
@js.native
object EventDestination extends js.Object {
  /**
    * Get an existing EventDestination resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sesEventDestinationMod.EventDestination = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesEventDestinationMod.EventDestinationState
  ): atPulumiAwsLib.sesEventDestinationMod.EventDestination = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesEventDestinationMod.EventDestinationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sesEventDestinationMod.EventDestination = js.native
}

