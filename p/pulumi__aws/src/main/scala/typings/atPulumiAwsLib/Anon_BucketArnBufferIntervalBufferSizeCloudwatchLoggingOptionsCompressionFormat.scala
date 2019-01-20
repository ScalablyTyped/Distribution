package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat extends js.Object {
  var bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var bufferInterval: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var bufferSize: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var compressionFormat: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var dataFormatConversionConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration]
  ] = js.undefined
  var errorOutputPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var s3BackupConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]
  ] = js.undefined
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

