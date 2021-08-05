package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamSplunkConfiguration extends StObject {
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: js.UndefOr[Input[FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions]] = js.undefined
  
  /**
    * The amount of time, in seconds between 180 and 600, that Kinesis Firehose waits to receive an acknowledgment from Splunk after it sends it data.
    */
  var hecAcknowledgmentTimeout: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The HTTP Event Collector (HEC) endpoint to which Kinesis Firehose sends your data.
    */
  var hecEndpoint: Input[String]
  
  /**
    * The HEC endpoint type. Valid values are `Raw` or `Event`. The default value is `Raw`.
    */
  var hecEndpointType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var hecToken: Input[String]
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]] = js.undefined
  
  /**
    * After an initial failure to deliver to Splunk, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
    */
  var retryDuration: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[Input[String]] = js.undefined
}
object FirehoseDeliveryStreamSplunkConfiguration {
  
  inline def apply(hecEndpoint: Input[String], hecToken: Input[String]): FirehoseDeliveryStreamSplunkConfiguration = {
    val __obj = js.Dynamic.literal(hecEndpoint = hecEndpoint.asInstanceOf[js.Any], hecToken = hecToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfiguration]
  }
  
  extension [Self <: FirehoseDeliveryStreamSplunkConfiguration](x: Self) {
    
    inline def setCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions]): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
    
    inline def setHecAcknowledgmentTimeout(value: Input[Double]): Self = StObject.set(x, "hecAcknowledgmentTimeout", value.asInstanceOf[js.Any])
    
    inline def setHecAcknowledgmentTimeoutUndefined: Self = StObject.set(x, "hecAcknowledgmentTimeout", js.undefined)
    
    inline def setHecEndpoint(value: Input[String]): Self = StObject.set(x, "hecEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHecEndpointType(value: Input[String]): Self = StObject.set(x, "hecEndpointType", value.asInstanceOf[js.Any])
    
    inline def setHecEndpointTypeUndefined: Self = StObject.set(x, "hecEndpointType", js.undefined)
    
    inline def setHecToken(value: Input[String]): Self = StObject.set(x, "hecToken", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfiguration(value: Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    inline def setRetryDuration(value: Input[Double]): Self = StObject.set(x, "retryDuration", value.asInstanceOf[js.Any])
    
    inline def setRetryDurationUndefined: Self = StObject.set(x, "retryDuration", js.undefined)
    
    inline def setS3BackupMode(value: Input[String]): Self = StObject.set(x, "s3BackupMode", value.asInstanceOf[js.Any])
    
    inline def setS3BackupModeUndefined: Self = StObject.set(x, "s3BackupMode", js.undefined)
  }
}
