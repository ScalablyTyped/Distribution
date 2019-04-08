package typings
package servicenowDashLondonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideTime")
@js.native
/**
  * Instantiates a GlideTime object with the current time.
  *
  * @example
  *
  * var gt = new GlideTime();
  * gs.info(gt.getDisplayValue());
  */
class GlideTime () extends js.Object {
  /**
    * Instantiates a GlideTime object with the specified time.
    *
    * @example
    *
    * var gt = new GlideTime(10000);
    * gs.info(gt.getDisplayValue());
    */
  def this(milliseconds: scala.Double) = this()
  /**
    * Gets the time in the specified format.
    *
    * @param format The time format.
    * @returns The time in the specified format.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue('12:00:00');
    * gs.info(gt.getByFormat("HH:mm"));
    */
  def getByFormat(format: java.lang.String): java.lang.String = js.native
  /**
    * Gets the time in the current user's display format and time zone.
    *
    * @returns The time in the user's format and time zone.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setDisplayValue("12:00:00"); // User Time Zone
    * gs.info(gt.getDisplayValue()); // User Time Zone
    */
  def getDisplayValue(): java.lang.String = js.native
  /**
    * Gets the display value in the current user's time zone and the internal format
    * (HH:mm:ss).
    *
    * @returns The time value for the GlideTime object in the current user's time zone and the
    * internal time format of HH:mm:ss.
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue("01:00:00"); //Internal Time Zone , UTC
    * gs.info(gt.getDisplayValueInternal()); //User Time Zone
    */
  def getDisplayValueInternal(): java.lang.String = js.native
  /**
    * Returns the hours part of the time using the local time zone.
    *
    * @returns The hours using the local time zone.
    */
  def getHourLocalTime(): scala.Double = js.native
  /**
    * Returns the hours part of the time using the local time zone. The number of hours is
    * based on a 24 hour clock.
    *
    * @returns The hours using the local time zone. The number of hours is based on a 24 hour
    * clock.
    */
  def getHourOfDayLocalTime(): scala.Double = js.native
  /**
    * Returns the hours part of the time using the UTC time zone. The number of hours is
    * based on a 24 hour clock.
    *
    * @returns The hours using the UTC time zone. The number of hours is based on a 24 hour
    * clock.
    */
  def getHourOfDayUTC(): scala.Double = js.native
  /**
    * Returns the hours part of the time using the UTC time zone. The number of hours is
    * based on a 12 hour clock. Noon and midnight are represented by 0, not 12.
    *
    * @returns The hours using the UTC time zone. The number of hours is based on a 12 hour
    * clock. Noon and midnight are represented by 0, not 12.
    */
  def getHourUTC(): scala.Double = js.native
  /**
    * Returns the number of minutes using the local time zone.
    *
    * @returns The number of minutes using the local time zone.
    */
  def getMinutesLocalTime(): scala.Double = js.native
  /**
    * Returns the number of minutes in the hour based on the UTC time zone.
    *
    * @returns The number of minutes in the hour using the UTC time zone.
    */
  def getMinutesUTC(): scala.Double = js.native
  /**
    * Returns the number of seconds in the current minute.
    *
    * @returns The number of seconds in the minute.
    */
  def getSeconds(): scala.Double = js.native
  /**
    * Gets the time value stored in the database by the GlideTime object in the internal
    * format, HH:mm:ss, and the system time zone.
    *
    * @returns The time value in the internal fomat and system time zone.
    * @example
    *
    * var gt = new GlideTime();
    * gs.info(gt.getValue()); // Internal Time Zone, UTC
    */
  def getValue(): java.lang.String = js.native
  /**
    * Sets a time value using the current user's display format and time zone.
    *
    * @param asDisplayed The time in the current user's display format and time zone. The parameter
    * must be formatted using the current user's preferred display format, such as HH:mm:ss.
    * @returns Method does not return a value
    * @example
    *
    * var gt = new GlideTime();
    * gt.setDisplayValue('01:00:00');   // User Time Zone
    * gs.info(gt.getDisplayValueInternal()); // User Time Zone
    */
  def setDisplayValue(asDisplayed: java.lang.String): scala.Unit = js.native
  /**
    * Sets the time of the GlideTime object in the internal time zone.
    *
    * @param o The time in hh:mm:ss format.
    * @returns Method does not return a value
    * @example
    *
    * var gt = new GlideTime();
    * gt.setValue('01:00:00');  //Internal Time Zone, UTC
    * gs.info("time is "+ gt.getByFormat('hh:mm:ss'));
    */
  def setValue(o: java.lang.String): scala.Unit = js.native
  /**
    * Gets the duration difference between two GlideTime object values.
    *
    * @param startTime The start value.
    * @param endTime The end value.
    * @returns The duration between the two values.
    * @example
    *
    * var gd1 = new GlideTime();
    * gd1.setDisplayValue("09:00:00");
    * var gd2 = new GlideTime();
    * gd2.setDisplayValue("09:10:00");
    * var dur = GlideDate.subtract(gd1, gd2); //the difference between gdt1 and gdt2
    * gs.info(dur.getDisplayValue());
    */
  def subtract(start: GlideTime, end: GlideTime): GlideDuration = js.native
}

