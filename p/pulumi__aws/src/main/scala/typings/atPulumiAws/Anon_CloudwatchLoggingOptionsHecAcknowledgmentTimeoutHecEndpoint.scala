package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint extends js.Object {
  var cloudwatchLoggingOptions: js.UndefOr[Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var hecAcknowledgmentTimeout: js.UndefOr[Input[Double]] = js.undefined
  var hecEndpoint: Input[String]
  var hecEndpointType: js.UndefOr[Input[String]] = js.undefined
  var hecToken: Input[String]
  var processingConfiguration: js.UndefOr[Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var retryDuration: js.UndefOr[Input[Double]] = js.undefined
  var s3BackupMode: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint {
  @scala.inline
  def apply(
    hecEndpoint: Input[String],
    hecToken: Input[String],
    cloudwatchLoggingOptions: Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    hecAcknowledgmentTimeout: Input[Double] = null,
    hecEndpointType: Input[String] = null,
    processingConfiguration: Input[Anon_EnabledProcessorsAnonParametersType] = null,
    retryDuration: Input[Double] = null,
    s3BackupMode: Input[String] = null
  ): Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint = {
    val __obj = js.Dynamic.literal(hecEndpoint = hecEndpoint.asInstanceOf[js.Any], hecToken = hecToken.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (hecAcknowledgmentTimeout != null) __obj.updateDynamic("hecAcknowledgmentTimeout")(hecAcknowledgmentTimeout.asInstanceOf[js.Any])
    if (hecEndpointType != null) __obj.updateDynamic("hecEndpointType")(hecEndpointType.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint]
  }
}

