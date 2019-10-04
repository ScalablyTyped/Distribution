package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions extends js.Object {
  /**
    * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The CloudWatch group name for logging. This value is required if `enabled` is true.
    */
  var logGroupName: js.UndefOr[String] = js.undefined
  /**
    * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
    */
  var logStreamName: js.UndefOr[String] = js.undefined
}

object FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    logGroupName: String = null,
    logStreamName: String = null
  ): FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName)
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions]
  }
}

