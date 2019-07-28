package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BucketNameS3BucketPrefix extends js.Object {
  var s3BucketName: String
  var s3BucketPrefix: js.UndefOr[String] = js.undefined
  var s3Region: String
}

object Anon_S3BucketNameS3BucketPrefix {
  @scala.inline
  def apply(s3BucketName: String, s3Region: String, s3BucketPrefix: String = null): Anon_S3BucketNameS3BucketPrefix = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName, s3Region = s3Region)
    if (s3BucketPrefix != null) __obj.updateDynamic("s3BucketPrefix")(s3BucketPrefix)
    __obj.asInstanceOf[Anon_S3BucketNameS3BucketPrefix]
  }
}

