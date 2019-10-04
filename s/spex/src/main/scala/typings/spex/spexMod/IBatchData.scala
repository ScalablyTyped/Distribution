package typings.spex.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatchData extends js.Object {
  var origin: js.UndefOr[IOriginData] = js.undefined
  var result: js.Any
  var success: Boolean
}

object IBatchData {
  @scala.inline
  def apply(result: js.Any, success: Boolean, origin: IOriginData = null): IBatchData = {
    val __obj = js.Dynamic.literal(result = result, success = success)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[IBatchData]
  }
}

