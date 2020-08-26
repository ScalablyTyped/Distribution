package typings.pulumiAws.outputMod.datasync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3LocationS3Config extends js.Object {
  /**
    * Amazon Resource Names (ARN) of the IAM Role used to connect to the S3 Bucket.
    */
  var bucketAccessRoleArn: String = js.native
}

object S3LocationS3Config {
  @scala.inline
  def apply(bucketAccessRoleArn: String): S3LocationS3Config = {
    val __obj = js.Dynamic.literal(bucketAccessRoleArn = bucketAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LocationS3Config]
  }
  @scala.inline
  implicit class S3LocationS3ConfigOps[Self <: S3LocationS3Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketAccessRoleArn(value: String): Self = this.set("bucketAccessRoleArn", value.asInstanceOf[js.Any])
  }
  
}

