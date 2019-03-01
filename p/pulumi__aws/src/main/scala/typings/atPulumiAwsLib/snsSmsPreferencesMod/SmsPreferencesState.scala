package typings
package atPulumiAwsLib.snsSmsPreferencesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsPreferencesState extends js.Object {
  /**
    * A string, such as your business brand, that is displayed as the sender on the receiving device.
    */
  val defaultSenderId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
    */
  val defaultSmsType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
    */
  val deliveryStatusIamRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
    */
  val deliveryStatusSuccessSamplingRate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The maximum amount in USD that you are willing to spend each month to send SMS messages.
    */
  val monthlySpendLimit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
    */
  val usageReportS3Bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object SmsPreferencesState {
  @scala.inline
  def apply(
    defaultSenderId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultSmsType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    deliveryStatusIamRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    deliveryStatusSuccessSamplingRate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    monthlySpendLimit: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    usageReportS3Bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): SmsPreferencesState = {
    val __obj = js.Dynamic.literal()
    if (defaultSenderId != null) __obj.updateDynamic("defaultSenderId")(defaultSenderId.asInstanceOf[js.Any])
    if (defaultSmsType != null) __obj.updateDynamic("defaultSmsType")(defaultSmsType.asInstanceOf[js.Any])
    if (deliveryStatusIamRoleArn != null) __obj.updateDynamic("deliveryStatusIamRoleArn")(deliveryStatusIamRoleArn.asInstanceOf[js.Any])
    if (deliveryStatusSuccessSamplingRate != null) __obj.updateDynamic("deliveryStatusSuccessSamplingRate")(deliveryStatusSuccessSamplingRate.asInstanceOf[js.Any])
    if (monthlySpendLimit != null) __obj.updateDynamic("monthlySpendLimit")(monthlySpendLimit.asInstanceOf[js.Any])
    if (usageReportS3Bucket != null) __obj.updateDynamic("usageReportS3Bucket")(usageReportS3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsPreferencesState]
  }
}

