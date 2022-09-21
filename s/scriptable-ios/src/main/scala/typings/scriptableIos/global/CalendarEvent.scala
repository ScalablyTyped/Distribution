package typings.scriptableIos.global

import typings.scriptableIos.CalendarEvent.Attendees
import typings.scriptableIos.scriptableIosStrings.busy
import typings.scriptableIos.scriptableIosStrings.free
import typings.scriptableIos.scriptableIosStrings.tentative
import typings.scriptableIos.scriptableIosStrings.unavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
open class CalendarEvent ()
  extends StObject
     with typings.scriptableIos.CalendarEvent {
  
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the event or reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/calendarevent/#-addrecurrencerule
    */
  /* CompleteClass */
  override def addRecurrenceRule(recurrenceRule: typings.scriptableIos.RecurrenceRule): Unit = js.native
  
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
  /* CompleteClass */
  var availability: busy | free | tentative | unavailable = js.native
  
  /**
    * _Calendar the event is stored in._
    * @see https://docs.scriptable.app/calendarevent/#calendar
    */
  /* CompleteClass */
  var calendar: typings.scriptableIos.Calendar = js.native
  
  /**
    * _End date of event._
    * @see https://docs.scriptable.app/calendarevent/#enddate
    */
  /* CompleteClass */
  var endDate: js.Date = js.native
  
  /**
    * _Identifier of event._
    * @see https://docs.scriptable.app/calendarevent/#identifier
    */
  /* CompleteClass */
  var identifier: String = js.native
  
  /**
    * _Whether the event is an all-day event._
    * @see https://docs.scriptable.app/calendarevent/#isallday
    */
  /* CompleteClass */
  var isAllDay: Boolean = js.native
  
  /**
    * _Location of event._
    * @see https://docs.scriptable.app/calendarevent/#location
    */
  /* CompleteClass */
  var location: String = js.native
  
  /**
    * _Notes associated with event._
    * @see https://docs.scriptable.app/calendarevent/#notes
    */
  /* CompleteClass */
  var notes: String = js.native
  
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
  
  /**
    * _Start date of event._
    * @see https://docs.scriptable.app/calendarevent/#startdate
    */
  /* CompleteClass */
  var startDate: js.Date = js.native
  
  /**
    * _Time zone of event._
    *
    * Geopolitical region identifier that identifies the time zone, e.g. "Europe/Copenhagen", "America/New\_York" and "Asia/Tokyo".
    * @see https://docs.scriptable.app/calendarevent/#timezone
    */
  /* CompleteClass */
  var timeZone: String = js.native
  
  /**
    * _Title of event._
    * @see https://docs.scriptable.app/calendarevent/#title
    */
  /* CompleteClass */
  var title: String = js.native
}
object CalendarEvent {
  
  @JSGlobal("CalendarEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Events that occurs between two dates._
    * @param startDate - Start date to fetch events for.
    * @param endDate - End date to fetch events for.
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#between
    */
  /* static member */
  inline def between(startDate: js.Date, endDate: js.Date): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  inline def between(startDate: js.Date, endDate: js.Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], calendars.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  
  /**
    * _Events that occurred last week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#lastweek
    */
  /* static member */
  inline def lastWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  inline def lastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  
  /**
    * _Events that occur next week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#nextweek
    */
  /* static member */
  inline def nextWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  inline def nextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  
  /**
    * _Presents a view for creating a calendar event._
    *
    * The presented view supports editing various attributes of the event, including title, location, dates, recurrence and alerts.
    * @see https://docs.scriptable.app/calendarevent/#presentcreate
    */
  /* static member */
  inline def presentCreate(): js.Promise[typings.scriptableIos.CalendarEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("presentCreate")().asInstanceOf[js.Promise[typings.scriptableIos.CalendarEvent]]
  
  /**
    * _Events that occur this week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#thisweek
    */
  /* static member */
  inline def thisWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("thisWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  inline def thisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("thisWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  
  /**
    * _Events occurring today._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#today
    */
  /* static member */
  inline def today(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("today")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  inline def today(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("today")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  
  /**
    * _Events occurring tomorrow._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#tomorrow
    */
  /* static member */
  inline def tomorrow(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tomorrow")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  inline def tomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tomorrow")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  
  /**
    * _Events that occurred yesterday._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#yesterday
    */
  /* static member */
  inline def yesterday(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("yesterday")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
  inline def yesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("yesterday")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.CalendarEvent]]]
}
