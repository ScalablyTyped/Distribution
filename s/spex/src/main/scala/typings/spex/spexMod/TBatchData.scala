package typings.spex.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TBatchData extends js.Object {
  var origin: js.UndefOr[TOriginData] = js.undefined
  var result: js.Any
  var success: Boolean
}

object TBatchData {
  @scala.inline
  def apply(result: js.Any, success: Boolean, origin: TOriginData = null): TBatchData = {
    val __obj = js.Dynamic.literal(result = result, success = success)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[TBatchData]
  }
}

