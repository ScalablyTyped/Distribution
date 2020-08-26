package typings.scriptableIos.global

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Manages reminders in calendars._
  *
  * In order to add the reminder to your calendar, you must call the save() function.
  * @see https://docs.scriptable.app/reminder/#-new-reminder
  */
@JSGlobal("Reminder")
@js.native
/**
  * _Manages reminders in calendars._
  *
  * In order to add the reminder to your calendar, you must call the save() function.
  * @see https://docs.scriptable.app/reminder/#-new-reminder
  */
class Reminder ()
  extends typings.scriptableIos.Reminder

/* static members */
@JSGlobal("Reminder")
@js.native
object Reminder extends js.Object {
  /**
    * _Fetches all reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#all
    */
  def all(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def all(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches all completed reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allcompleted
    */
  def allCompleted(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allCompleted(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches due reminders._
    *
    * Fetches reminders that are due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduebetween
    */
  def allDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allDueBetween(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches all reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduelastweek
    */
  def allDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches all reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduenextweek
    */
  def allDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches all reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduethisweek
    */
  def allDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches all reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduetoday
    */
  def allDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches all reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduetomorrow
    */
  def allDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches all reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#alldueyesterday
    */
  def allDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches all incomplete reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allincomplete
    */
  def allIncomplete(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def allIncomplete(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches completed reminders._
    *
    * Fetches reminders that were completed within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedbetween
    */
  def completedBetween(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedBetween(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches completed reminders._
    *
    * Fetches reminders that are completed and that were due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduebetween
    */
  def completedDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedDueBetween(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches completed reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduelastweek
    */
  def completedDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches completed reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduenextweek
    */
  def completedDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches completed reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduethisweek
    */
  def completedDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches completed reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduetoday
    */
  def completedDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches completed reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduetomorrow
    */
  def completedDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches completed reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completeddueyesterday
    */
  def completedDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches reminders completed last week._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed last week.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedlastweek
    */
  def completedLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches reminders completed this week._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed this week.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedthisweek
    */
  def completedThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches reminders completed today._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed today.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedtoday
    */
  def completedToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def completedToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches incomplete reminders._
    *
    * Fetches reminders that are incomplete and that were due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduebetween
    */
  def incompleteDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def incompleteDueBetween(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduelastweek
    */
  def incompleteDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def incompleteDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduenextweek
    */
  def incompleteDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def incompleteDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduethisweek
    */
  def incompleteDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def incompleteDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduetoday
    */
  def incompleteDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def incompleteDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduetomorrow
    */
  def incompleteDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def incompleteDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompletedueyesterday
    */
  def incompleteDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def incompleteDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  /**
    * _Fetches the schedule of reminders._
    *
    * The fetched result contains reminders that are due today and reminders that are overdue. This is similar to the reminders shown in the Reminders apps "Scheduled" list. For
    * performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#scheduled
    */
  def scheduled(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  def scheduled(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
}

