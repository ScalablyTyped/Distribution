package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKmsKeyArnPrefix extends js.Object {
  var bucketName: java.lang.String
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var region: java.lang.String
  var syncFormat: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BucketNameKmsKeyArnPrefix {
  @scala.inline
  def apply(
    bucketName: java.lang.String,
    region: java.lang.String,
    kmsKeyArn: java.lang.String = null,
    prefix: java.lang.String = null,
    syncFormat: java.lang.String = null
  ): Anon_BucketNameKmsKeyArnPrefix = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, region = region)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (syncFormat != null) __obj.updateDynamic("syncFormat")(syncFormat)
    __obj.asInstanceOf[Anon_BucketNameKmsKeyArnPrefix]
  }
}

