package typings.select2.mod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(element)) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTextPair]
  }
}

