package typings.reactBigCalendar

import typings.react.mod.ComponentType
import typings.reactBigCalendar.mod.ViewStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAgenda extends js.Object {
  var agenda: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.undefined
  var day: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.undefined
  var month: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.undefined
  var week: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.undefined
  var work_week: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.undefined
}

object AnonAgenda {
  @scala.inline
  def apply(
    agenda: Boolean | (ComponentType[_] with ViewStatic) = null,
    day: Boolean | (ComponentType[_] with ViewStatic) = null,
    month: Boolean | (ComponentType[_] with ViewStatic) = null,
    week: Boolean | (ComponentType[_] with ViewStatic) = null,
    work_week: Boolean | (ComponentType[_] with ViewStatic) = null
  ): AnonAgenda = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (work_week != null) __obj.updateDynamic("work_week")(work_week.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAgenda]
  }
}

