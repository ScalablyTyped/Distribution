package typings.reactDashBigDashCalendar

import typings.react.reactMod.Component
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Agenda extends js.Object {
  var agenda: js.UndefOr[Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _])] = js.undefined
  var day: js.UndefOr[Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _])] = js.undefined
  var month: js.UndefOr[Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _])] = js.undefined
  var week: js.UndefOr[Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _])] = js.undefined
  var work_week: js.UndefOr[Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _])] = js.undefined
}

object Anon_Agenda {
  @scala.inline
  def apply(
    agenda: Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _]) = null,
    day: Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _]) = null,
    month: Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _]) = null,
    week: Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _]) = null,
    work_week: Boolean | SFC[js.Object] | (Component[js.Object, js.Object, _]) = null
  ): Anon_Agenda = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (work_week != null) __obj.updateDynamic("work_week")(work_week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Agenda]
  }
}

