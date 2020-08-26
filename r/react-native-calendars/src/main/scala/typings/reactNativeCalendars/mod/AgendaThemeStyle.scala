package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgendaThemeStyle extends CalendarTheme {
  var agendaDayNumColor: js.UndefOr[String] = js.native
  var agendaDayTextColor: js.UndefOr[String] = js.native
  var agendaKnobColor: js.UndefOr[String] = js.native
  var agendaTodayColor: js.UndefOr[String] = js.native
}

object AgendaThemeStyle {
  @scala.inline
  def apply(): AgendaThemeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaThemeStyle]
  }
  @scala.inline
  implicit class AgendaThemeStyleOps[Self <: AgendaThemeStyle] (val x: Self) extends AnyVal {
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
    def setAgendaDayNumColor(value: String): Self = this.set("agendaDayNumColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaDayNumColor: Self = this.set("agendaDayNumColor", js.undefined)
    @scala.inline
    def setAgendaDayTextColor(value: String): Self = this.set("agendaDayTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaDayTextColor: Self = this.set("agendaDayTextColor", js.undefined)
    @scala.inline
    def setAgendaKnobColor(value: String): Self = this.set("agendaKnobColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaKnobColor: Self = this.set("agendaKnobColor", js.undefined)
    @scala.inline
    def setAgendaTodayColor(value: String): Self = this.set("agendaTodayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaTodayColor: Self = this.set("agendaTodayColor", js.undefined)
  }
  
}

