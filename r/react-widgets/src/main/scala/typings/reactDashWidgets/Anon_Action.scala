package typings.reactDashWidgets

import typings.reactDashWidgets.reactDashWidgetsStrings.insert
import typings.reactDashWidgets.reactDashWidgetsStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: insert | remove
  var dataItem: js.Any
  var lastValue: js.UndefOr[js.Array[_]] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var searchTerm: js.UndefOr[String] = js.undefined
}

object Anon_Action {
  @scala.inline
  def apply(
    action: insert | remove,
    dataItem: js.Any,
    lastValue: js.Array[_] = null,
    originalEvent: js.Any = null,
    searchTerm: String = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dataItem = dataItem)
    if (lastValue != null) __obj.updateDynamic("lastValue")(lastValue)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm)
    __obj.asInstanceOf[Anon_Action]
  }
}

