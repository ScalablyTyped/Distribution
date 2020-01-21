package typings.pulumiAws.s3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketEvent extends js.Object {
  var Records: js.UndefOr[js.Array[BucketRecord]] = js.native
}

object BucketEvent {
  @scala.inline
  def apply(Records: js.Array[BucketRecord] = null): BucketEvent = {
    val __obj = js.Dynamic.literal()
    if (Records != null) __obj.updateDynamic("Records")(Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketEvent]
  }
}

