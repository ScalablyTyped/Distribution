package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration extends js.Object {
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
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions = js.native
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

object FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration {
  @scala.inline
  def apply(
    bucketArn: String,
    cloudwatchLoggingOptions: FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions,
    roleArn: String
  ): FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationOps[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration] (val x: Self) extends AnyVal {
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
    def setBucketArn(value: String): Self = this.set("bucketArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudwatchLoggingOptions(value: FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptions): Self = this.set("cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferInterval(value: Double): Self = this.set("bufferInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferInterval: Self = this.set("bufferInterval", js.undefined)
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    @scala.inline
    def setCompressionFormat(value: String): Self = this.set("compressionFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionFormat: Self = this.set("compressionFormat", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

