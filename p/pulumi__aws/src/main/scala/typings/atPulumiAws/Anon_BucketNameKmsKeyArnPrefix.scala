package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKmsKeyArnPrefix extends js.Object {
  var bucketName: String
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var region: String
  var syncFormat: js.UndefOr[String] = js.undefined
}

object Anon_BucketNameKmsKeyArnPrefix {
  @scala.inline
  def apply(
    bucketName: String,
    region: String,
    kmsKeyArn: String = null,
    prefix: String = null,
    syncFormat: String = null
  ): Anon_BucketNameKmsKeyArnPrefix = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, region = region)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (syncFormat != null) __obj.updateDynamic("syncFormat")(syncFormat)
    __obj.asInstanceOf[Anon_BucketNameKmsKeyArnPrefix]
  }
}

