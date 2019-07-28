package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferInterval extends js.Object {
  var bucketArn: String
  var bufferInterval: js.UndefOr[Double] = js.undefined
  var bufferSize: js.UndefOr[Double] = js.undefined
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var compressionFormat: js.UndefOr[String] = js.undefined
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var roleArn: String
}

object Anon_BucketArnBufferInterval {
  @scala.inline
  def apply(
    bucketArn: String,
    cloudwatchLoggingOptions: Anon_EnabledLogGroupName,
    roleArn: String,
    bufferInterval: Int | Double = null,
    bufferSize: Int | Double = null,
    compressionFormat: String = null,
    kmsKeyArn: String = null,
    prefix: String = null
  ): Anon_BucketArnBufferInterval = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn, cloudwatchLoggingOptions = cloudwatchLoggingOptions, roleArn = roleArn)
    if (bufferInterval != null) __obj.updateDynamic("bufferInterval")(bufferInterval.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (compressionFormat != null) __obj.updateDynamic("compressionFormat")(compressionFormat)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_BucketArnBufferInterval]
  }
}

