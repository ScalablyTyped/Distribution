package typings.atPulumiPulumi.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResult extends js.Object {
  /**
    * Any properties that were computed during updating.
    */
  val outs: js.UndefOr[js.Any] = js.undefined
}

object UpdateResult {
  @scala.inline
  def apply(outs: js.Any = null): UpdateResult = {
    val __obj = js.Dynamic.literal()
    if (outs != null) __obj.updateDynamic("outs")(outs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult]
  }
}

