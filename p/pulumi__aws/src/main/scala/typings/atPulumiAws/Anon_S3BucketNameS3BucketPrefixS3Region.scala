package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BucketNameS3BucketPrefixS3Region extends js.Object {
  var s3BucketName: Input[String]
  var s3BucketPrefix: js.UndefOr[Input[String]] = js.undefined
  var s3Region: Input[String]
}

object Anon_S3BucketNameS3BucketPrefixS3Region {
  @scala.inline
  def apply(s3BucketName: Input[String], s3Region: Input[String], s3BucketPrefix: Input[String] = null): Anon_S3BucketNameS3BucketPrefixS3Region = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any])
    if (s3BucketPrefix != null) __obj.updateDynamic("s3BucketPrefix")(s3BucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_S3BucketNameS3BucketPrefixS3Region]
  }
}

