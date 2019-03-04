package typings
package reactDashWidgetsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionClear extends js.Object {
  var action: reactDashWidgetsLib.reactDashWidgetsLibStrings.clear | reactDashWidgetsLib.reactDashWidgetsLibStrings.input
  var lastSearchTerm: js.UndefOr[java.lang.String] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object Anon_ActionClear {
  @scala.inline
  def apply(
    action: reactDashWidgetsLib.reactDashWidgetsLibStrings.clear | reactDashWidgetsLib.reactDashWidgetsLibStrings.input,
    lastSearchTerm: java.lang.String = null,
    originalEvent: js.Any = null
  ): Anon_ActionClear = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (lastSearchTerm != null) __obj.updateDynamic("lastSearchTerm")(lastSearchTerm)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[Anon_ActionClear]
  }
}

