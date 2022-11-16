package typings.std.global

import typings.std.DateConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Date")
@js.native
/* standard es5 */
open class Date ()
  extends StObject
     with typings.std.Date {
  def this(value: java.lang.String) = this()
  def this(value: js.Date) = this()
  /* standard es5 */
  def this(value: Double) = this()
  /* standard scripthost */
  def this(vd: typings.std.VarDate) = this()
  /**
    * Creates a new Date.
    * @param year The full year designation is required for cross-century date accuracy. If year is between 0 and 99 is used, then year is assumed to be 1900 + year.
    * @param monthIndex The month as a number between 0 and 11 (January to December).
    * @param date The date as a number between 1 and 31.
    * @param hours Must be supplied if minutes is supplied. A number from 0 to 23 (midnight to 11pm) that specifies the hour.
    * @param minutes Must be supplied if seconds is supplied. A number from 0 to 59 that specifies the minutes.
    * @param seconds Must be supplied if milliseconds is supplied. A number from 0 to 59 that specifies the seconds.
    * @param ms A number from 0 to 999 that specifies the milliseconds.
    */
  /* standard es5 */
  def this(year: Double, monthIndex: Double) = this()
  def this(year: Double, monthIndex: Double, date: Double) = this()
  def this(year: Double, monthIndex: Double, date: Double, hours: Double) = this()
  def this(year: Double, monthIndex: Double, date: Unit, hours: Double) = this()
  def this(year: Double, monthIndex: Double, date: Double, hours: Double, minutes: Double) = this()
  def this(year: Double, monthIndex: Double, date: Double, hours: Unit, minutes: Double) = this()
  def this(year: Double, monthIndex: Double, date: Unit, hours: Double, minutes: Double) = this()
  def this(year: Double, monthIndex: Double, date: Unit, hours: Unit, minutes: Double) = this()
  def this(year: Double, monthIndex: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
  def this(year: Double, monthIndex: Double, date: Double, hours: Double, minutes: Unit, seconds: Double) = this()
  def this(year: Double, monthIndex: Double, date: Double, hours: Unit, minutes: Double, seconds: Double) = this()
  def this(year: Double, monthIndex: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double) = this()
  def this(year: Double, monthIndex: Double, date: Unit, hours: Double, minutes: Double, seconds: Double) = this()
  def this(year: Double, monthIndex: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double) = this()
  def this(year: Double, monthIndex: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double) = this()
  def this(year: Double, monthIndex: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Unit,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Double,
    hours: Double,
    minutes: Unit,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Double,
    hours: Double,
    minutes: Unit,
    seconds: Unit,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Double,
    hours: Unit,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Double,
    hours: Unit,
    minutes: Double,
    seconds: Unit,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Double,
    hours: Unit,
    minutes: Unit,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Double,
    hours: Unit,
    minutes: Unit,
    seconds: Unit,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Unit,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Unit,
    hours: Double,
    minutes: Double,
    seconds: Unit,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Unit,
    hours: Double,
    minutes: Unit,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Unit,
    hours: Double,
    minutes: Unit,
    seconds: Unit,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Unit,
    hours: Unit,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Unit,
    hours: Unit,
    minutes: Double,
    seconds: Unit,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Unit,
    hours: Unit,
    minutes: Unit,
    seconds: Double,
    ms: Double
  ) = this()
  def this(
    year: Double,
    monthIndex: Double,
    date: Unit,
    hours: Unit,
    minutes: Unit,
    seconds: Unit,
    ms: Double
  ) = this()
}
object Date {
  
  inline def apply: DateConstructor = js.Dynamic.global.selectDynamic("Date").asInstanceOf[DateConstructor]
}
