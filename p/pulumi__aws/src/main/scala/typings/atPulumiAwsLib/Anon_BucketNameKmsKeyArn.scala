package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKmsKeyArn extends js.Object {
  var bucketName: java.lang.String
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
  var objectKeyPrefix: js.UndefOr[java.lang.String] = js.undefined
  var position: scala.Double
  var topicArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BucketNameKmsKeyArn {
  @scala.inline
  def apply(
    bucketName: java.lang.String,
    position: scala.Double,
    kmsKeyArn: java.lang.String = null,
    objectKeyPrefix: java.lang.String = null,
    topicArn: java.lang.String = null
  ): Anon_BucketNameKmsKeyArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucketName")(bucketName)
    __obj.updateDynamic("position")(position)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (objectKeyPrefix != null) __obj.updateDynamic("objectKeyPrefix")(objectKeyPrefix)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_BucketNameKmsKeyArn]
  }
}

