package typings.scriptableIos.CalendarEvent

import typings.scriptableIos.Calendar
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalendarEvent")
@js.native
object ^ extends js.Object {
  /**
    * _Events that occurs between two dates._
    * @param startDate - Start date to fetch events for.
    * @param endDate - End date to fetch events for.
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#between
    */
  def between(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def between(startDate: Date, endDate: Date, calendars: js.Array[Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events that occurred last week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#lastweek
    */
  def lastWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def lastWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events that occur next week._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#nextweek
    */
  def nextWeek(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def nextWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
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
  def thisWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events occurring today._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#today
    */
  def today(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def today(calendars: js.Array[Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events occurring tomorrow._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#tomorrow
    */
  def tomorrow(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def tomorrow(calendars: js.Array[Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  /**
    * _Events that occurred yesterday._
    * @param calendars - Calendars to fetch events for. Defaults to all calendars.
    * @see https://docs.scriptable.app/calendarevent/#yesterday
    */
  def yesterday(): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
  def yesterday(calendars: js.Array[Calendar]): js.Promise[js.Array[typings.scriptableIos.CalendarEvent]] = js.native
}

