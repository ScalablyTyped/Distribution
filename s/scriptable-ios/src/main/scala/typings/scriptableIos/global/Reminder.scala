package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
open class Reminder ()
  extends StObject
     with typings.scriptableIos.Reminder {
  
  /**
    * _Adds a recurrence rule._
    *
    * Recurrence rules specify when the reminder should be repeated. See the documentation of RecurrenceRule for more information on creating rules.
    * @param recurrenceRule - Recurrence rule to add to the reminder.
    * @see https://docs.scriptable.app/reminder/#-addrecurrencerule
    */
  /* CompleteClass */
  override def addRecurrenceRule(recurrenceRule: typings.scriptableIos.RecurrenceRule): Unit = js.native
  
  /**
    * _Calendar the reminder is stored in._
    * @see https://docs.scriptable.app/reminder/#calendar
    */
  /* CompleteClass */
  var calendar: typings.scriptableIos.Calendar = js.native
  
  /**
    * _Completion date of reminder._
    * @see https://docs.scriptable.app/reminder/#completiondate
    */
  /* CompleteClass */
  var completionDate: js.Date = js.native
  
  /**
    * _Creation date of reminder._
    * @see https://docs.scriptable.app/reminder/#creationdate
    */
  /* CompleteClass */
  var creationDate: js.Date = js.native
  
  /**
    * _Due date of reminder._
    * @see https://docs.scriptable.app/reminder/#duedate
    */
  /* CompleteClass */
  var dueDate: js.Date = js.native
  
  /**
    * _Whether the due date includes a time._
    *
    * When this is true, assignments to the `dueDate` property will include a time, when this is false, the time component of the date will be ignored. Defaults to true.
    * @see https://docs.scriptable.app/reminder/#duedateincludestime
    */
  /* CompleteClass */
  var dueDateIncludesTime: Boolean = js.native
  
  /**
    * _Identifier of reminder._
    * @see https://docs.scriptable.app/reminder/#identifier
    */
  /* CompleteClass */
  var identifier: String = js.native
  
  /**
    * _Whether the reminder is completed._
    * @see https://docs.scriptable.app/reminder/#iscompleted
    */
  /* CompleteClass */
  var isCompleted: Boolean = js.native
  
  /**
    * _Whether the reminder is overdue._
    * @see https://docs.scriptable.app/reminder/#isoverdue
    */
  /* CompleteClass */
  var isOverdue: Boolean = js.native
  
  /**
    * _Notes associated with reminder._
    * @see https://docs.scriptable.app/reminder/#notes
    */
  /* CompleteClass */
  var notes: String = js.native
  
  /**
    * _Priority of reminder._
    *
    * Specifies the prirority of the reminder with 0 representing an undefined priority, 1 the highest priority, and 9 the lowest priority.
    * @see https://docs.scriptable.app/reminder/#priority
    */
  /* CompleteClass */
  var priority: Double = js.native
  
  /**
    * _Removes reminder from calendar._
    * @see https://docs.scriptable.app/reminder/#-remove
    */
  /* CompleteClass */
  override def remove(): Unit = js.native
  
  /**
    * _Removes all recurrence rules._
    * @see https://docs.scriptable.app/reminder/#-removeallrecurrencerules
    */
  /* CompleteClass */
  override def removeAllRecurrenceRules(): Unit = js.native
  
  /**
    * _Saves reminder._
    *
    * Saves changes to a reminder, inserting it into the calendar if it is newly created.
    * @see https://docs.scriptable.app/reminder/#-save
    */
  /* CompleteClass */
  override def save(): Unit = js.native
  
  /**
    * _Title of reminder._
    * @see https://docs.scriptable.app/reminder/#title
    */
  /* CompleteClass */
  var title: String = js.native
}
object Reminder {
  
