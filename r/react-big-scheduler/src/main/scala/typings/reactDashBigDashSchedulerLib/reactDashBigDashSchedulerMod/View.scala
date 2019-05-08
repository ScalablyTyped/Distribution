package typings
package reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var isEventPerspective: scala.Boolean
  var showAgenda: scala.Boolean
  var viewName: js.UndefOr[java.lang.String] = js.undefined
  var viewType: ViewTypes
}

object View {
  @scala.inline
  def apply(
    isEventPerspective: scala.Boolean,
    showAgenda: scala.Boolean,
    viewType: ViewTypes,
    viewName: java.lang.String = null
  ): View = {
    val __obj = js.Dynamic.literal(isEventPerspective = isEventPerspective, showAgenda = showAgenda, viewType = viewType)
    if (viewName != null) __obj.updateDynamic("viewName")(viewName)
    __obj.asInstanceOf[View]
  }
}

