package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions extends js.Object {
  /**
    * Enables or disables the logging. Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The CloudWatch group name for logging. This value is required if `enabled` is true.
    */
  var logGroupName: js.UndefOr[String] = js.native
  /**
    * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
    */
  var logStreamName: js.UndefOr[String] = js.native
}

object FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    logGroupName: String = null,
    logStreamName: String = null
  ): FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions]
  }
}

