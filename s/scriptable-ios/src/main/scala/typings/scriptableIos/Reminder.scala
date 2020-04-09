package typings.scriptableIos

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
class Reminder () extends js.Object {
  /**
    * _Calendar the reminder is stored in._
    * @see https://docs.scriptable.app/reminder/#calendar
    */
  var calendar: Calendar = js.native
  /**
    * _Completion date of reminder._
    * @see https://docs.scriptable.app/reminder/#completiondate
    */
  var completionDate: Date = js.native
  /**
    * _Creation date of reminder._
    * @see https://docs.scriptable.app/reminder/#creationdate
    */
  var creationDate: Date = js.native
  /**
    * _Due date of reminder._
    * @see https://docs.scriptable.app/reminder/#duedate
    */
  var dueDate: Date = js.native
  /**
    * _Whether the due date includes a time._
    *
    * When this is true, assignments to the `dueDate` property will include a time, when this is false, the time component of the date will be ignored. Defaults to true.
    * @see https://docs.scriptable.app/reminder/#duedateincludestime
    */
  var dueDateIncludesTime: Boolean = js.native
  /**
    * _Identifier of reminder._
    * @see https://docs.scriptable.app/reminder/#identifier
    */
  var identifier: String = js.native
  /**
    * _Whether the reminder is completed_
    * @see https://docs.scriptable.app/reminder/#iscompleted
    */
  var isCompleted: Boolean = js.native
  /**
    * _Notes associated with reminder._
    * @see https://docs.scriptable.app/reminder/#notes
    */
  var notes: String = js.native
  /**
    * _Priority of reminder._
    *
    * Specifies the prirority of the reminder with 0 representing an undefined priority, 1 the highest priority, and 9 the lowest priority.
    * @see https://docs.scriptable.app/reminder/#priority
    */
  var priority: Double = js.native
  /**
    * _Title of reminder._
    * @see https://docs.scriptable.app/reminder/#title
    */
  var title: String = js.native
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/reminder/#-addrecurrencerule
    */
  def addRecurrenceRule(recurrenceRule: RecurrenceRule): Unit = js.native
  /**
    * _Removes reminder from calendar._
    * @see https://docs.scriptable.app/reminder/#-remove
    */
  def remove(): Unit = js.native
  /**
    * _Removes all recurrence rules._
    * @see https://docs.scriptable.app/reminder/#-removeallrecurrencerules
    */
  def removeAllRecurrenceRules(): Unit = js.native
  /**
    * _Saves reminder._
    *
    * Saves changes to a reminder, inserting it into the calendar if it is newly created.
    * @see https://docs.scriptable.app/reminder/#-save
    */
  def save(): Unit = js.native
}

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
  def all(): js.Promise[js.Array[Reminder]] = js.native
  def all(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches all completed reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allcompleted
    */
  def allCompleted(): js.Promise[js.Array[Reminder]] = js.native
  def allCompleted(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches due reminders._
    *
    * Fetches reminders that are due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduebetween
    */
  def allDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[Reminder]] = js.native
  def allDueBetween(startDate: Date, endDate: Date, calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches all reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduelastweek
    */
  def allDueLastWeek(): js.Promise[js.Array[Reminder]] = js.native
  def allDueLastWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches all reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduenextweek
    */
  def allDueNextWeek(): js.Promise[js.Array[Reminder]] = js.native
  def allDueNextWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches all reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduethisweek
    */
  def allDueThisWeek(): js.Promise[js.Array[Reminder]] = js.native
  def allDueThisWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches all reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduetoday
    */
  def allDueToday(): js.Promise[js.Array[Reminder]] = js.native
  def allDueToday(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches all reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduetomorrow
    */
  def allDueTomorrow(): js.Promise[js.Array[Reminder]] = js.native
  def allDueTomorrow(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches all reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#alldueyesterday
    */
  def allDueYesterday(): js.Promise[js.Array[Reminder]] = js.native
  def allDueYesterday(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches all incomplete reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allincomplete
    */
  def allIncomplete(): js.Promise[js.Array[Reminder]] = js.native
  def allIncomplete(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches completed reminders._
    *
    * Fetches reminders that were completed within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedbetween
    */
  def completedBetween(startDate: Date, endDate: Date): js.Promise[js.Array[Reminder]] = js.native
  def completedBetween(startDate: Date, endDate: Date, calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches completed reminders._
    *
    * Fetches reminders that are completed and that were due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduebetween
    */
  def completedDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[Reminder]] = js.native
  def completedDueBetween(startDate: Date, endDate: Date, calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches completed reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduelastweek
    */
  def completedDueLastWeek(): js.Promise[js.Array[Reminder]] = js.native
  def completedDueLastWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches completed reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduenextweek
    */
  def completedDueNextWeek(): js.Promise[js.Array[Reminder]] = js.native
  def completedDueNextWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches completed reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduethisweek
    */
  def completedDueThisWeek(): js.Promise[js.Array[Reminder]] = js.native
  def completedDueThisWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches completed reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduetoday
    */
  def completedDueToday(): js.Promise[js.Array[Reminder]] = js.native
  def completedDueToday(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches completed reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduetomorrow
    */
  def completedDueTomorrow(): js.Promise[js.Array[Reminder]] = js.native
  def completedDueTomorrow(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches completed reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completeddueyesterday
    */
  def completedDueYesterday(): js.Promise[js.Array[Reminder]] = js.native
  def completedDueYesterday(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches reminders completed last week._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed last week.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedlastweek
    */
  def completedLastWeek(): js.Promise[js.Array[Reminder]] = js.native
  def completedLastWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches reminders completed this week._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed this week.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedthisweek
    */
  def completedThisWeek(): js.Promise[js.Array[Reminder]] = js.native
  def completedThisWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches reminders completed today._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed today.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedtoday
    */
  def completedToday(): js.Promise[js.Array[Reminder]] = js.native
  def completedToday(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches incomplete reminders._
    *
    * Fetches reminders that are incomplete and that were due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduebetween
    */
  def incompleteDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[Reminder]] = js.native
  def incompleteDueBetween(startDate: Date, endDate: Date, calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduelastweek
    */
  def incompleteDueLastWeek(): js.Promise[js.Array[Reminder]] = js.native
  def incompleteDueLastWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduenextweek
    */
  def incompleteDueNextWeek(): js.Promise[js.Array[Reminder]] = js.native
  def incompleteDueNextWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduethisweek
    */
  def incompleteDueThisWeek(): js.Promise[js.Array[Reminder]] = js.native
  def incompleteDueThisWeek(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduetoday
    */
  def incompleteDueToday(): js.Promise[js.Array[Reminder]] = js.native
  def incompleteDueToday(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduetomorrow
    */
  def incompleteDueTomorrow(): js.Promise[js.Array[Reminder]] = js.native
  def incompleteDueTomorrow(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches incomplete reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompletedueyesterday
    */
  def incompleteDueYesterday(): js.Promise[js.Array[Reminder]] = js.native
  def incompleteDueYesterday(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
  /**
    * _Fetches the schedule of reminders._
    *
    * The fetched result contains reminders that are due today and reminders that are overdue. This is similar to the reminders shown in the Reminders apps "Scheduled" list. For
    * performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#scheduled
    */
  def scheduled(): js.Promise[js.Array[Reminder]] = js.native
  def scheduled(calendars: js.Array[Calendar]): js.Promise[js.Array[Reminder]] = js.native
}

