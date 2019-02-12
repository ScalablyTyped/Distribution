package typings
package atPulumiAwsLib.pinpointEventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/eventStream", "EventStream")
@js.native
class EventStream protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a EventStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: EventStreamArgs) = this()
  def this(name: java.lang.String, args: EventStreamArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    */
  val destinationStreamArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  val roleArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/eventStream", "EventStream")
@js.native
object EventStream extends js.Object {
  /**
    * Get an existing EventStream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.pinpointEventStreamMod.EventStream = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointEventStreamMod.EventStreamState
  ): atPulumiAwsLib.pinpointEventStreamMod.EventStream = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointEventStreamMod.EventStreamState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.pinpointEventStreamMod.EventStream = js.native
}

