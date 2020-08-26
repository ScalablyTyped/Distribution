package typings.reactDayPicker.classNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNames extends js.Object {
  var body: String = js.native
  var caption: String = js.native
  var container: String = js.native
  var day: String = js.native
  var disabled: String = js.native
  var footer: String = js.native
  var interactionDisabled: String = js.native
  var month: String = js.native
  var months: String = js.native
  var navBar: String = js.native
  var navButtonInteractionDisabled: String = js.native
  var navButtonNext: String = js.native
  var navButtonPrev: String = js.native
  var outside: String = js.native
  var selected: String = js.native
  var today: String = js.native
  var todayButton: String = js.native
  var week: String = js.native
  var weekNumber: String = js.native
  var weekday: String = js.native
  var weekdays: String = js.native
  var weekdaysRow: String = js.native
  var wrapper: String = js.native
}

object ClassNames {
  @scala.inline
  def apply(
    body: String,
    caption: String,
    container: String,
    day: String,
    disabled: String,
    footer: String,
    interactionDisabled: String,
    month: String,
    months: String,
    navBar: String,
    navButtonInteractionDisabled: String,
    navButtonNext: String,
    navButtonPrev: String,
    outside: String,
    selected: String,
    today: String,
    todayButton: String,
    week: String,
    weekNumber: String,
    weekday: String,
    weekdays: String,
    weekdaysRow: String,
    wrapper: String
  ): ClassNames = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], interactionDisabled = interactionDisabled.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any], navButtonInteractionDisabled = navButtonInteractionDisabled.asInstanceOf[js.Any], navButtonNext = navButtonNext.asInstanceOf[js.Any], navButtonPrev = navButtonPrev.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], todayButton = todayButton.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], weekNumber = weekNumber.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysRow = weekdaysRow.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNames]
  }
  @scala.inline
  implicit class ClassNamesOps[Self <: ClassNames] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteractionDisabled(value: String): Self = this.set("interactionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: String): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavBar(value: String): Self = this.set("navBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavButtonInteractionDisabled(value: String): Self = this.set("navButtonInteractionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavButtonNext(value: String): Self = this.set("navButtonNext", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavButtonPrev(value: String): Self = this.set("navButtonPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutside(value: String): Self = this.set("outside", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def setTodayButton(value: String): Self = this.set("todayButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeek(value: String): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekNumber(value: String): Self = this.set("weekNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekday(value: String): Self = this.set("weekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdays(value: String): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysRow(value: String): Self = this.set("weekdaysRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

