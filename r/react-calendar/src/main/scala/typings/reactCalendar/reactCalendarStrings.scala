package typings.reactCalendar

import typings.reactCalendar.mod.CalendarType
import typings.reactCalendar.mod.Detail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactCalendarStrings {
  
  @js.native
  sealed trait Arabic extends CalendarType
  @scala.inline
  def Arabic: Arabic = "Arabic".asInstanceOf[Arabic]
  
  @js.native
  sealed trait Hebrew extends CalendarType
  @scala.inline
  def Hebrew: Hebrew = "Hebrew".asInstanceOf[Hebrew]
  
  @js.native
  sealed trait `ISO 8601` extends CalendarType
  @scala.inline
  def `ISO 8601`: `ISO 8601` = ("ISO 8601").asInstanceOf[`ISO 8601`]
  
  @js.native
  sealed trait US extends CalendarType
  @scala.inline
  def US: US = "US".asInstanceOf[US]
  
  @js.native
  sealed trait century extends Detail
  @scala.inline
  def century: century = "century".asInstanceOf[century]
  
  @js.native
  sealed trait decade extends Detail
  @scala.inline
  def decade: decade = "decade".asInstanceOf[decade]
  
  @js.native
  sealed trait end extends StObject
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait month extends Detail
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait range extends StObject
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait start extends StObject
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait year extends Detail
  @scala.inline
  def year: year = "year".asInstanceOf[year]
}
