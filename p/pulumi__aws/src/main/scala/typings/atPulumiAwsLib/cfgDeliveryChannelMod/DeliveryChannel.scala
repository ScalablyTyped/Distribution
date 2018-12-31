package typings
package atPulumiAwsLib.cfgDeliveryChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel")
@js.native
class DeliveryChannel protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a DeliveryChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DeliveryChannelArgs) = this()
  def this(name: java.lang.String, args: DeliveryChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the S3 bucket used to store the configuration history.
    */
  val s3BucketName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The prefix for the specified S3 bucket.
    */
  val s3KeyPrefix: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Options for how AWS Config delivers configuration snapshots. See below
    */
  val snapshotDeliveryProperties: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_DeliveryFrequencyString]] = js.native
  /**
    * The ARN of the SNS topic that AWS Config delivers notifications to.
    */
  val snsTopicArn: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

@JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel")
@js.native
object DeliveryChannel extends js.Object {
  /**
    * Get an existing DeliveryChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelState
  ): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
}

