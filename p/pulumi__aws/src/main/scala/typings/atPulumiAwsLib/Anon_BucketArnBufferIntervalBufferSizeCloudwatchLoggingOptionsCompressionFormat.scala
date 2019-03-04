package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat extends js.Object {
  var bucketArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var bufferInterval: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var bufferSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var compressionFormat: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var dataFormatConversionConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration]
  ] = js.undefined
  var errorOutputPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var s3BackupConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]
  ] = js.undefined
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat {
  @scala.inline
  def apply(
    bucketArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    bufferInterval: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    bufferSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    cloudwatchLoggingOptions: atPulumiPulumiLib.outputMod.Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    compressionFormat: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dataFormatConversionConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration] = null,
    errorOutputPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    processingConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_EnabledProcessorsAnonParametersType] = null,
    s3BackupConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions] = null,
    s3BackupMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

