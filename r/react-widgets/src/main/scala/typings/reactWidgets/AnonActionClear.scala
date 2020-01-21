package typings.reactWidgets

import typings.reactWidgets.reactWidgetsStrings.clear
import typings.reactWidgets.reactWidgetsStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionClear extends js.Object {
  var action: clear | input
  var lastSearchTerm: js.UndefOr[String] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object AnonActionClear {
  @scala.inline
  def apply(action: clear | input, lastSearchTerm: String = null, originalEvent: js.Any = null): AnonActionClear = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (lastSearchTerm != null) __obj.updateDynamic("lastSearchTerm")(lastSearchTerm.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionClear]
  }
}

