package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BucketNameS3BucketPrefix extends js.Object {
  var s3BucketName: java.lang.String
  var s3BucketPrefix: js.UndefOr[java.lang.String] = js.undefined
  var s3Region: java.lang.String
}

object Anon_S3BucketNameS3BucketPrefix {
  @scala.inline
  def apply(
    s3BucketName: java.lang.String,
    s3Region: java.lang.String,
    s3BucketPrefix: java.lang.String = null
  ): Anon_S3BucketNameS3BucketPrefix = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName, s3Region = s3Region)
    if (s3BucketPrefix != null) __obj.updateDynamic("s3BucketPrefix")(s3BucketPrefix)
    __obj.asInstanceOf[Anon_S3BucketNameS3BucketPrefix]
  }
}

