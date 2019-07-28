package typings.atPulumiAws.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketEvent extends js.Object {
  var Records: js.UndefOr[js.Array[BucketRecord]] = js.undefined
}

object BucketEvent {
  @scala.inline
  def apply(Records: js.Array[BucketRecord] = null): BucketEvent = {
    val __obj = js.Dynamic.literal()
    if (Records != null) __obj.updateDynamic("Records")(Records)
    __obj.asInstanceOf[BucketEvent]
  }
}

