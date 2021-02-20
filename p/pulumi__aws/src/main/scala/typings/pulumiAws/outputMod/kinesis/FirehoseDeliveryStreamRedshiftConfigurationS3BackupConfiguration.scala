package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration extends StObject {
  
  /**
    * The ARN of the S3 bucket
    */
  var bucketArn: String = js.native
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
    */
  var bufferInterval: js.UndefOr[Double] = js.native
  
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
    * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
    */
  var bufferSize: js.UndefOr[Double] = js.native
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions = js.native
  
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. Other supported values are GZIP, ZIP & Snappy. If the destination is redshift you cannot use ZIP or Snappy.
    */
  var compressionFormat: js.UndefOr[String] = js.native
  
  /**
    * Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
    * be used.
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
  
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: String = js.native
}
object FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration {
  
  @scala.inline
  def apply(
    bucketArn: String,
    cloudwatchLoggingOptions: FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions,
    roleArn: String
  ): FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketArn(value: String): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferInterval(value: Double): Self = StObject.set(x, "bufferInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferIntervalUndefined: Self = StObject.set(x, "bufferInterval", js.undefined)
    
    @scala.inline
    def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionFormat(value: String): Self = StObject.set(x, "compressionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionFormatUndefined: Self = StObject.set(x, "compressionFormat", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
