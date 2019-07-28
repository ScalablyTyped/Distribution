package typings.reactDashWidgets.libSelectListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListMessages extends js.Object {
  /**
    * @default: "There are no items in this list"
    */
  var emptyList: js.UndefOr[String | (js.Function1[/* props */ SelectListProps, String])] = js.undefined
}

object SelectListMessages {
  @scala.inline
  def apply(emptyList: String | (js.Function1[/* props */ SelectListProps, String]) = null): SelectListMessages = {
    val __obj = js.Dynamic.literal()
    if (emptyList != null) __obj.updateDynamic("emptyList")(emptyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListMessages]
  }
}

