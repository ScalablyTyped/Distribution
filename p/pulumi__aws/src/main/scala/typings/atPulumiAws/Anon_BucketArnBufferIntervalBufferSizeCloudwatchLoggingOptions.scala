package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions extends js.Object {
  var bucketArn: Input[String]
  var bufferInterval: js.UndefOr[Input[Double]] = js.undefined
  var bufferSize: js.UndefOr[Input[Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var compressionFormat: js.UndefOr[Input[String]] = js.undefined
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  var prefix: js.UndefOr[Input[String]] = js.undefined
  var roleArn: Input[String]
}

object Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions {
  @scala.inline
  def apply(
    bucketArn: Input[String],
    roleArn: Input[String],
    bufferInterval: Input[Double] = null,
    bufferSize: Input[Double] = null,
    cloudwatchLoggingOptions: Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    compressionFormat: Input[String] = null,
    kmsKeyArn: Input[String] = null,
    prefix: Input[String] = null
  ): Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (bufferInterval != null) __obj.updateDynamic("bufferInterval")(bufferInterval.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (compressionFormat != null) __obj.updateDynamic("compressionFormat")(compressionFormat.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]
  }
}

