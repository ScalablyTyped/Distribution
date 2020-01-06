package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable7
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateConstructor
  extends Instantiable0[Date]
     with Instantiable1[
      (/* value */ Date) | (/* value */ Double) | (/* value */ java.lang.String) | (/* vd */ VarDate), 
      Date
    ]
     with Instantiable2[/* year */ Double, /* month */ Double, Date]
     with Instantiable3[/* year */ Double, /* month */ Double, /* date */ Double, Date]
     with Instantiable4[/* year */ Double, /* month */ Double, /* date */ Double, /* hours */ Double, Date]
     with Instantiable5[
      /* year */ Double, 
      /* month */ Double, 
      /* date */ Double, 
      /* hours */ Double, 
      /* minutes */ Double, 
      Date
    ]
     with Instantiable6[
      /* year */ Double, 
      /* month */ Double, 
      /* date */ Double, 
      /* hours */ Double, 
      /* minutes */ Double, 
      /* seconds */ Double, 
      Date
    ]
     with Instantiable7[
      /* year */ Double, 
      /* month */ Double, 
      /* date */ Double, 
      /* hours */ Double, 
      /* minutes */ Double, 
      /* seconds */ Double, 
      /* ms */ Double, 
      Date
    ] {
  def apply(): java.lang.String = js.native
  /**
    * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
    * @param year The full year designation is required for cross-century date accuracy. If year is between 0 and 99 is used, then year is assumed to be 1900 + year.
    * @param month The month as a number between 0 and 11 (January to December).
    * @param date The date as a number between 1 and 31.
    * @param hours Must be supplied if minutes is supplied. A number from 0 to 23 (midnight to 11pm) that specifies the hour.
    * @param minutes Must be supplied if seconds is supplied. A number from 0 to 59 that specifies the minutes.
    * @param seconds Must be supplied if milliseconds is supplied. A number from 0 to 59 that specifies the seconds.
    * @param ms A number from 0 to 999 that specifies the milliseconds.
    */
  def UTC(year: Double, month: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Double, minutes: Double): Double = js.native
  def UTC(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double): Double = js.native
  def UTC(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Double = js.native
  def now(): Double = js.native
  /**
    * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
    * @param s A date string
    */
  def parse(s: java.lang.String): Double = js.native
}

