package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Formats extends js.Object {
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

