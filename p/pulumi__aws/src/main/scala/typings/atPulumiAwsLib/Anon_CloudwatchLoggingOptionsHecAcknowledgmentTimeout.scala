package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeout extends js.Object {
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var hecAcknowledgmentTimeout: js.UndefOr[scala.Double] = js.undefined
  var hecEndpoint: java.lang.String
  var hecEndpointType: js.UndefOr[java.lang.String] = js.undefined
  var hecToken: java.lang.String
  var processingConfiguration: js.UndefOr[Anon_EnabledProcessors] = js.undefined
  var retryDuration: js.UndefOr[scala.Double] = js.undefined
  var s3BackupMode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeout {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: Anon_EnabledLogGroupName,
    hecEndpoint: java.lang.String,
    hecToken: java.lang.String,
    hecAcknowledgmentTimeout: scala.Int | scala.Double = null,
    hecEndpointType: java.lang.String = null,
    processingConfiguration: Anon_EnabledProcessors = null,
    retryDuration: scala.Int | scala.Double = null,
    s3BackupMode: java.lang.String = null
  ): Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeout = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions, hecEndpoint = hecEndpoint, hecToken = hecToken)
    if (hecAcknowledgmentTimeout != null) __obj.updateDynamic("hecAcknowledgmentTimeout")(hecAcknowledgmentTimeout.asInstanceOf[js.Any])
    if (hecEndpointType != null) __obj.updateDynamic("hecEndpointType")(hecEndpointType)
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration)
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode)
    __obj.asInstanceOf[Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeout]
  }
}

