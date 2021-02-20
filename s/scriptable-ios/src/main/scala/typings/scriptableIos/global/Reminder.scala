package typings.scriptableIos.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
class Reminder ()
  extends typings.scriptableIos.Reminder
object Reminder {
  
  /**
    * _Fetches all reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#all
    */
  /* static member */
  @JSGlobal("Reminder.all")
  @js.native
  def all(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.all")
  @js.native
  def all(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches all completed reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allcompleted
    */
  /* static member */
  @JSGlobal("Reminder.allCompleted")
  @js.native
  def allCompleted(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allCompleted")
  @js.native
  def allCompleted(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches due reminders._
    *
    * Fetches reminders that are due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduebetween
    */
  /* static member */
  @JSGlobal("Reminder.allDueBetween")
  @js.native
  def allDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allDueBetween")
  @js.native
  def allDueBetween(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches all reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduelastweek
    */
  /* static member */
  @JSGlobal("Reminder.allDueLastWeek")
  @js.native
  def allDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allDueLastWeek")
  @js.native
  def allDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches all reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduenextweek
    */
  /* static member */
  @JSGlobal("Reminder.allDueNextWeek")
  @js.native
  def allDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allDueNextWeek")
  @js.native
  def allDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches all reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduethisweek
    */
  /* static member */
  @JSGlobal("Reminder.allDueThisWeek")
  @js.native
  def allDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allDueThisWeek")
  @js.native
  def allDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches all reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduetoday
    */
  /* static member */
  @JSGlobal("Reminder.allDueToday")
  @js.native
  def allDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allDueToday")
  @js.native
  def allDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches all reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allduetomorrow
    */
  /* static member */
  @JSGlobal("Reminder.allDueTomorrow")
  @js.native
  def allDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allDueTomorrow")
  @js.native
  def allDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches all reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#alldueyesterday
    */
  /* static member */
  @JSGlobal("Reminder.allDueYesterday")
  @js.native
  def allDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allDueYesterday")
  @js.native
  def allDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches all incomplete reminders._
    *
    * For performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#allincomplete
    */
  /* static member */
  @JSGlobal("Reminder.allIncomplete")
  @js.native
  def allIncomplete(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.allIncomplete")
  @js.native
  def allIncomplete(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches completed reminders._
    *
    * Fetches reminders that were completed within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedbetween
    */
  /* static member */
  @JSGlobal("Reminder.completedBetween")
  @js.native
  def completedBetween(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedBetween")
  @js.native
  def completedBetween(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches completed reminders._
    *
    * Fetches reminders that are completed and that were due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduebetween
    */
  /* static member */
  @JSGlobal("Reminder.completedDueBetween")
  @js.native
  def completedDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedDueBetween")
  @js.native
  def completedDueBetween(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches completed reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduelastweek
    */
  /* static member */
  @JSGlobal("Reminder.completedDueLastWeek")
  @js.native
  def completedDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedDueLastWeek")
  @js.native
  def completedDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches completed reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduenextweek
    */
  /* static member */
  @JSGlobal("Reminder.completedDueNextWeek")
  @js.native
  def completedDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedDueNextWeek")
  @js.native
  def completedDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches completed reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduethisweek
    */
  /* static member */
  @JSGlobal("Reminder.completedDueThisWeek")
  @js.native
  def completedDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedDueThisWeek")
  @js.native
  def completedDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches completed reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduetoday
    */
  /* static member */
  @JSGlobal("Reminder.completedDueToday")
  @js.native
  def completedDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedDueToday")
  @js.native
  def completedDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches completed reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedduetomorrow
    */
  /* static member */
  @JSGlobal("Reminder.completedDueTomorrow")
  @js.native
  def completedDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedDueTomorrow")
  @js.native
  def completedDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches completed reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completeddueyesterday
    */
  /* static member */
  @JSGlobal("Reminder.completedDueYesterday")
  @js.native
  def completedDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedDueYesterday")
  @js.native
  def completedDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches reminders completed last week._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed last week.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedlastweek
    */
  /* static member */
  @JSGlobal("Reminder.completedLastWeek")
  @js.native
  def completedLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedLastWeek")
  @js.native
  def completedLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches reminders completed this week._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed this week.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedthisweek
    */
  /* static member */
  @JSGlobal("Reminder.completedThisWeek")
  @js.native
  def completedThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedThisWeek")
  @js.native
  def completedThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches reminders completed today._
    *
    * Note that this does not take the due date into account. This will return all reminders that you have completed today.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#completedtoday
    */
  /* static member */
  @JSGlobal("Reminder.completedToday")
  @js.native
  def completedToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.completedToday")
  @js.native
  def completedToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches incomplete reminders._
    *
    * Fetches reminders that are incomplete and that were due within the time interval constituted by the start and end dates.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduebetween
    */
  /* static member */
  @JSGlobal("Reminder.incompleteDueBetween")
  @js.native
  def incompleteDueBetween(startDate: Date, endDate: Date): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.incompleteDueBetween")
  @js.native
  def incompleteDueBetween(startDate: Date, endDate: Date, calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches incomplete reminders due last week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduelastweek
    */
  /* static member */
  @JSGlobal("Reminder.incompleteDueLastWeek")
  @js.native
  def incompleteDueLastWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.incompleteDueLastWeek")
  @js.native
  def incompleteDueLastWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches incomplete reminders due next week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduenextweek
    */
  /* static member */
  @JSGlobal("Reminder.incompleteDueNextWeek")
  @js.native
  def incompleteDueNextWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.incompleteDueNextWeek")
  @js.native
  def incompleteDueNextWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches incomplete reminders due this week._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduethisweek
    */
  /* static member */
  @JSGlobal("Reminder.incompleteDueThisWeek")
  @js.native
  def incompleteDueThisWeek(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.incompleteDueThisWeek")
  @js.native
  def incompleteDueThisWeek(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches incomplete reminders due today._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduetoday
    */
  /* static member */
  @JSGlobal("Reminder.incompleteDueToday")
  @js.native
  def incompleteDueToday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.incompleteDueToday")
  @js.native
  def incompleteDueToday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches incomplete reminders due tomorrow._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompleteduetomorrow
    */
  /* static member */
  @JSGlobal("Reminder.incompleteDueTomorrow")
  @js.native
  def incompleteDueTomorrow(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.incompleteDueTomorrow")
  @js.native
  def incompleteDueTomorrow(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches incomplete reminders due yesterday._
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#incompletedueyesterday
    */
  /* static member */
  @JSGlobal("Reminder.incompleteDueYesterday")
  @js.native
  def incompleteDueYesterday(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.incompleteDueYesterday")
  @js.native
  def incompleteDueYesterday(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  
  /**
    * _Fetches the schedule of reminders._
    *
    * The fetched result contains reminders that are due today and reminders that are overdue. This is similar to the reminders shown in the Reminders apps "Scheduled" list. For
    * performance reasons iOS limits fetched results to events within a four year timespan.
    * @param calendars - Calendars to fetch reminders for. Defaults to all calendars.
    * @see https://docs.scriptable.app/reminder/#scheduled
    */
  /* static member */
  @JSGlobal("Reminder.scheduled")
  @js.native
  def scheduled(): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
  @JSGlobal("Reminder.scheduled")
  @js.native
  def scheduled(calendars: js.Array[typings.scriptableIos.Calendar]): js.Promise[js.Array[typings.scriptableIos.Reminder]] = js.native
}
