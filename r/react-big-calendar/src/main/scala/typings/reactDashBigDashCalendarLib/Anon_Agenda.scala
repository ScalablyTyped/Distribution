package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Agenda extends js.Object {
  var agenda: js.UndefOr[
    scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
  ] = js.undefined
  var day: js.UndefOr[
    scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
  ] = js.undefined
  var month: js.UndefOr[
    scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
  ] = js.undefined
  var week: js.UndefOr[
    scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
  ] = js.undefined
  var work_week: js.UndefOr[
    scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
  ] = js.undefined
}

object Anon_Agenda {
  @scala.inline
  def apply(
    agenda: scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) = null,
    day: scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) = null,
    month: scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) = null,
    week: scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) = null,
    work_week: scala.Boolean | reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) = null
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

