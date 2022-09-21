package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formats extends StObject {
  
  var agendaDateFormat: js.UndefOr[DateFormat] = js.undefined
  
  /**
    * Toolbar header format for the Agenda view, e.g. "4/1/2015 — 5/1/2015"
    */
  var agendaHeaderFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  
  var agendaTimeFormat: js.UndefOr[DateFormat] = js.undefined
  
  var agendaTimeRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  
  /**
    * Format for the day of the month heading in the Month view.
    * e.g. "01", "02", "03", etc
    */
  var dateFormat: js.UndefOr[DateFormat] = js.undefined
  
  /**
    * A day of the week format for Week and Day headings,
    * e.g. "Wed 01/04"
    *
    */
  var dayFormat: js.UndefOr[DateFormat] = js.undefined
  
  /**
    * Toolbar header format for the Day view, e.g. "Wednesday Apr 01"
    */
  var dayHeaderFormat: js.UndefOr[DateFormat] = js.undefined
  
  /**
    * Toolbar header format for the Week views, e.g. "Mar 29 - Apr 04"
    */
  var dayRangeHeaderFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  
  /**
    * An optional event time range for events that continue from another day
    */
  var eventTimeRangeEndFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  
  /**
    * Time range displayed on events.
    */
  var eventTimeRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  
  /**
    * An optional event time range for events that continue onto another day
    */
  var eventTimeRangeStartFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  
  /**
    * Toolbar header format for the Month view, e.g "2015 April"
    *
    */
  var monthHeaderFormat: js.UndefOr[DateFormat] = js.undefined
  
  /**
    * A time range format for selecting time slots, e.g "8:00am — 2:00pm"
    */
  var selectRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  
  /**
    * The timestamp cell formats in Week and Time views, e.g. "4:00 AM"
    */
  var timeGutterFormat: js.UndefOr[DateFormat] = js.undefined
  
  /**
    * Week day name format for the Month week day headings,
    * e.g: "Sun", "Mon", "Tue", etc
    *
    */
  var weekdayFormat: js.UndefOr[DateFormat] = js.undefined
}
object Formats {
  
  inline def apply(): Formats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formats]
  }
  
  extension [Self <: Formats](x: Self) {
    
    inline def setAgendaDateFormat(value: DateFormat): Self = StObject.set(x, "agendaDateFormat", value.asInstanceOf[js.Any])
    
    inline def setAgendaDateFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "agendaDateFormat", js.Any.fromFunction3(value))
    
    inline def setAgendaDateFormatUndefined: Self = StObject.set(x, "agendaDateFormat", js.undefined)
    
    inline def setAgendaHeaderFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "agendaHeaderFormat", js.Any.fromFunction3(value))
    
    inline def setAgendaHeaderFormatUndefined: Self = StObject.set(x, "agendaHeaderFormat", js.undefined)
    
    inline def setAgendaTimeFormat(value: DateFormat): Self = StObject.set(x, "agendaTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setAgendaTimeFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "agendaTimeFormat", js.Any.fromFunction3(value))
    
    inline def setAgendaTimeFormatUndefined: Self = StObject.set(x, "agendaTimeFormat", js.undefined)
    
    inline def setAgendaTimeRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "agendaTimeRangeFormat", js.Any.fromFunction3(value))
    
    inline def setAgendaTimeRangeFormatUndefined: Self = StObject.set(x, "agendaTimeRangeFormat", js.undefined)
    
    inline def setDateFormat(value: DateFormat): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "dateFormat", js.Any.fromFunction3(value))
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDayFormat(value: DateFormat): Self = StObject.set(x, "dayFormat", value.asInstanceOf[js.Any])
    
    inline def setDayFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "dayFormat", js.Any.fromFunction3(value))
    
    inline def setDayFormatUndefined: Self = StObject.set(x, "dayFormat", js.undefined)
    
    inline def setDayHeaderFormat(value: DateFormat): Self = StObject.set(x, "dayHeaderFormat", value.asInstanceOf[js.Any])
    
    inline def setDayHeaderFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "dayHeaderFormat", js.Any.fromFunction3(value))
    
    inline def setDayHeaderFormatUndefined: Self = StObject.set(x, "dayHeaderFormat", js.undefined)
    
    inline def setDayRangeHeaderFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "dayRangeHeaderFormat", js.Any.fromFunction3(value))
    
    inline def setDayRangeHeaderFormatUndefined: Self = StObject.set(x, "dayRangeHeaderFormat", js.undefined)
    
    inline def setEventTimeRangeEndFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "eventTimeRangeEndFormat", js.Any.fromFunction3(value))
    
    inline def setEventTimeRangeEndFormatUndefined: Self = StObject.set(x, "eventTimeRangeEndFormat", js.undefined)
    
    inline def setEventTimeRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "eventTimeRangeFormat", js.Any.fromFunction3(value))
    
    inline def setEventTimeRangeFormatUndefined: Self = StObject.set(x, "eventTimeRangeFormat", js.undefined)
    
    inline def setEventTimeRangeStartFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "eventTimeRangeStartFormat", js.Any.fromFunction3(value))
    
    inline def setEventTimeRangeStartFormatUndefined: Self = StObject.set(x, "eventTimeRangeStartFormat", js.undefined)
    
    inline def setMonthHeaderFormat(value: DateFormat): Self = StObject.set(x, "monthHeaderFormat", value.asInstanceOf[js.Any])
    
    inline def setMonthHeaderFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "monthHeaderFormat", js.Any.fromFunction3(value))
    
    inline def setMonthHeaderFormatUndefined: Self = StObject.set(x, "monthHeaderFormat", js.undefined)
    
    inline def setSelectRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "selectRangeFormat", js.Any.fromFunction3(value))
    
    inline def setSelectRangeFormatUndefined: Self = StObject.set(x, "selectRangeFormat", js.undefined)
    
    inline def setTimeGutterFormat(value: DateFormat): Self = StObject.set(x, "timeGutterFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeGutterFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "timeGutterFormat", js.Any.fromFunction3(value))
    
    inline def setTimeGutterFormatUndefined: Self = StObject.set(x, "timeGutterFormat", js.undefined)
    
    inline def setWeekdayFormat(value: DateFormat): Self = StObject.set(x, "weekdayFormat", value.asInstanceOf[js.Any])
    
    inline def setWeekdayFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = StObject.set(x, "weekdayFormat", js.Any.fromFunction3(value))
    
    inline def setWeekdayFormatUndefined: Self = StObject.set(x, "weekdayFormat", js.undefined)
  }
}
