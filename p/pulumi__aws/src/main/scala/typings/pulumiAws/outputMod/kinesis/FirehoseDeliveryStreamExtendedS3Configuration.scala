package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3Configuration extends StObject {
  
  /**
    * The ARN of the S3 bucket
    */
  var bucketArn: String
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
    */
  var bufferInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
    * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
    */
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions
  
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. Other supported values are GZIP, ZIP & Snappy. If the destination is redshift you cannot use ZIP or Snappy.
    */
  var compressionFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Nested argument for the serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. More details given below.
    */
  var dataFormatConversionConfiguration: js.UndefOr[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration] = js.undefined
  
  /**
    * Prefix added to failed records before writing them to S3. This prefix appears immediately following the bucket name.
    */
  var errorOutputPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
    * be used.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration] = js.undefined
  
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: String
  
  /**
    * The configuration for backup in Amazon S3. Required if `s3BackupMode` is `Enabled`. Supports the same fields as `s3Configuration` object.
    */
  var s3BackupConfiguration: js.UndefOr[FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration] = js.undefined
  
  /**
    * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
    */
  var s3BackupMode: js.UndefOr[String] = js.undefined
}
object FirehoseDeliveryStreamExtendedS3Configuration {
  
  @scala.inline
  def apply(
    bucketArn: String,
    cloudwatchLoggingOptions: FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions,
    roleArn: String
  ): FirehoseDeliveryStreamExtendedS3Configuration = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3Configuration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamExtendedS3Configuration] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchLoggingOptions(value: FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionFormat(value: String): Self = StObject.set(x, "compressionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionFormatUndefined: Self = StObject.set(x, "compressionFormat", js.undefined)
    
    @scala.inline
    def setDataFormatConversionConfiguration(value: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration): Self = StObject.set(x, "dataFormatConversionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatConversionConfigurationUndefined: Self = StObject.set(x, "dataFormatConversionConfiguration", js.undefined)
    
    @scala.inline
    def setErrorOutputPrefix(value: String): Self = StObject.set(x, "errorOutputPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorOutputPrefixUndefined: Self = StObject.set(x, "errorOutputPrefix", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupConfiguration(value: FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration): Self = StObject.set(x, "s3BackupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupConfigurationUndefined: Self = StObject.set(x, "s3BackupConfiguration", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: String): Self = StObject.set(x, "s3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "s3BackupMode", js.undefined)
  }
}
