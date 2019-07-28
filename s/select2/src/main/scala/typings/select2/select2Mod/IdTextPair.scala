package typings.select2.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTextPair extends js.Object {
  var element: js.UndefOr[scala.Nothing] = js.undefined
  var id: String
  var loading: js.UndefOr[scala.Nothing] = js.undefined
  var text: String
}

object IdTextPair {
  @scala.inline
  def apply(
    id: String,
    text: String,
    element: js.UndefOr[scala.Nothing] = js.undefined,
    loading: js.UndefOr[scala.Nothing] = js.undefined
  ): IdTextPair = {
    val __obj = js.Dynamic.literal(id = id, text = text)
    if (!js.isUndefined(element)) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[IdTextPair]
  }
}

