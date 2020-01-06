package typings.atPulumiAws.cfgDeliveryChannelMod

import typings.atPulumiAws.typesInputMod.cfg.DeliveryChannelSnapshotDeliveryProperties
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryChannelArgs extends js.Object {
  /**
    * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the S3 bucket used to store the configuration history.
    */
  val s3BucketName: Input[String] = js.native
  /**
    * The prefix for the specified S3 bucket.
    */
  val s3KeyPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Options for how AWS Config delivers configuration snapshots. See below
    */
  val snapshotDeliveryProperties: js.UndefOr[Input[DeliveryChannelSnapshotDeliveryProperties]] = js.native
  /**
    * The ARN of the SNS topic that AWS Config delivers notifications to.
    */
  val snsTopicArn: js.UndefOr[Input[String]] = js.native
}

object DeliveryChannelArgs {
  @scala.inline
  def apply(
    s3BucketName: Input[String],
    name: Input[String] = null,
    s3KeyPrefix: Input[String] = null,
    snapshotDeliveryProperties: Input[DeliveryChannelSnapshotDeliveryProperties] = null,
    snsTopicArn: Input[String] = null
  ): DeliveryChannelArgs = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    if (snapshotDeliveryProperties != null) __obj.updateDynamic("snapshotDeliveryProperties")(snapshotDeliveryProperties.asInstanceOf[js.Any])
    if (snsTopicArn != null) __obj.updateDynamic("snsTopicArn")(snsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryChannelArgs]
  }
}

