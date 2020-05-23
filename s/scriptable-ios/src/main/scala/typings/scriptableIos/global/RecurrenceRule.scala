package typings.scriptableIos.global

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Recurrence rule used with reminders and calendar events._
  * @see https://docs.scriptable.app/recurrencerule
  */
@JSGlobal("RecurrenceRule")
@js.native
class RecurrenceRule ()
  extends typings.scriptableIos.RecurrenceRule

@JSGlobal("RecurrenceRule")
@js.native
object RecurrenceRule extends js.Object {
  /**
    * _Constructs a complex monthly recurrence rule._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every month and
    * a value of 3 specifies that the rule should repeat every third month.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param daysOfTheMonth - Days of the month to repeat the rule. Values range from 1 to 31 and from -1 to -31.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @see https://docs.scriptable.app/recurrencerule/#complexmonthly
    */
  def complexMonthly(
    interval: Double,
    daysOfTheWeek: js.Array[Double],
    daysOfTheMonth: js.Array[Double],
    setPositions: js.Array[Double]
  ): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a complex monthly recurrence rule with an end date._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every month and
    * a value of 3 specifies that the rule should repeat every third month.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param daysOfTheMonth - Days of the month to repeat the rule. Values range from 1 to 31 and from -1 to -31.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @param endDate - Date at which the recurrence rule should end.
    * @see https://docs.scriptable.app/recurrencerule/#complexmonthlyenddate
    */
  def complexMonthlyEndDate(
    interval: Double,
    daysOfTheWeek: js.Array[Double],
    daysOfTheMonth: js.Array[Double],
    setPositions: js.Array[Double],
    endDate: Date
  ): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a complex monthly recurrence rule with an occurrence count._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every month and
    * a value of 3 specifies that the rule should repeat every third month.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param daysOfTheMonth - Days of the month to repeat the rule. Values range from 1 to 31 and from -1 to -31.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @param occurrenceCount - Number of times the rule should repeat before it ends.
    * @see https://docs.scriptable.app/recurrencerule/#complexmonthlyoccurrencecount
    */
  def complexMonthlyOccurrenceCount(
    interval: Double,
    daysOfTheWeek: js.Array[Double],
    daysOfTheMonth: js.Array[Double],
    setPositions: js.Array[Double],
    occurrenceCount: Double
  ): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a complex weekly recurrence rule._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every week and
    * a value of 3 specifies that the rule should repeat every third week.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @see https://docs.scriptable.app/recurrencerule/#complexweekly
    */
  def complexWeekly(interval: Double, daysOfTheWeek: js.Array[Double], setPositions: js.Array[Double]): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a complex weekly recurrence rule with an end date._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every week and
    * a value of 3 specifies that the rule should repeat every third week.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @param endDate - Date at which the recurrence rule should end.
    * @see https://docs.scriptable.app/recurrencerule/#complexweeklyenddate
    */
  def complexWeeklyEndDate(interval: Double, daysOfTheWeek: js.Array[Double], setPositions: js.Array[Double], endDate: Date): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a complex weekly recurrence rule with an occurrence count._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every week and
    * a value of 3 specifies that the rule should repeat every third week.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @param occurrenceCount - Number of times the rule should repeat before it ends.
    * @see https://docs.scriptable.app/recurrencerule/#complexweeklyoccurrencecount
    */
  def complexWeeklyOccurrenceCount(
    interval: Double,
    daysOfTheWeek: js.Array[Double],
    setPositions: js.Array[Double],
    occurrenceCount: Double
  ): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a complex yearly recurrence rule._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every year and
    * a value of 3 specifies that the rule should repeat every third year.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param monthsOfTheYear - The months of the year to repeat the rule. Values range from 1 to 12.
    * @param weeksOfTheYear - The weeks of the year to repeat the rule. Values range from 1 to 53 and -1 to -53.
    * @param daysOfTheYear - The days of the year to repeat the rule. Values range from 1 to 366 and -1 to -366.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @see https://docs.scriptable.app/recurrencerule/#complexyearly
    */
  def complexYearly(
    interval: Double,
    daysOfTheWeek: js.Array[Double],
    monthsOfTheYear: js.Array[Double],
    weeksOfTheYear: js.Array[Double],
    daysOfTheYear: js.Array[Double],
    setPositions: js.Array[Double]
  ): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a complex yearly recurrence rule with an end date._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every year and
    * a value of 3 specifies that the rule should repeat every third week.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param monthsOfTheYear - The months of the year to repeat the rule. Values range from 1 to 12.
    * @param weeksOfTheYear - The weeks of the year to repeat the rule. Values range from 1 to 53 and -1 to -53.
    * @param daysOfTheYear - The days of the year to repeat the rule. Values range from 1 to 366 and -1 to -366.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @param endDate - Date at which the recurrence rule should end.
    * @see https://docs.scriptable.app/recurrencerule/#complexyearlyenddate
    */
  def complexYearlyEndDate(
    interval: Double,
    daysOfTheWeek: js.Array[Double],
    monthsOfTheYear: js.Array[Double],
    weeksOfTheYear: js.Array[Double],
    daysOfTheYear: js.Array[Double],
    setPositions: js.Array[Double],
    endDate: Date
  ): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a complex yearly recurrence rule with an occurrence count._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every year and
    * a value of 3 specifies that the rule should repeat every third year.
    *
    * The setPositions filters which recurrences to include in the rule's frequency. For example, a yearly recurrence rule that has a daysOfTheWeek value that specifies Monday through
    * Friday and setPositions contain 2 and -1, occurs only on the second weekday and last weekday of every year.
    * @param interval - Interval at which to repeat the rule.
    * @param daysOfTheWeek - Days of the week to repeat the rule. Values range from 1 to 7, with Sunday being 1.
    * @param monthsOfTheYear - The months of the year to repeat the rule. Values range from 1 to 12.
    * @param weeksOfTheYear - The weeks of the year to repeat the rule. Values range from 1 to 53 and -1 to -53.
    * @param daysOfTheYear - The days of the year to repeat the rule. Values range from 1 to 366 and -1 to -366.
    * @param setPositions - Filters which recurrences to include in the rule's frequency.
    * @param occurrenceCount - Number of times the rule should repeat before it ends.
    * @see https://docs.scriptable.app/recurrencerule/#complexyearlyoccurrencecount
    */
  def complexYearlyOccurrenceCount(
    interval: Double,
    daysOfTheWeek: js.Array[Double],
    monthsOfTheYear: js.Array[Double],
    weeksOfTheYear: js.Array[Double],
    daysOfTheYear: js.Array[Double],
    setPositions: js.Array[Double],
    occurrenceCount: Double
  ): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a daily recurrence rule._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every day and a
    * value of 3 specifies that the rule should repeat every third day.
    * @param interval - Interval at which to repeat the rule.
    * @see https://docs.scriptable.app/recurrencerule/#daily
    */
  def daily(interval: Double): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a daily recurrence rule with an end date._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every day and a
    * value of 3 specifies that the rule should repeat every third day.
    * @param interval - Interval at which to repeat the rule.
    * @param endDate - Date at which the recurrence rule should end.
    * @see https://docs.scriptable.app/recurrencerule/#dailyenddate
    */
  def dailyEndDate(interval: Double, endDate: Date): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a daily recurrence rule with an occurrence count._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every day and a
    * value of 3 specifies that the rule should repeat every third day.
    * @param interval - Interval at which to repeat the rule.
    * @param occurrenceCount - Number of times the rule should repeat before it ends.
    * @see https://docs.scriptable.app/recurrencerule/#dailyoccurrencecount
    */
  def dailyOccurrenceCount(interval: Double, occurrenceCount: Double): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a monthly recurrence rule._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every month and
    * a value of 3 specifies that the rule should repeat every third month.
    * @param interval - Interval at which to repeat the rule.
    * @see https://docs.scriptable.app/recurrencerule/#monthly
    */
  def monthly(interval: Double): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a monthly recurrence rule with an end date._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every month and
    * a value of 3 specifies that the rule should repeat every third month.
    * @param interval - Interval at which to repeat the rule.
    * @param endDate - Date at which the recurrence rule should end.
    * @see https://docs.scriptable.app/recurrencerule/#monthlyenddate
    */
  def monthlyEndDate(interval: Double, endDate: Date): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a monthly recurrence rule with an occurrence count._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every month and
    * a value of 3 specifies that the rule should repeat every third month.
    * @param interval - Interval at which to repeat the rule.
    * @param occurrenceCount - Number of times the rule should repeat before it ends.
    * @see https://docs.scriptable.app/recurrencerule/#monthlyoccurrencecount
    */
  def monthlyOccurrenceCount(interval: Double, occurrenceCount: Double): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a weekly recurrence rule._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every week and
    * a value of 3 specifies that the rule should repeat every third week.
    * @param interval - Interval at which to repeat the rule.
    * @see https://docs.scriptable.app/recurrencerule/#weekly
    */
  def weekly(interval: Double): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a weekly recurrence rule with an end date._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every week and
    * a value of 3 specifies that the rule should repeat every third week.
    * @param interval - Interval at which to repeat the rule.
    * @param endDate - Date at which the recurrence rule should end.
    * @see https://docs.scriptable.app/recurrencerule/#weeklyenddate
    */
  def weeklyEndDate(interval: Double, endDate: Date): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a weekly recurrence rule with an occurrence count._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every week and
    * a value of 3 specifies that the rule should repeat every third week.
    * @param interval - Interval at which to repeat the rule.
    * @param occurrenceCount - Number of times the rule should repeat before it ends.
    * @see https://docs.scriptable.app/recurrencerule/#weeklyoccurrencecount
    */
  def weeklyOccurrenceCount(interval: Double, occurrenceCount: Double): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a yearly recurrence rule._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every year and
    * a value of 3 specifies that the rule should repeat every third year.
    * @param interval - Interval at which to repeat the rule.
    * @see https://docs.scriptable.app/recurrencerule/#yearly
    */
  def yearly(interval: Double): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a yearly recurrence rule with an end date._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every year and
    * a value of 3 specifies that the rule should repeat every third year.
    * @param interval - Interval at which to repeat the rule.
    * @param endDate - Date at which the recurrence rule should end.
    * @see https://docs.scriptable.app/recurrencerule/#yearlyenddate
    */
  def yearlyEndDate(interval: Double, endDate: Date): typings.scriptableIos.RecurrenceRule = js.native
  /**
    * _Constructs a yearly recurrence rule with an occurrence count._
    *
    * The interval should have a value greater than 0 and specifies how often the the pattern repeats. For example, an interval of 1 specifies that the rule should repeat every year and
    * a value of 3 specifies that the rule should repeat every third year.
    * @param interval - Interval at which to repeat the rule.
    * @param occurrenceCount - Number of times the rule should repeat before it ends.
    * @see https://docs.scriptable.app/recurrencerule/#yearlyoccurrencecount
    */
  def yearlyOccurrenceCount(interval: Double, occurrenceCount: Double): typings.scriptableIos.RecurrenceRule = js.native
}

