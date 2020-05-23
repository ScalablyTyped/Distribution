package typings.scriptableIos.global

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
class CalendarEvent ()
  extends typings.scriptableIos.CalendarEvent {
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
  /* CompleteClass */
  override var attendees: js.Array[Attendees] = js.native
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
  /* CompleteClass */
  override var availability: busy | free | tentative | unavailable = js.native
  /**
    * _Calendar the event is stored in._
    * @see https://docs.scriptable.app/calendarevent/#calendar
    */
  /* CompleteClass */
  override var calendar: typings.scriptableIos.Calendar = js.native
  /**
    * _End date of event._
    * @see https://docs.scriptable.app/calendarevent/#enddate
    */
  /* CompleteClass */
  override var endDate: Date = js.native
  /**
    * _Identifier of event._
    * @see https://docs.scriptable.app/calendarevent/#identifier
    */
  /* CompleteClass */
  override var identifier: String = js.native
  /**
    * _Whether the event is an all-day event._
    * @see https://docs.scriptable.app/calendarevent/#isallday
    */
  /* CompleteClass */
  override var isAllDay: Boolean = js.native
  /**
    * _Location of event._
    * @see https://docs.scriptable.app/calendarevent/#location
    */
  /* CompleteClass */
  override var location: String = js.native
  /**
    * _Notes associated with event._
    * @see https://docs.scriptable.app/calendarevent/#notes
    */
  /* CompleteClass */
  override var notes: String = js.native
  /**
    * _Start date of event._
    * @see https://docs.scriptable.app/calendarevent/#startdate
    */
  /* CompleteClass */
  override var startDate: Date = js.native
  /**
    * _Time zone of event._
    *
    * Geopolitical region identifier that identifies the time zone, e.g. "Europe/Copenhagen", "America/New\_York" and "Asia/Tokyo".
    * @see https://docs.scriptable.app/calendarevent/#timezone
    */
  /* CompleteClass */
  override var timeZone: String = js.native
  /**
    * _Title of event._
    * @see https://docs.scriptable.app/calendarevent/#title
    */
  /* CompleteClass */
  override var title: String = js.native
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/calendarevent/#-addrecurrencerule
    */
  /* CompleteClass */
  override def addRecurrenceRule(recurrenceRule: typings.scriptableIos.RecurrenceRule): Unit = js.native
  /**
    * _Presents a view for editing the calendar event._
    *
    * The presented view supports editing various attributes of the event, including title, location, dates, recurrence and alerts.
    * @see https://docs.scriptable.app/calendarevent/#-presentedit
    */
  /* CompleteClass */
  override def presentEdit(): js.Promise[typings.scriptableIos.CalendarEvent] = js.native
  /**
    * _Removes event from calendar._
    * @see https://docs.scriptable.app/calendarevent/#-remove
    */
  /* CompleteClass */
  override def remove(): Unit = js.native
  /**
    * _Removes all recurrence rules._
    * @see https://docs.scriptable.app/calendarevent/#-removeallrecurrencerules
    */
  /* CompleteClass */
  override def removeAllRecurrenceRules(): Unit = js.native
  /**
    * _Saves event._
    *
    * Saves changes to an event, inserting it into the calendar if it is newly created.
    * @see https://docs.scriptable.app/calendarevent/#-save
    */
  /* CompleteClass */
  override def save(): Unit = js.native
}

/* static members */
@JSGlobal("CalendarEvent")
@js.native
object CalendarEvent extends js.Object {
  /**
    * _Events that occurs between two dates._
    * @param startDate - Start date to fetch events for.
    * @param endDate - End date to fetch events for.
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#between
    */
  def between(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def between(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events that occurred last week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#lastweek
    */
  def lastWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def lastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events that occur next week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#nextweek
    */
  def nextWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def nextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Presents a view for creating a calendar event._
    *
    * The presented view supports editing various attributes of the event, including title, location, dates, recurrence and alerts.
    * @see https://docs.scriptable.app/calendarevent/#presentcreate
    */
  def presentCreate(): js.Promise[typings.scriptableIos.CalendarEvent] = js.native
  /**
    * _Events that occur this week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#thisweek
    */
  def thisWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def thisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events occurring today._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#today
    */
  def today(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def today(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events occurring tomorrow._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#tomorrow
    */
  def tomorrow(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def tomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events that occurred yesterday._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#yesterday
    */
  def yesterday(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def yesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
}

