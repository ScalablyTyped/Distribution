package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideTime extends StObject {
  
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
  def getByFormat(format: String): String
  
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
  def getDisplayValue(): String
  
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
  def getDisplayValueInternal(): String
  
  /**
    * Returns the hours part of the time using the local time zone.
    *
    * @returns The hours using the local time zone.
    */
  def getHourLocalTime(): Double
  
  /**
    * Returns the hours part of the time using the local time zone. The number of hours is
    * based on a 24 hour clock.
    *
    * @returns The hours using the local time zone. The number of hours is based on a 24 hour
    * clock.
    */
  def getHourOfDayLocalTime(): Double
  
  /**
    * Returns the hours part of the time using the UTC time zone. The number of hours is
    * based on a 24 hour clock.
    *
    * @returns The hours using the UTC time zone. The number of hours is based on a 24 hour
    * clock.
    */
  def getHourOfDayUTC(): Double
  
  /**
    * Returns the hours part of the time using the UTC time zone. The number of hours is
    * based on a 12 hour clock. Noon and midnight are represented by 0, not 12.
    *
    * @returns The hours using the UTC time zone. The number of hours is based on a 12 hour
    * clock. Noon and midnight are represented by 0, not 12.
    */
  def getHourUTC(): Double
  
  /**
    * Returns the number of minutes using the local time zone.
    *
    * @returns The number of minutes using the local time zone.
    */
  def getMinutesLocalTime(): Double
  
  /**
    * Returns the number of minutes in the hour based on the UTC time zone.
    *
    * @returns The number of minutes in the hour using the UTC time zone.
    */
  def getMinutesUTC(): Double
  
  /**
    * Returns the number of seconds in the current minute.
    *
    * @returns The number of seconds in the minute.
    */
  def getSeconds(): Double
  
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
  def getValue(): String
  
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
  def setDisplayValue(asDisplayed: String): Unit
  
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
  def setValue(o: String): Unit
  
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
  def subtract(start: GlideTime, end: GlideTime): GlideDuration
}
object GlideTime {
  
  inline def apply(
    getByFormat: String => String,
    getDisplayValue: () => String,
    getDisplayValueInternal: () => String,
    getHourLocalTime: () => Double,
    getHourOfDayLocalTime: () => Double,
    getHourOfDayUTC: () => Double,
    getHourUTC: () => Double,
    getMinutesLocalTime: () => Double,
    getMinutesUTC: () => Double,
    getSeconds: () => Double,
    getValue: () => String,
    setDisplayValue: String => Unit,
    setValue: String => Unit,
    subtract: (GlideTime, GlideTime) => GlideDuration
  ): GlideTime = {
    val __obj = js.Dynamic.literal(getByFormat = js.Any.fromFunction1(getByFormat), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getDisplayValueInternal = js.Any.fromFunction0(getDisplayValueInternal), getHourLocalTime = js.Any.fromFunction0(getHourLocalTime), getHourOfDayLocalTime = js.Any.fromFunction0(getHourOfDayLocalTime), getHourOfDayUTC = js.Any.fromFunction0(getHourOfDayUTC), getHourUTC = js.Any.fromFunction0(getHourUTC), getMinutesLocalTime = js.Any.fromFunction0(getMinutesLocalTime), getMinutesUTC = js.Any.fromFunction0(getMinutesUTC), getSeconds = js.Any.fromFunction0(getSeconds), getValue = js.Any.fromFunction0(getValue), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setValue = js.Any.fromFunction1(setValue), subtract = js.Any.fromFunction2(subtract))
    __obj.asInstanceOf[GlideTime]
  }
  
  extension [Self <: GlideTime](x: Self) {
    
    inline def setGetByFormat(value: String => String): Self = StObject.set(x, "getByFormat", js.Any.fromFunction1(value))
    
    inline def setGetDisplayValue(value: () => String): Self = StObject.set(x, "getDisplayValue", js.Any.fromFunction0(value))
    
    inline def setGetDisplayValueInternal(value: () => String): Self = StObject.set(x, "getDisplayValueInternal", js.Any.fromFunction0(value))
    
    inline def setGetHourLocalTime(value: () => Double): Self = StObject.set(x, "getHourLocalTime", js.Any.fromFunction0(value))
    
    inline def setGetHourOfDayLocalTime(value: () => Double): Self = StObject.set(x, "getHourOfDayLocalTime", js.Any.fromFunction0(value))
    
    inline def setGetHourOfDayUTC(value: () => Double): Self = StObject.set(x, "getHourOfDayUTC", js.Any.fromFunction0(value))
    
    inline def setGetHourUTC(value: () => Double): Self = StObject.set(x, "getHourUTC", js.Any.fromFunction0(value))
    
    inline def setGetMinutesLocalTime(value: () => Double): Self = StObject.set(x, "getMinutesLocalTime", js.Any.fromFunction0(value))
    
    inline def setGetMinutesUTC(value: () => Double): Self = StObject.set(x, "getMinutesUTC", js.Any.fromFunction0(value))
    
    inline def setGetSeconds(value: () => Double): Self = StObject.set(x, "getSeconds", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setSetDisplayValue(value: String => Unit): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSubtract(value: (GlideTime, GlideTime) => GlideDuration): Self = StObject.set(x, "subtract", js.Any.fromFunction2(value))
  }
}
