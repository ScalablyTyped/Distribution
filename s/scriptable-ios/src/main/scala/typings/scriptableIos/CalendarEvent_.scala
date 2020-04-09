package typings.scriptableIos

import typings.scriptableIos.CalendarEvent.Attendees
import typings.scriptableIos.scriptableIosStrings.busy
import typings.scriptableIos.scriptableIosStrings.free
import typings.scriptableIos.scriptableIosStrings.tentative
import typings.scriptableIos.scriptableIosStrings.unavailable
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Manages events in calendars._
  *
  * In order to add the event to your calendar, you must call the save() function.
  * @see https://docs.scriptable.app/calendarevent/#-new-calendarevent
  */
@JSGlobal("CalendarEvent")
@js.native
/**
  * _Manages events in calendars._
  *
  * In order to add the event to your calendar, you must call the save() function.
  * @see https://docs.scriptable.app/calendarevent/#-new-calendarevent
  */
class CalendarEvent_ () extends js.Object {
  /**
    * _Attendees associated with the event._
    *
    * An array of objects on the following form:
    *
    *     {
    *       "isCurrentUser": false,
    *       "name": "John Appleseed",
    *       "status": "accepted",
    *       "type": "person",
    *       "role": "required"
    *     }
    *
    * Note that the property is read-only since iOS does not expose API to modify the attendees of an event.
    * @see https://docs.scriptable.app/calendarevent/#attendees
    */
  var attendees: js.Array[Attendees] = js.native
  /**
    * _Availability during the event._
    *
    * Indicates how the event should be treated for scheduling purposes. The following values are supported:
    *
    * *   busy
    * *   free
    * *   tentative
    * *   unavailable
    *
    * Be aware that not all calendars support all of these availabilities and some calendars may not support availability at all. Use `Calendar.supportsAvailability()` to check if a
    * calendar supports a specific availability.
    * @see https://docs.scriptable.app/calendarevent/#availability
    */
  var availability: busy | free | tentative | unavailable = js.native
  /**
    * _Calendar the event is stored in._
    * @see https://docs.scriptable.app/calendarevent/#calendar
    */
  var calendar: Calendar = js.native
  /**
    * _End date of event._
    * @see https://docs.scriptable.app/calendarevent/#enddate
    */
  var endDate: Date = js.native
  /**
    * _Identifier of event._
    * @see https://docs.scriptable.app/calendarevent/#identifier
    */
  var identifier: String = js.native
  /**
    * _Whether the event is an all-day event._
    * @see https://docs.scriptable.app/calendarevent/#isallday
    */
  var isAllDay: Boolean = js.native
  /**
    * _Location of event._
    * @see https://docs.scriptable.app/calendarevent/#location
    */
  var location: String = js.native
  /**
    * _Notes associated with event._
    * @see https://docs.scriptable.app/calendarevent/#notes
    */
  var notes: String = js.native
  /**
    * _Start date of event._
    * @see https://docs.scriptable.app/calendarevent/#startdate
    */
  var startDate: Date = js.native
  /**
    * _Time zone of event._
    *
    * Geopolitical region identifier that identifies the time zone, e.g. "Europe/Copenhagen", "America/New\_York" and "Asia/Tokyo".
    * @see https://docs.scriptable.app/calendarevent/#timezone
    */
  var timeZone: String = js.native
  /**
    * _Title of event._
    * @see https://docs.scriptable.app/calendarevent/#title
    */
  var title: String = js.native
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/calendarevent/#-addrecurrencerule
    */
  def addRecurrenceRule(recurrenceRule: RecurrenceRule): Unit = js.native
  /**
    * _Presents a view for editing the calendar event._
    *
    * The presented view supports editing various attributes of the event, including title, location, dates, recurrence and alerts.
    * @see https://docs.scriptable.app/calendarevent/#-presentedit
    */
  def presentEdit(): js.Promise[CalendarEvent] = js.native
  /**
    * _Removes event from calendar._
    * @see https://docs.scriptable.app/calendarevent/#-remove
    */
  def remove(): Unit = js.native
  /**
    * _Removes all recurrence rules._
    * @see https://docs.scriptable.app/calendarevent/#-removeallrecurrencerules
    */
  def removeAllRecurrenceRules(): Unit = js.native
  /**
    * _Saves event._
    *
    * Saves changes to an event, inserting it into the calendar if it is newly created.
    * @see https://docs.scriptable.app/calendarevent/#-save
    */
  def save(): Unit = js.native
}

