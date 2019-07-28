package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BucketNameS3KeyPrefix extends js.Object {
  var s3BucketName: Input[String]
  var s3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
}

object Anon_S3BucketNameS3KeyPrefix {
  @scala.inline
  def apply(s3BucketName: Input[String], s3KeyPrefix: Input[String] = null): Anon_S3BucketNameS3KeyPrefix = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_S3BucketNameS3KeyPrefix]
  }
}

