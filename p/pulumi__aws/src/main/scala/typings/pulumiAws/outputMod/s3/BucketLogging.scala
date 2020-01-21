package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLogging extends js.Object {
  /**
    * The name of the bucket that will receive the log objects.
    */
  var targetBucket: String = js.native
  /**
    * To specify a key prefix for log objects.
    */
  var targetPrefix: js.UndefOr[String] = js.native
}

object BucketLogging {
  @scala.inline
  def apply(targetBucket: String, targetPrefix: String = null): BucketLogging = {
    val __obj = js.Dynamic.literal(targetBucket = targetBucket.asInstanceOf[js.Any])
    if (targetPrefix != null) __obj.updateDynamic("targetPrefix")(targetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLogging]
  }
}

