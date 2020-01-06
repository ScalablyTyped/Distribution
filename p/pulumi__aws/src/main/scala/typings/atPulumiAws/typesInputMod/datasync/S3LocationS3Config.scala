package typings.atPulumiAws.typesInputMod.datasync

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3LocationS3Config extends js.Object {
  /**
    * Amazon Resource Names (ARN) of the IAM Role used to connect to the S3 Bucket.
    */
  var bucketAccessRoleArn: Input[String] = js.native
}

object S3LocationS3Config {
  @scala.inline
  def apply(bucketAccessRoleArn: Input[String]): S3LocationS3Config = {
    val __obj = js.Dynamic.literal(bucketAccessRoleArn = bucketAccessRoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3LocationS3Config]
  }
}

