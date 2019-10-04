package typings.atPulumiAws.sesEventDestinationMod

import typings.atPulumiAws.typesOutputMod.sesNs.EventDestinationCloudwatchDestination
import typings.atPulumiAws.typesOutputMod.sesNs.EventDestinationKinesisDestination
import typings.atPulumiAws.typesOutputMod.sesNs.EventDestinationSnsDestination
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/eventDestination", "EventDestination")
@js.native
class EventDestination protected () extends CustomResource {
  /**
    * Create a EventDestination resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventDestinationArgs) = this()
  def this(name: String, args: EventDestinationArgs, opts: CustomResourceOptions) = this()
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: Output[js.UndefOr[js.Array[EventDestinationCloudwatchDestination]]] = js.native
  /**
    * The name of the configuration set
    */
  val configurationSetName: Output[String] = js.native
  /**
    * If true, the event destination will be enabled
    */
  val enabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Send the events to a kinesis firehose destination
    */
  val kinesisDestination: Output[js.UndefOr[EventDestinationKinesisDestination]] = js.native
  /**
    * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
    */
  val matchingTypes: Output[js.Array[String]] = js.native
  /**
    * The name of the event destination
    */
  val name: Output[String] = js.native
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: Output[js.UndefOr[EventDestinationSnsDestination]] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): EventDestination = js.native
  def get(name: String, id: Input[ID], state: EventDestinationState): EventDestination = js.native
  def get(name: String, id: Input[ID], state: EventDestinationState, opts: CustomResourceOptions): EventDestination = js.native
  /**
    * Returns true if the given object is an instance of EventDestination.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean = js.native
}

