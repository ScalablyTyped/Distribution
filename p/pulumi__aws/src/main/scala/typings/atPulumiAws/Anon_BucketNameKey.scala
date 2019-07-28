package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKey extends js.Object {
  var bucketName: Input[String]
  var key: Input[String]
  var roleArn: Input[String]
}

object Anon_BucketNameKey {
  @scala.inline
  def apply(bucketName: Input[String], key: Input[String], roleArn: Input[String]): Anon_BucketNameKey = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BucketNameKey]
  }
}

