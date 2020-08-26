package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideSchedule extends js.Object {
  /**
    * Adds a new schedule segment to the current schedule.
    *
    * @param startDate The starting date of the new schedule segment.
    * @param offSet The time offset of the new schedule segment.
    * @returns The schedule updated with the new schedule segment.
    *
    * @example
    *
    * var startDate = new GlideDateTime('2014-01-02');
    * var days = 2;
    * var dur = new GlideDuration(60 * 60 * 24 * 1000 * days);
    * var schedule = new GlideSchedule();
    * var end = schedule.add(startDate, dur);
    * gs.info(end);
    */
  def add(startDate: GlideDateTime, offset: GlideDuration): GlideDateTime = js.native
  /**
    * Determines the elapsed time in the schedule between two date time values using the
    * timezone of the schedule or, if that is not specified, the timezone of the session.
    *
    * @param startDate The starting datetime.
    * @param endDate The ending datetime.
    * @returns The difference between the starting and ending datetime.
    *
    * @example
    *
    * var startDate = new GlideDateTime('2014-10-16 02:00:00');
    * var endDate = new GlideDateTime('2014-10-18 04:00:00');
    * var schedule = new GlideSchedule();
    * // loads "8-5 weekdays excluding holidays" schedule
    * schedule.load('090eecae0a0a0b260077e1dfa71da828');
    * var duration = schedule.duration(startDate, endDate);
    * gs.info(duration.getDurationValue()); // gets the elapsed time in schedule
    */
  def duration(startDate: GlideDateTime, endDate: GlideDateTime): GlideDuration = js.native
  /**
    * Retrieves the schedule name.
    *
    * @returns The name of the current schedule.
    *
    * @example
    *
    * sys_id ='04e664654a36232701a2247dcd8fc4cf'; // sys_id for "Application" schedule record
    * var sched = new GlideSchedule(sys_id);
    * gs.info(sched.getName());
    */
  def getName(): String = js.native
  /**
    * Determines if the given datetime is within the current schedule.
    *
    * @param time The datetime value to check.
    * @returns True if the specified datetime is within the schedule; otherwise,
    * false.
    *
    * @example
    *
    * var g = new GlideRecord('cmn_schedule');
    * g.addQuery('type', 'blackout');
    * g.query();
    * if (g.next()) {
    *   var sched = new GlideSchedule(g.sys_id);
    *   var d = new GlideDateTime();
    *   d.setDisplayValue("2007-09-18 12:00:00");
    *   if (sched.isInSchedule(d))
    *     gs.info("Is in the schedule");
    *   else
    *     gs.info("Is NOT in the schedule");
    * }
    */
  def isInSchedule(time: GlideDateTime): String = js.native
  /**
    * Determines if the current schedule is valid. A schedule is valid if it has at least one
    * schedule span.
    *
    * @returns True if the schedule is valid.
    *
    * @example
    *
    * var g = new GlideRecord('cmn_schedule');
    * g.addQuery('type', 'blackout');
    * g.query();
    * if (g.next()) {
    *   var sched = new GlideSchedule(g.sys_id);
    *   var d = new GlideDateTime();
    *   d.setDisplayValue("2007-09-18 12:00:00");
    *   if (sched.isValid())
    *     gs.info("Is valid");
    *   else
    *     gs.info("Is not valid");
    * }
    */
  def isValid(): Boolean = js.native
  /**
    * Loads a schedule with the schedule information.
    *
    * @param sysID The system ID of the schedule.
    * @param [timeZone] (Optional) The timezone. If a timezone is not specified, or is nil, the
    * current session timezone is used for the schedule.
    * @param [excludeSpanID] Any span to exclude.
    * @returns Method does not return a value
    *
    * @example
    *
    * var x = new GlideSchedule();
    * x.load('08fcd0830a0a0b2600079f56b1adb9ae');
    */
  def load(sysId: String): Unit = js.native
  def load(sysId: String, timeZone: js.UndefOr[scala.Nothing], excludeSpanId: String): Unit = js.native
  def load(sysId: String, timeZone: String): Unit = js.native
  def load(sysId: String, timeZone: String, excludeSpanId: String): Unit = js.native
  /**
    * Sets the timezone for the current schedule.
    *
    * @param timeZone The timezone.
    * @returns Method does not return a value
    *
    * @example
    *
    * var schedule = new GlideSchedule();
    * schedule.setTimeZone('US/Pacific');
    */
  def setTimeZone(tz: String): Unit = js.native
  /**
    * Determines how much time (in milliseconds) until start time of the next schedule
    * item.
    *
    * @param time The time to be evaluated.
    * @param [timeZone] The timezone.
    * @returns The number of milliseconds until the start time of the next schedule item.
    * Returns -1 if never.
    *
    * @example
    *
    * var startDate = new GlideDateTime('2014-10-25 08:00:00');
    * var glideSchedule = new GlideSchedule('08fcd0830a0a0b2600079f56b1adb9ae', 'UTC');
    * gs.info(glideSchedule.whenNext(startDate));
    */
  def whenNext(time: GlideDateTime): Double = js.native
  def whenNext(time: GlideDateTime, timeZone: String): Double = js.native
}

