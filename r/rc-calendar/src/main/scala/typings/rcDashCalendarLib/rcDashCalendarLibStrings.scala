package typings
package rcDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashCalendarLibStrings {
  @js.native
  sealed trait date
    extends rcDashCalendarLib.rcDashCalendarMod.Mode
  
  @js.native
  sealed trait decade
    extends rcDashCalendarLib.rcDashCalendarMod.Mode
  
  @js.native
  sealed trait month
    extends rcDashCalendarLib.rcDashCalendarMod.Mode
  
  @js.native
  sealed trait time
    extends rcDashCalendarLib.rcDashCalendarMod.Mode
  
  @js.native
  sealed trait year
    extends rcDashCalendarLib.rcDashCalendarMod.Mode
  
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def decade: decade = "decade".asInstanceOf[decade]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
}

