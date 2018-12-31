package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateConstructor
  extends org.scalablytyped.runtime.Instantiable0[Date]
     with org.scalablytyped.runtime.Instantiable2[/* year */ scala.Double, /* month */ scala.Double, Date]
     with org.scalablytyped.runtime.Instantiable3[/* year */ scala.Double, /* month */ scala.Double, /* date */ scala.Double, Date]
     with org.scalablytyped.runtime.Instantiable4[
      /* year */ scala.Double, 
      /* month */ scala.Double, 
      /* date */ scala.Double, 
      /* hours */ scala.Double, 
      Date
    ]
     with org.scalablytyped.runtime.Instantiable5[
      /* year */ scala.Double, 
      /* month */ scala.Double, 
      /* date */ scala.Double, 
      /* hours */ scala.Double, 
      /* minutes */ scala.Double, 
      Date
    ]
     with org.scalablytyped.runtime.Instantiable6[
      /* year */ scala.Double, 
      /* month */ scala.Double, 
      /* date */ scala.Double, 
      /* hours */ scala.Double, 
      /* minutes */ scala.Double, 
      /* seconds */ scala.Double, 
      Date
    ]
     with org.scalablytyped.runtime.Instantiable7[
      /* year */ scala.Double, 
      /* month */ scala.Double, 
      /* date */ scala.Double, 
      /* hours */ scala.Double, 
      /* minutes */ scala.Double, 
      /* seconds */ scala.Double, 
      /* ms */ scala.Double, 
      Date
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* value */ Date) | (/* value */ scala.Double) | (/* value */ java.lang.String) | (/* vd */ VarDate), 
      Date
    ] {
  def apply(): java.lang.String = js.native
  /**
    * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
    * @param year The full year designation is required for cross-century date accuracy. If year is between 0 and 99 is used, then year is assumed to be 1900 + year.
    * @param month The month as an number between 0 and 11 (January to December).
    * @param date The date as an number between 1 and 31.
    * @param hours Must be supplied if minutes is supplied. An number from 0 to 23 (midnight to 11pm) that specifies the hour.
    * @param minutes Must be supplied if seconds is supplied. An number from 0 to 59 that specifies the minutes.
    * @param seconds Must be supplied if milliseconds is supplied. An number from 0 to 59 that specifies the seconds.
    * @param ms An number from 0 to 999 that specifies the milliseconds.
    */
  def UTC(year: scala.Double, month: scala.Double): scala.Double = js.native
  def UTC(year: scala.Double, month: scala.Double, date: scala.Double): scala.Double = js.native
  def UTC(year: scala.Double, month: scala.Double, date: scala.Double, hours: scala.Double): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double
  ): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double
  ): scala.Double = js.native
  def UTC(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double,
    ms: scala.Double
  ): scala.Double = js.native
  def now(): scala.Double = js.native
  /**
    * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
    * @param s A date string
    */
  def parse(s: java.lang.String): scala.Double = js.native
}

