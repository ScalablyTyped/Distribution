package typings.reactBigCalendar.anon

import typings.react.mod.ComponentType
import typings.reactBigCalendar.mod.ViewStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agenda extends js.Object {
  var agenda: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.native
  var day: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.native
  var month: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.native
  var week: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.native
  var work_week: js.UndefOr[Boolean | (ComponentType[_] with ViewStatic)] = js.native
}

object Agenda {
  @scala.inline
  def apply(): Agenda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Agenda]
  }
  @scala.inline
  implicit class AgendaOps[Self <: Agenda] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgenda(value: Boolean | (ComponentType[_] with ViewStatic)): Self = this.set("agenda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgenda: Self = this.set("agenda", js.undefined)
    @scala.inline
    def setDay(value: Boolean | (ComponentType[_] with ViewStatic)): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setMonth(value: Boolean | (ComponentType[_] with ViewStatic)): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setWeek(value: Boolean | (ComponentType[_] with ViewStatic)): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    @scala.inline
    def setWork_week(value: Boolean | (ComponentType[_] with ViewStatic)): Self = this.set("work_week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWork_week: Self = this.set("work_week", js.undefined)
  }
  
}

