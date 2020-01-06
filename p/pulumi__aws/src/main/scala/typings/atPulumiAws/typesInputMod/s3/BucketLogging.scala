package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLogging extends js.Object {
  /**
    * The name of the bucket that will receive the log objects.
    */
  var targetBucket: Input[String] = js.native
  /**
    * To specify a key prefix for log objects.
    */
  var targetPrefix: js.UndefOr[Input[String]] = js.native
}

object BucketLogging {
  @scala.inline
  def apply(targetBucket: Input[String], targetPrefix: Input[String] = null): BucketLogging = {
    val __obj = js.Dynamic.literal(targetBucket = targetBucket.asInstanceOf[js.Any])
    if (targetPrefix != null) __obj.updateDynamic("targetPrefix")(targetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLogging]
  }
}

