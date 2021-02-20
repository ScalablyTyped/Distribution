package typings.scriptableIos.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
class CalendarEvent ()
  extends typings.scriptableIos.CalendarEvent
object CalendarEvent {
  
  /**
    * _Events that occurs between two dates._
    * @param startDate - Start date to fetch events for.
    * @param endDate - End date to fetch events for.
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#between
    */
  /* static member */
  @JSGlobal("CalendarEvent.between")
  @js.native
  def between(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  @JSGlobal("CalendarEvent.between")
  @js.native
  def between(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  
  /**
    * _Events that occurred last week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#lastweek
    */
  /* static member */
  @JSGlobal("CalendarEvent.lastWeek")
  @js.native
  def lastWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  @JSGlobal("CalendarEvent.lastWeek")
  @js.native
  def lastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  
  /**
    * _Events that occur next week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#nextweek
    */
  /* static member */
  @JSGlobal("CalendarEvent.nextWeek")
  @js.native
  def nextWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  @JSGlobal("CalendarEvent.nextWeek")
  @js.native
  def nextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  
  /**
    * _Presents a view for creating a calendar event._
    *
    * The presented view supports editing various attributes of the event, including title, location, dates, recurrence and alerts.
    * @see https://docs.scriptable.app/calendarevent/#presentcreate
    */
  /* static member */
  @JSGlobal("CalendarEvent.presentCreate")
  @js.native
  def presentCreate(): js.Promise[typings.scriptableIos.CalendarEvent] = js.native
  
  /**
    * _Events that occur this week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#thisweek
    */
  /* static member */
  @JSGlobal("CalendarEvent.thisWeek")
  @js.native
  def thisWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  @JSGlobal("CalendarEvent.thisWeek")
  @js.native
  def thisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  
  /**
    * _Events occurring today._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#today
    */
  /* static member */
  @JSGlobal("CalendarEvent.today")
  @js.native
  def today(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  @JSGlobal("CalendarEvent.today")
  @js.native
  def today(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  
  /**
    * _Events occurring tomorrow._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#tomorrow
    */
  /* static member */
  @JSGlobal("CalendarEvent.tomorrow")
  @js.native
  def tomorrow(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  @JSGlobal("CalendarEvent.tomorrow")
  @js.native
  def tomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  
  /**
    * _Events that occurred yesterday._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#yesterday
    */
  /* static member */
  @JSGlobal("CalendarEvent.yesterday")
  @js.native
  def yesterday(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  @JSGlobal("CalendarEvent.yesterday")
  @js.native
  def yesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
}
