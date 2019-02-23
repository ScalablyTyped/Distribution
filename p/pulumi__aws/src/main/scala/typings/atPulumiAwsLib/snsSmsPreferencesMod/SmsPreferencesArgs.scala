package typings
package atPulumiAwsLib.snsSmsPreferencesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsPreferencesArgs extends js.Object {
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

