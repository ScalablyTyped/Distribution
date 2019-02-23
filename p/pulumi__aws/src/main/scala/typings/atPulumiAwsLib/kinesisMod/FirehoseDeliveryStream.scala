package typings
package atPulumiAwsLib.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis", "FirehoseDeliveryStream")
@js.native
class FirehoseDeliveryStream protected ()
  extends atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream {
  /**
    * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamState
  ): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStreamState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.kinesisFirehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
}

