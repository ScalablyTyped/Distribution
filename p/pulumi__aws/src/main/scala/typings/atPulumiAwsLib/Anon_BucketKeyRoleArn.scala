package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketKeyRoleArn extends js.Object {
  var bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var key: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_BucketKeyRoleArn {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    key: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_BucketKeyRoleArn = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BucketKeyRoleArn]
  }
}

