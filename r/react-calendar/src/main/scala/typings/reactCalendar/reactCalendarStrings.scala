package typings.reactCalendar

import typings.reactCalendar.mod.CalendarType
import typings.reactCalendar.mod.Detail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactCalendarStrings {
  @js.native
  sealed trait Arabic extends CalendarType
  
  @js.native
  sealed trait Hebrew extends CalendarType
  
  @js.native
  sealed trait `ISO 8601` extends CalendarType
  
  @js.native
  sealed trait US extends CalendarType
  
  @js.native
  sealed trait century extends Detail
  
  @js.native
  sealed trait decade extends Detail
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait month extends Detail
  
  @js.native
  sealed trait range extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait year extends Detail
  
  @scala.inline
  def Arabic: Arabic = "Arabic".asInstanceOf[Arabic]
  @scala.inline
  def Hebrew: Hebrew = "Hebrew".asInstanceOf[Hebrew]
  @scala.inline
  def `ISO 8601`: `ISO 8601` = ("ISO 8601").asInstanceOf[`ISO 8601`]
  @scala.inline
  def US: US = "US".asInstanceOf[US]
  @scala.inline
  def century: century = "century".asInstanceOf[century]
  @scala.inline
  def decade: decade = "decade".asInstanceOf[decade]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
}

