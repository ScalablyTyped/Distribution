package typings.rcCalendar

import typings.rcCalendar.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcCalendarStrings {
  @js.native
  sealed trait date extends Mode
  
  @js.native
  sealed trait decade extends Mode
  
  @js.native
  sealed trait month extends Mode
  
  @js.native
  sealed trait time extends Mode
  
  @js.native
  sealed trait year extends Mode
  
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

