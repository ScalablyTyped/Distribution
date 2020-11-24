package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamHttpEndpointConfiguration extends js.Object {
  
  /**
    * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
    */
  var accessKey: js.UndefOr[String] = js.native
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
    */
  var bufferingInterval: js.UndefOr[Double] = js.native
  
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
    */
  var bufferingSize: js.UndefOr[Double] = js.native
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions = js.native
  
  /**
    * The HTTP endpoint name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration] = js.native
  
  /**
    * The request configuration.  More details are given below.
    */
  var requestConfiguration: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration = js.native
  
  /**
    * Total amount of seconds Firehose spends on retries. This duration starts after the initial attempt fails, It does not include the time periods during which Firehose waits for acknowledgment from the specified destination after each attempt. Valid values between `0` and `7200`. Default is `300`.
    */
  var retryDuration: js.UndefOr[Double] = js.native
  
  /**
    * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs. The pattern needs to be `arn:.*`.
    */
  var roleArn: js.UndefOr[String] = js.native
  
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[String] = js.native
  
  /**
    * The HTTP endpoint URL to which Kinesis Firehose sends your data.
    */
  var url: String = js.native
}
object FirehoseDeliveryStreamHttpEndpointConfiguration {
  
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions,
    requestConfiguration: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration,
    url: String
  ): FirehoseDeliveryStreamHttpEndpointConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], requestConfiguration = requestConfiguration.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamHttpEndpointConfigurationOps[Self <: FirehoseDeliveryStreamHttpEndpointConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchLoggingOptions(value: FirehoseDeliveryStreamHttpEndpointConfigurationCloudwatchLoggingOptions): Self = this.set("cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestConfiguration(value: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration): Self = this.set("requestConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    
    @scala.inline
    def setBufferingInterval(value: Double): Self = this.set("bufferingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferingInterval: Self = this.set("bufferingInterval", js.undefined)
    
    @scala.inline
    def setBufferingSize(value: Double): Self = this.set("bufferingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferingSize: Self = this.set("bufferingSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration): Self = this.set("processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("processingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Double): Self = this.set("retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDuration: Self = this.set("retryDuration", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: String): Self = this.set("s3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupMode: Self = this.set("s3BackupMode", js.undefined)
  }
}
