package typings.select2.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingData extends js.Object {
  var element: js.UndefOr[scala.Nothing] = js.undefined
  var id: js.UndefOr[scala.Nothing] = js.undefined
  var loading: Boolean
  var text: String
}

object LoadingData {
  @scala.inline
  def apply(
    loading: Boolean,
    text: String,
    element: js.UndefOr[scala.Nothing] = js.undefined,
    id: js.UndefOr[scala.Nothing] = js.undefined
  ): LoadingData = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(element)) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingData]
  }
}

