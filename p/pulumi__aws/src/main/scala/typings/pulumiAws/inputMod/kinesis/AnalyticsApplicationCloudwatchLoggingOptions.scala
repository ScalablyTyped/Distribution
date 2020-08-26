package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationCloudwatchLoggingOptions extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the CloudWatch Log Stream.
    */
  var logStreamArn: Input[String] = js.native
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: Input[String] = js.native
}

object AnalyticsApplicationCloudwatchLoggingOptions {
  @scala.inline
  def apply(logStreamArn: Input[String], roleArn: Input[String]): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
  @scala.inline
  implicit class AnalyticsApplicationCloudwatchLoggingOptionsOps[Self <: AnalyticsApplicationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
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
    def setLogStreamArn(value: Input[String]): Self = this.set("logStreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

