package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketAccessRoleArnInput extends js.Object {
  var bucketAccessRoleArn: Input[String]
}

object Anon_BucketAccessRoleArnInput {
  @scala.inline
  def apply(bucketAccessRoleArn: Input[String]): Anon_BucketAccessRoleArnInput = {
    val __obj = js.Dynamic.literal(bucketAccessRoleArn = bucketAccessRoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BucketAccessRoleArnInput]
  }
}

