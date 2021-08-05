package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamHttpEndpointConfiguration extends StObject {
  
  /**
    * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
    */
  var accessKey: js.UndefOr[String] = js.undefined
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
    */
  var bufferingInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
    */
  var bufferingSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions
  
  /**
    * The HTTP endpoint name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration] = js.undefined
  
  /**
    * The request configuration.  More details are given below.
    */
  var requestConfiguration: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration
  
  /**
    * Total amount of seconds Firehose spends on retries. This duration starts after the initial attempt fails, It does not include the time periods during which Firehose waits for acknowledgment from the specified destination after each attempt. Valid values between `0` and `7200`. Default is `300`.
    */
  var retryDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs. The pattern needs to be `arn:.*`.
    */
  var roleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP endpoint URL to which Kinesis Firehose sends your data.
    */
  var url: String
}
object FirehoseDeliveryStreamHttpEndpointConfiguration {
  
  inline def apply(
    cloudwatchLoggingOptions: FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions,
    requestConfiguration: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration,
    url: String
  ): FirehoseDeliveryStreamHttpEndpointConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], requestConfiguration = requestConfiguration.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfiguration]
  }
  
  extension [Self <: FirehoseDeliveryStreamHttpEndpointConfiguration](x: Self) {
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setBufferingInterval(value: Double): Self = StObject.set(x, "bufferingInterval", value.asInstanceOf[js.Any])
    
    inline def setBufferingIntervalUndefined: Self = StObject.set(x, "bufferingInterval", js.undefined)
    
    inline def setBufferingSize(value: Double): Self = StObject.set(x, "bufferingSize", value.asInstanceOf[js.Any])
    
    inline def setBufferingSizeUndefined: Self = StObject.set(x, "bufferingSize", js.undefined)
    
    inline def setCloudwatchLoggingOptions(value: FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProcessingConfiguration(value: FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    inline def setRequestConfiguration(value: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration): Self = StObject.set(x, "requestConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRetryDuration(value: Double): Self = StObject.set(x, "retryDuration", value.asInstanceOf[js.Any])
    
    inline def setRetryDurationUndefined: Self = StObject.set(x, "retryDuration", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setS3BackupMode(value: String): Self = StObject.set(x, "s3BackupMode", value.asInstanceOf[js.Any])
    
    inline def setS3BackupModeUndefined: Self = StObject.set(x, "s3BackupMode", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
