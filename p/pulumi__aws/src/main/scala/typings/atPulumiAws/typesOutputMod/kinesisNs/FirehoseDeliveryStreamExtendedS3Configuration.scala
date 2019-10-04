package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3Configuration extends js.Object {
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
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
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
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[String] = js.undefined
}

object FirehoseDeliveryStreamExtendedS3Configuration {
  @scala.inline
  def apply(
    bucketArn: String,
    cloudwatchLoggingOptions: FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions,
    roleArn: String,
    bufferInterval: Int | Double = null,
    bufferSize: Int | Double = null,
    compressionFormat: String = null,
    dataFormatConversionConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration = null,
    errorOutputPrefix: String = null,
    kmsKeyArn: String = null,
    prefix: String = null,
    processingConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration = null,
    s3BackupConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration = null,
    s3BackupMode: String = null
  ): FirehoseDeliveryStreamExtendedS3Configuration = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn, cloudwatchLoggingOptions = cloudwatchLoggingOptions, roleArn = roleArn)
    if (bufferInterval != null) __obj.updateDynamic("bufferInterval")(bufferInterval.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (compressionFormat != null) __obj.updateDynamic("compressionFormat")(compressionFormat)
    if (dataFormatConversionConfiguration != null) __obj.updateDynamic("dataFormatConversionConfiguration")(dataFormatConversionConfiguration)
    if (errorOutputPrefix != null) __obj.updateDynamic("errorOutputPrefix")(errorOutputPrefix)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration)
    if (s3BackupConfiguration != null) __obj.updateDynamic("s3BackupConfiguration")(s3BackupConfiguration)
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode)
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3Configuration]
  }
}

