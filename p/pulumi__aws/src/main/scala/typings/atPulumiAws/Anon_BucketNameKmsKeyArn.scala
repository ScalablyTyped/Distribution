package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKmsKeyArn extends js.Object {
  var bucketName: String
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  var objectKeyPrefix: js.UndefOr[String] = js.undefined
  var position: Double
  var topicArn: js.UndefOr[String] = js.undefined
}

object Anon_BucketNameKmsKeyArn {
  @scala.inline
  def apply(
    bucketName: String,
    position: Double,
    kmsKeyArn: String = null,
    objectKeyPrefix: String = null,
    topicArn: String = null
  ): Anon_BucketNameKmsKeyArn = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, position = position)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (objectKeyPrefix != null) __obj.updateDynamic("objectKeyPrefix")(objectKeyPrefix)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_BucketNameKmsKeyArn]
  }
}

