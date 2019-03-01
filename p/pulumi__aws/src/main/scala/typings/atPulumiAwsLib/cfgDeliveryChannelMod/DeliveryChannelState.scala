package typings
package atPulumiAwsLib.cfgDeliveryChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryChannelState extends js.Object {
  /**
    * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the S3 bucket used to store the configuration history.
    */
  val s3BucketName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The prefix for the specified S3 bucket.
    */
  val s3KeyPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Options for how AWS Config delivers configuration snapshots. See below
    */
  val snapshotDeliveryProperties: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeliveryFrequencyInput]] = js.undefined
  /**
    * The ARN of the SNS topic that AWS Config delivers notifications to.
    */
  val snsTopicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DeliveryChannelState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3BucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3KeyPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    snapshotDeliveryProperties: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeliveryFrequencyInput] = null,
    snsTopicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): DeliveryChannelState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    if (snapshotDeliveryProperties != null) __obj.updateDynamic("snapshotDeliveryProperties")(snapshotDeliveryProperties.asInstanceOf[js.Any])
    if (snsTopicArn != null) __obj.updateDynamic("snsTopicArn")(snsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryChannelState]
  }
}

