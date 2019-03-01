package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKmsKeyArnObjectKeyPrefix extends js.Object {
  var bucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var objectKeyPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var position: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var topicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketNameKmsKeyArnObjectKeyPrefix {
  @scala.inline
  def apply(
    bucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    position: atPulumiPulumiLib.outputMod.Input[scala.Double],
    kmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    objectKeyPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_BucketNameKmsKeyArnObjectKeyPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (objectKeyPrefix != null) __obj.updateDynamic("objectKeyPrefix")(objectKeyPrefix.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketNameKmsKeyArnObjectKeyPrefix]
  }
}

