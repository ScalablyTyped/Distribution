package typings.atPulumiAws.typesOutputMod.datasync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3LocationS3Config extends js.Object {
  /**
    * Amazon Resource Names (ARN) of the IAM Role used to connect to the S3 Bucket.
    */
  var bucketAccessRoleArn: String
}

object S3LocationS3Config {
  @scala.inline
  def apply(bucketAccessRoleArn: String): S3LocationS3Config = {
    val __obj = js.Dynamic.literal(bucketAccessRoleArn = bucketAccessRoleArn)
  
    __obj.asInstanceOf[S3LocationS3Config]
  }
}

