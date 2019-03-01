package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BucketNameS3BucketPrefixS3Region extends js.Object {
  var s3BucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var s3BucketPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var s3Region: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_S3BucketNameS3BucketPrefixS3Region {
  @scala.inline
  def apply(
    s3BucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    s3Region: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    s3BucketPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_S3BucketNameS3BucketPrefixS3Region = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    __obj.updateDynamic("s3Region")(s3Region.asInstanceOf[js.Any])
    if (s3BucketPrefix != null) __obj.updateDynamic("s3BucketPrefix")(s3BucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_S3BucketNameS3BucketPrefixS3Region]
  }
}

