package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions extends js.Object {
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

object FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions {
  @scala.inline
  def apply(
    enabled: Input[Boolean] = null,
    logGroupName: Input[String] = null,
    logStreamName: Input[String] = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions]
  }
}

