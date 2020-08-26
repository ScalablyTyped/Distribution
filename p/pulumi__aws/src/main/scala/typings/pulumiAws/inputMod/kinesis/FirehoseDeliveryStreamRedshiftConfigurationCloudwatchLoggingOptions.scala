package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions extends js.Object {
  /**
    * Enables or disables the logging. Defaults to `false`.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The CloudWatch group name for logging. This value is required if `enabled` is true.
    */
  var logGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
    */
  var logStreamName: js.UndefOr[Input[String]] = js.native
}

object FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions {
  @scala.inline
  def apply(): FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsOps[Self <: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setLogGroupName(value: Input[String]): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    @scala.inline
    def setLogStreamName(value: Input[String]): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogStreamName: Self = this.set("logStreamName", js.undefined)
  }
  
}

