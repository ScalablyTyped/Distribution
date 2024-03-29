package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration extends StObject {
  
  /**
    * The ARN of the S3 bucket
    */
  var bucketArn: Input[String]
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
    */
  var bufferInterval: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
    * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
    */
  var bufferSize: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: js.UndefOr[
    Input[
      FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions
    ]
  ] = js.undefined
  
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. Other supported values are GZIP, ZIP & Snappy. If the destination is redshift you cannot use ZIP or Snappy.
    */
  var compressionFormat: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
    * be used.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: Input[String]
}
object FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration {
  
  inline def apply(bucketArn: Input[String], roleArn: Input[String]): FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration]
  }
  
  extension [Self <: FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration](x: Self) {
    
    inline def setBucketArn(value: Input[String]): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setBufferInterval(value: Input[Double]): Self = StObject.set(x, "bufferInterval", value.asInstanceOf[js.Any])
    
    inline def setBufferIntervalUndefined: Self = StObject.set(x, "bufferInterval", js.undefined)
    
    inline def setBufferSize(value: Input[Double]): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    inline def setCloudwatchLoggingOptions(
      value: Input[
          FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions
        ]
    ): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
    
    inline def setCompressionFormat(value: Input[String]): Self = StObject.set(x, "compressionFormat", value.asInstanceOf[js.Any])
    
    inline def setCompressionFormatUndefined: Self = StObject.set(x, "compressionFormat", js.undefined)
    
    inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
