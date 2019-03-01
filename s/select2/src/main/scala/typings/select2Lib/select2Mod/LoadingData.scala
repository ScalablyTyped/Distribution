package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingData extends js.Object {
  var element: js.UndefOr[scala.Nothing] = js.undefined
  var id: js.UndefOr[scala.Nothing] = js.undefined
  var loading: scala.Boolean
  var text: java.lang.String
}

object LoadingData {
  @scala.inline
  def apply(
    loading: scala.Boolean,
    text: java.lang.String,
    element: js.UndefOr[scala.Nothing] = js.undefined,
    id: js.UndefOr[scala.Nothing] = js.undefined
  ): LoadingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("text")(text)
    if (!js.isUndefined(element)) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[LoadingData]
  }
}

