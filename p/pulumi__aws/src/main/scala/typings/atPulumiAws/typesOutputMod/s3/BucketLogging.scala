package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLogging extends js.Object {
  /**
    * The name of the bucket that will receive the log objects.
    */
  var targetBucket: String
  /**
    * To specify a key prefix for log objects.
    */
  var targetPrefix: js.UndefOr[String] = js.undefined
}

object BucketLogging {
  @scala.inline
  def apply(targetBucket: String, targetPrefix: String = null): BucketLogging = {
    val __obj = js.Dynamic.literal(targetBucket = targetBucket)
    if (targetPrefix != null) __obj.updateDynamic("targetPrefix")(targetPrefix)
    __obj.asInstanceOf[BucketLogging]
  }
}

