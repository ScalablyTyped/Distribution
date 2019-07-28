package typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var isEventPerspective: Boolean
  var showAgenda: Boolean
  var viewName: js.UndefOr[String] = js.undefined
  var viewType: ViewTypes
}

object View {
  @scala.inline
  def apply(isEventPerspective: Boolean, showAgenda: Boolean, viewType: ViewTypes, viewName: String = null): View = {
    val __obj = js.Dynamic.literal(isEventPerspective = isEventPerspective, showAgenda = showAgenda, viewType = viewType)
    if (viewName != null) __obj.updateDynamic("viewName")(viewName)
    __obj.asInstanceOf[View]
  }
}

