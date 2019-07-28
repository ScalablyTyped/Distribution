package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat extends js.Object {
  var bucketArn: Input[String]
  var bufferInterval: js.UndefOr[Input[Double]] = js.undefined
  var bufferSize: js.UndefOr[Input[Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var compressionFormat: js.UndefOr[Input[String]] = js.undefined
  var dataFormatConversionConfiguration: js.UndefOr[Input[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration]] = js.undefined
  var errorOutputPrefix: js.UndefOr[Input[String]] = js.undefined
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  var prefix: js.UndefOr[Input[String]] = js.undefined
  var processingConfiguration: js.UndefOr[Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var roleArn: Input[String]
  var s3BackupConfiguration: js.UndefOr[Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]] = js.undefined
  var s3BackupMode: js.UndefOr[Input[String]] = js.undefined
}

object Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat {
  @scala.inline
  def apply(
    bucketArn: Input[String],
    roleArn: Input[String],
    bufferInterval: Input[Double] = null,
    bufferSize: Input[Double] = null,
    cloudwatchLoggingOptions: Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    compressionFormat: Input[String] = null,
    dataFormatConversionConfiguration: Input[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration] = null,
    errorOutputPrefix: Input[String] = null,
    kmsKeyArn: Input[String] = null,
    prefix: Input[String] = null,
    processingConfiguration: Input[Anon_EnabledProcessorsAnonParametersType] = null,
    s3BackupConfiguration: Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions] = null,
    s3BackupMode: Input[String] = null
  ): Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (bufferInterval != null) __obj.updateDynamic("bufferInterval")(bufferInterval.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (compressionFormat != null) __obj.updateDynamic("compressionFormat")(compressionFormat.asInstanceOf[js.Any])
    if (dataFormatConversionConfiguration != null) __obj.updateDynamic("dataFormatConversionConfiguration")(dataFormatConversionConfiguration.asInstanceOf[js.Any])
    if (errorOutputPrefix != null) __obj.updateDynamic("errorOutputPrefix")(errorOutputPrefix.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (s3BackupConfiguration != null) __obj.updateDynamic("s3BackupConfiguration")(s3BackupConfiguration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat]
  }
}

