package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketKeyRoleArn extends js.Object {
  var bucket: Input[String]
  var key: Input[String]
  var roleArn: Input[String]
}

object Anon_BucketKeyRoleArn {
  @scala.inline
  def apply(bucket: Input[String], key: Input[String], roleArn: Input[String]): Anon_BucketKeyRoleArn = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BucketKeyRoleArn]
  }
}

