package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnFileKey extends js.Object {
  var bucketArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var fileKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_BucketArnFileKey {
  @scala.inline
  def apply(
    bucketArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    fileKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_BucketArnFileKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucketArn")(bucketArn.asInstanceOf[js.Any])
    __obj.updateDynamic("fileKey")(fileKey.asInstanceOf[js.Any])
    __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketArnFileKey]
  }
}