  @JSGlobal("Reminder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Fetches all reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#all
    */
  /* static member */
  inline def all(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def all(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches all completed reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allcompleted
    */
  /* static member */
  inline def allCompleted(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allCompleted")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allCompleted(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allCompleted")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches due reminders._
    *
    * Fetches reminders that are due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduebetween
    */
  /* static member */
  inline def allDueBetween(startDate: js.Date, endDate: js.Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allDueBetween")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allDueBetween(startDate: js.Date, endDate: js.Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allDueBetween")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], calendars.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches all reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduelastweek
    */
  /* static member */
  inline def allDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueLastWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueLastWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches all reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduenextweek
    */
  /* static member */
  inline def allDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueNextWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueNextWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches all reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduethisweek
    */
  /* static member */
  inline def allDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueThisWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueThisWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches all reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduetoday
    */
  /* static member */
  inline def allDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueToday")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueToday")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches all reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduetomorrow
    */
  /* static member */
  inline def allDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueTomorrow")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueTomorrow")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches all reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#alldueyesterday
    */
  /* static member */
  inline def allDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueYesterday")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDueYesterday")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches all incomplete reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allincomplete
    */
  /* static member */
  inline def allIncomplete(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allIncomplete")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def allIncomplete(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allIncomplete")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches completed reminders._
    *
    * Fetches reminders that were completed within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedbetween
    */
  /* static member */
  inline def completedBetween(startDate: js.Date, endDate: js.Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("completedBetween")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedBetween(startDate: js.Date, endDate: js.Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("completedBetween")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], calendars.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches completed reminders._
    *
    * Fetches reminders that are completed and that were due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduebetween
    */
  /* static member */
  inline def completedDueBetween(startDate: js.Date, endDate: js.Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("completedDueBetween")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedDueBetween(startDate: js.Date, endDate: js.Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("completedDueBetween")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], calendars.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches completed reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduelastweek
    */
  /* static member */
  inline def completedDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueLastWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueLastWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches completed reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduenextweek
    */
  /* static member */
  inline def completedDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueNextWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueNextWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches completed reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduethisweek
    */
  /* static member */
  inline def completedDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueThisWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueThisWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches completed reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduetoday
    */
  /* static member */
  inline def completedDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueToday")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueToday")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches completed reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduetomorrow
    */
  /* static member */
  inline def completedDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueTomorrow")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueTomorrow")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches completed reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completeddueyesterday
    */
  /* static member */
  inline def completedDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueYesterday")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedDueYesterday")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches reminders completed last week._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed last week.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedlastweek
    */
  /* static member */
  inline def completedLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedLastWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedLastWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches reminders completed this week._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed this week.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedthisweek
    */
  /* static member */
  inline def completedThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedThisWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedThisWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches reminders completed today._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed today.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedtoday
    */
  /* static member */
  inline def completedToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedToday")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def completedToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("completedToday")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches incomplete reminders._
    *
    * Fetches reminders that are incomplete and that were due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduebetween
    */
  /* static member */
  inline def incompleteDueBetween(startDate: js.Date, endDate: js.Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueBetween")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def incompleteDueBetween(startDate: js.Date, endDate: js.Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = (^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueBetween")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], calendars.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches incomplete reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduelastweek
    */
  /* static member */
  inline def incompleteDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueLastWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def incompleteDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueLastWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches incomplete reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduenextweek
    */
  /* static member */
  inline def incompleteDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueNextWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def incompleteDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueNextWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches incomplete reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduethisweek
    */
  /* static member */
  inline def incompleteDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueThisWeek")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def incompleteDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueThisWeek")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches incomplete reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduetoday
    */
  /* static member */
  inline def incompleteDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueToday")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def incompleteDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueToday")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches incomplete reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduetomorrow
    */
  /* static member */
  inline def incompleteDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueTomorrow")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def incompleteDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueTomorrow")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches incomplete reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompletedueyesterday
    */
  /* static member */
  inline def incompleteDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueYesterday")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def incompleteDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("incompleteDueYesterday")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  
  /**
    * _Fetches the schedule of reminders._
    *
    * The fetched result contains reminders that are due today and reminders that are overdue. This is similar to the reminders shown in the Reminders apps "Scheduled" list. For
    * performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#scheduled
    */
  /* static member */
  inline def scheduled(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduled")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
  inline def scheduled(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduled")(calendars.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Reminder]]]
}
