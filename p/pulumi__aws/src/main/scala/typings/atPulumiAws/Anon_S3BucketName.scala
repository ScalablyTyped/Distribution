package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BucketName extends js.Object {
  var s3BucketName: String
  var s3KeyPrefix: js.UndefOr[String] = js.undefined
}

object Anon_S3BucketName {
  @scala.inline
  def apply(s3BucketName: String, s3KeyPrefix: String = null): Anon_S3BucketName = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName)
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix)
    __obj.asInstanceOf[Anon_S3BucketName]
  }
}

