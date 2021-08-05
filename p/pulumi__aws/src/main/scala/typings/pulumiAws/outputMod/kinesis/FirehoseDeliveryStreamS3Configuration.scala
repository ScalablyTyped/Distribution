package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamS3Configuration extends StObject {
  
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
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions
  
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. Other supported values are GZIP, ZIP & Snappy. If the destination is redshift you cannot use ZIP or Snappy.
    */
  var compressionFormat: js.UndefOr[String] = js.undefined
  
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
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: String
}
object FirehoseDeliveryStreamS3Configuration {
  
  inline def apply(
    bucketArn: String,
    cloudwatchLoggingOptions: FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions,
    roleArn: String
  ): FirehoseDeliveryStreamS3Configuration = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamS3Configuration]
  }
  
  extension [Self <: FirehoseDeliveryStreamS3Configuration](x: Self) {
    
    inline def setBucketArn(value: String): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setBufferInterval(value: Double): Self = StObject.set(x, "bufferInterval", value.asInstanceOf[js.Any])
    
    inline def setBufferIntervalUndefined: Self = StObject.set(x, "bufferInterval", js.undefined)
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    inline def setCloudwatchLoggingOptions(value: FirehoseDeliveryStreamS3ConfigurationCloudwatchLoggingOptions): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCompressionFormat(value: String): Self = StObject.set(x, "compressionFormat", value.asInstanceOf[js.Any])
    
    inline def setCompressionFormatUndefined: Self = StObject.set(x, "compressionFormat", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
