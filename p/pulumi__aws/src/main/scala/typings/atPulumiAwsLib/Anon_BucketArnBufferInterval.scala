package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferInterval extends js.Object {
  var bucketArn: java.lang.String
  var bufferInterval: js.UndefOr[scala.Double] = js.undefined
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var compressionFormat: js.UndefOr[java.lang.String] = js.undefined
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var roleArn: java.lang.String
}

object Anon_BucketArnBufferInterval {
  @scala.inline
  def apply(
    bucketArn: java.lang.String,
    cloudwatchLoggingOptions: Anon_EnabledLogGroupName,
    roleArn: java.lang.String,
    bufferInterval: scala.Int | scala.Double = null,
    bufferSize: scala.Int | scala.Double = null,
    compressionFormat: java.lang.String = null,
    kmsKeyArn: java.lang.String = null,
    prefix: java.lang.String = null
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

