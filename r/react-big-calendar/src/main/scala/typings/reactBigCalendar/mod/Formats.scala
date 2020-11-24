package typings.reactBigCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formats extends js.Object {
  
  var agendaDateFormat: js.UndefOr[DateFormat] = js.native
  
  /**
    * Toolbar header format for the Agenda view, e.g. "4/1/2015 — 5/1/2015"
    */
  var agendaHeaderFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  
  var agendaTimeFormat: js.UndefOr[DateFormat] = js.native
  
  var agendaTimeRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  
  /**
    * Format for the day of the month heading in the Month view.
    * e.g. "01", "02", "03", etc
    */
  var dateFormat: js.UndefOr[DateFormat] = js.native
  
  /**
    * A day of the week format for Week and Day headings,
    * e.g. "Wed 01/04"
    *
    */
  var dayFormat: js.UndefOr[DateFormat] = js.native
  
  /**
    * Toolbar header format for the Day view, e.g. "Wednesday Apr 01"
    */
  var dayHeaderFormat: js.UndefOr[DateFormat] = js.native
  
  /**
    * Toolbar header format for the Week views, e.g. "Mar 29 - Apr 04"
    */
  var dayRangeHeaderFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  
  /**
    * An optional event time range for events that continue from another day
    */
  var eventTimeRangeEndFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  
  /**
    * Time range displayed on events.
    */
  var eventTimeRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  
  /**
    * An optional event time range for events that continue onto another day
    */
  var eventTimeRangeStartFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  
  /**
    * Toolbar header format for the Month view, e.g "2015 April"
    *
    */
  var monthHeaderFormat: js.UndefOr[DateFormat] = js.native
  
  /**
    * A time range format for selecting time slots, e.g "8:00am — 2:00pm"
    */
  var selectRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  
  /**
    * The timestamp cell formats in Week and Time views, e.g. "4:00 AM"
    */
  var timeGutterFormat: js.UndefOr[DateFormat] = js.native
  
  /**
    * Week day name format for the Month week day headings,
    * e.g: "Sun", "Mon", "Tue", etc
    *
    */
  var weekdayFormat: js.UndefOr[DateFormat] = js.native
}
object Formats {
  
  @scala.inline
  def apply(): Formats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formats]
  }
  
  @scala.inline
  implicit class FormatsOps[Self <: Formats] (val x: Self) extends AnyVal {
    
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
    def setAgendaDateFormatFunction3(
      value: (/* date */ Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("agendaDateFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAgendaDateFormat(value: DateFormat): Self = this.set("agendaDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgendaDateFormat: Self = this.set("agendaDateFormat", js.undefined)
    
    @scala.inline
    def setAgendaHeaderFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("agendaHeaderFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAgendaHeaderFormat: Self = this.set("agendaHeaderFormat", js.undefined)
    
    @scala.inline
    def setAgendaTimeFormatFunction3(
      value: (/* date */ Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("agendaTimeFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAgendaTimeFormat(value: DateFormat): Self = this.set("agendaTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgendaTimeFormat: Self = this.set("agendaTimeFormat", js.undefined)
    
    @scala.inline
    def setAgendaTimeRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("agendaTimeRangeFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAgendaTimeRangeFormat: Self = this.set("agendaTimeRangeFormat", js.undefined)
    
    @scala.inline
    def setDateFormatFunction3(
      value: (/* date */ Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("dateFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDateFormat(value: DateFormat): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDayFormatFunction3(
      value: (/* date */ Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("dayFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDayFormat(value: DateFormat): Self = this.set("dayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayFormat: Self = this.set("dayFormat", js.undefined)
    
    @scala.inline
    def setDayHeaderFormatFunction3(
      value: (/* date */ Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("dayHeaderFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDayHeaderFormat(value: DateFormat): Self = this.set("dayHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayHeaderFormat: Self = this.set("dayHeaderFormat", js.undefined)
    
    @scala.inline
    def setDayRangeHeaderFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("dayRangeHeaderFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDayRangeHeaderFormat: Self = this.set("dayRangeHeaderFormat", js.undefined)
    
    @scala.inline
    def setEventTimeRangeEndFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("eventTimeRangeEndFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEventTimeRangeEndFormat: Self = this.set("eventTimeRangeEndFormat", js.undefined)
    
    @scala.inline
    def setEventTimeRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("eventTimeRangeFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEventTimeRangeFormat: Self = this.set("eventTimeRangeFormat", js.undefined)
    
    @scala.inline
    def setEventTimeRangeStartFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("eventTimeRangeStartFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEventTimeRangeStartFormat: Self = this.set("eventTimeRangeStartFormat", js.undefined)
    
    @scala.inline
    def setMonthHeaderFormatFunction3(
      value: (/* date */ Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("monthHeaderFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMonthHeaderFormat(value: DateFormat): Self = this.set("monthHeaderFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthHeaderFormat: Self = this.set("monthHeaderFormat", js.undefined)
    
    @scala.inline
    def setSelectRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("selectRangeFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSelectRangeFormat: Self = this.set("selectRangeFormat", js.undefined)
    
    @scala.inline
    def setTimeGutterFormatFunction3(
      value: (/* date */ Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("timeGutterFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTimeGutterFormat(value: DateFormat): Self = this.set("timeGutterFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeGutterFormat: Self = this.set("timeGutterFormat", js.undefined)
    
    @scala.inline
    def setWeekdayFormatFunction3(
      value: (/* date */ Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = this.set("weekdayFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWeekdayFormat(value: DateFormat): Self = this.set("weekdayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdayFormat: Self = this.set("weekdayFormat", js.undefined)
  }
}
