package typings.atPulumiAws.kinesisMod

import typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamArgs
import typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis", "FirehoseDeliveryStream")
@js.native
class FirehoseDeliveryStream protected ()
  extends typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream {
  /**
    * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FirehoseDeliveryStreamArgs) = this()
  def this(name: String, args: FirehoseDeliveryStreamArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/kinesis", "FirehoseDeliveryStream")
@js.native
object FirehoseDeliveryStream extends js.Object {
  /**
    * Get an existing FirehoseDeliveryStream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState): typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState, opts: CustomResourceOptions): typings.atPulumiAws.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  /**
    * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean = js.native
}

