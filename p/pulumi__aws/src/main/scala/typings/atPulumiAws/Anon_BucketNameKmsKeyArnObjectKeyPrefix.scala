package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKmsKeyArnObjectKeyPrefix extends js.Object {
  var bucketName: Input[String]
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  var objectKeyPrefix: js.UndefOr[Input[String]] = js.undefined
  var position: Input[Double]
  var topicArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_BucketNameKmsKeyArnObjectKeyPrefix {
  @scala.inline
  def apply(
    bucketName: Input[String],
    position: Input[Double],
    kmsKeyArn: Input[String] = null,
    objectKeyPrefix: Input[String] = null,
    topicArn: Input[String] = null
  ): Anon_BucketNameKmsKeyArnObjectKeyPrefix = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (objectKeyPrefix != null) __obj.updateDynamic("objectKeyPrefix")(objectKeyPrefix.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketNameKmsKeyArnObjectKeyPrefix]
  }
}

