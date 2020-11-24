package typings.pulumiAws.smsPreferencesMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmsPreferencesArgs extends js.Object {
  
  /**
    * A string, such as your business brand, that is displayed as the sender on the receiving device.
    */
  val defaultSenderId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of SMS message that you will send by default. Possible values are: Promotional, Transactional
    */
  val defaultSmsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs.
    */
  val deliveryStatusIamRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value must be between 0 and 100.
    */
  val deliveryStatusSuccessSamplingRate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum amount in USD that you are willing to spend each month to send SMS messages.
    */
  val monthlySpendLimit: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS.
    */
  val usageReportS3Bucket: js.UndefOr[Input[String]] = js.native
}
object SmsPreferencesArgs {
  
  @scala.inline
  def apply(): SmsPreferencesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsPreferencesArgs]
  }
  
  @scala.inline
  implicit class SmsPreferencesArgsOps[Self <: SmsPreferencesArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultSenderId(value: Input[String]): Self = this.set("defaultSenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSenderId: Self = this.set("defaultSenderId", js.undefined)
    
    @scala.inline
    def setDefaultSmsType(value: Input[String]): Self = this.set("defaultSmsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSmsType: Self = this.set("defaultSmsType", js.undefined)
    
    @scala.inline
    def setDeliveryStatusIamRoleArn(value: Input[String]): Self = this.set("deliveryStatusIamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryStatusIamRoleArn: Self = this.set("deliveryStatusIamRoleArn", js.undefined)
    
    @scala.inline
    def setDeliveryStatusSuccessSamplingRate(value: Input[String]): Self = this.set("deliveryStatusSuccessSamplingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryStatusSuccessSamplingRate: Self = this.set("deliveryStatusSuccessSamplingRate", js.undefined)
    
    @scala.inline
    def setMonthlySpendLimit(value: Input[String]): Self = this.set("monthlySpendLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthlySpendLimit: Self = this.set("monthlySpendLimit", js.undefined)
    
    @scala.inline
    def setUsageReportS3Bucket(value: Input[String]): Self = this.set("usageReportS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageReportS3Bucket: Self = this.set("usageReportS3Bucket", js.undefined)
  }
}
