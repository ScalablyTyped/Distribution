package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTextPair extends js.Object {
  var element: js.UndefOr[scala.Nothing] = js.undefined
  var id: java.lang.String
  var loading: js.UndefOr[scala.Nothing] = js.undefined
  var text: java.lang.String
}

object IdTextPair {
  @scala.inline
  def apply(
    id: java.lang.String,
    text: java.lang.String,
    element: js.UndefOr[scala.Nothing] = js.undefined,
    loading: js.UndefOr[scala.Nothing] = js.undefined
  ): IdTextPair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("text")(text)
    if (!js.isUndefined(element)) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[IdTextPair]
  }
}

