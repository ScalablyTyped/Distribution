package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamHttpEndpointConfiguration extends StObject {
  
  /**
    * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
    */
  var accessKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
    */
  var bufferingInterval: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
    */
  var bufferingSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: js.UndefOr[Input[FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions]] = js.native
  
  /**
    * The HTTP endpoint name.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration]] = js.native
  
  /**
    * The request configuration.  More details are given below.
    */
  var requestConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration]] = js.native
  
  /**
    * Total amount of seconds Firehose spends on retries. This duration starts after the initial attempt fails, It does not include the time periods during which Firehose waits for acknowledgment from the specified destination after each attempt. Valid values between `0` and `7200`. Default is `300`.
    */
  var retryDuration: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs. The pattern needs to be `arn:.*`.
    */
  var roleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The HTTP endpoint URL to which Kinesis Firehose sends your data.
    */
  var url: Input[String] = js.native
}
object FirehoseDeliveryStreamHttpEndpointConfiguration {
  
  @scala.inline
  def apply(url: Input[String]): FirehoseDeliveryStreamHttpEndpointConfiguration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamHttpEndpointConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamHttpEndpointConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKey(value: Input[String]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def setBufferingInterval(value: Input[Double]): Self = StObject.set(x, "bufferingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingIntervalUndefined: Self = StObject.set(x, "bufferingInterval", js.undefined)
    
    @scala.inline
    def setBufferingSize(value: Input[Double]): Self = StObject.set(x, "bufferingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingSizeUndefined: Self = StObject.set(x, "bufferingSize", js.undefined)
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions]): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: Input[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration]): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    @scala.inline
    def setRequestConfiguration(value: Input[FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration]): Self = StObject.set(x, "requestConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestConfigurationUndefined: Self = StObject.set(x, "requestConfiguration", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Input[Double]): Self = StObject.set(x, "retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDurationUndefined: Self = StObject.set(x, "retryDuration", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: Input[String]): Self = StObject.set(x, "s3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "s3BackupMode", js.undefined)
    
    @scala.inline
    def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
