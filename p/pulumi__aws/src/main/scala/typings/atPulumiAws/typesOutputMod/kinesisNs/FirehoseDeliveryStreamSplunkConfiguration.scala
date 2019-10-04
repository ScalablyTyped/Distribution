package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamSplunkConfiguration extends js.Object {
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions
  /**
    * The amount of time, in seconds between 180 and 600, that Kinesis Firehose waits to receive an acknowledgment from Splunk after it sends it data.
    */
  var hecAcknowledgmentTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The HTTP Event Collector (HEC) endpoint to which Kinesis Firehose sends your data.
    */
  var hecEndpoint: String
  /**
    * The HEC endpoint type. Valid values are `Raw` or `Event`. The default value is `Raw`.
    */
  var hecEndpointType: js.UndefOr[String] = js.undefined
  /**
    * The GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var hecToken: String
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration] = js.undefined
  /**
    * After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
    */
  var retryDuration: js.UndefOr[Double] = js.undefined
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[String] = js.undefined
}

object FirehoseDeliveryStreamSplunkConfiguration {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions,
    hecEndpoint: String,
    hecToken: String,
    hecAcknowledgmentTimeout: Int | Double = null,
    hecEndpointType: String = null,
    processingConfiguration: FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration = null,
    retryDuration: Int | Double = null,
    s3BackupMode: String = null
  ): FirehoseDeliveryStreamSplunkConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions, hecEndpoint = hecEndpoint, hecToken = hecToken)
    if (hecAcknowledgmentTimeout != null) __obj.updateDynamic("hecAcknowledgmentTimeout")(hecAcknowledgmentTimeout.asInstanceOf[js.Any])
    if (hecEndpointType != null) __obj.updateDynamic("hecEndpointType")(hecEndpointType)
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration)
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode)
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfiguration]
  }
}

