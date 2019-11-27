package typings.reactDashBigDashCalendar

import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.NavigateAction
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.View
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.ViewKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashBigDashCalendarStrings {
  @js.native
  sealed trait AGENDA extends ViewKey
  
  @js.native
  sealed trait DATE extends NavigateAction
  
  @js.native
  sealed trait DAY extends ViewKey
  
  @js.native
  sealed trait MONTH extends ViewKey
  
  @js.native
  sealed trait NEXT extends NavigateAction
  
  @js.native
  sealed trait PREV extends NavigateAction
  
  @js.native
  sealed trait TODAY extends NavigateAction
  
  @js.native
  sealed trait WEEK extends ViewKey
  
  @js.native
  sealed trait WORK_WEEK extends ViewKey
  
  @js.native
  sealed trait agenda_ extends View
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait day_ extends View
  
  @js.native
  sealed trait doubleClick extends js.Object
  
  @js.native
  sealed trait ignoreEvents extends js.Object
  
  @js.native
  sealed trait month_ extends View
  
  @js.native
  sealed trait select extends js.Object
  
  @js.native
  sealed trait week_ extends View
  
  @js.native
  sealed trait work_week_ extends View
  
  @scala.inline
  def AGENDA: AGENDA = "AGENDA".asInstanceOf[AGENDA]
  @scala.inline
  def DATE: DATE = "DATE".asInstanceOf[DATE]
  @scala.inline
  def DAY: DAY = "DAY".asInstanceOf[DAY]
  @scala.inline
  def MONTH: MONTH = "MONTH".asInstanceOf[MONTH]
  @scala.inline
  def NEXT: NEXT = "NEXT".asInstanceOf[NEXT]
  @scala.inline
  def PREV: PREV = "PREV".asInstanceOf[PREV]
  @scala.inline
  def TODAY: TODAY = "TODAY".asInstanceOf[TODAY]
  @scala.inline
  def WEEK: WEEK = "WEEK".asInstanceOf[WEEK]
  @scala.inline
  def WORK_WEEK: WORK_WEEK = "WORK_WEEK".asInstanceOf[WORK_WEEK]
  @scala.inline
  def agenda_ : agenda_ = "agenda".asInstanceOf[agenda_]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def day_ : day_ = "day".asInstanceOf[day_]
  @scala.inline
  def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  @scala.inline
  def ignoreEvents: ignoreEvents = "ignoreEvents".asInstanceOf[ignoreEvents]
  @scala.inline
  def month_ : month_ = "month".asInstanceOf[month_]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def week_ : week_ = "week".asInstanceOf[week_]
  @scala.inline
  def work_week_ : work_week_ = "work_week".asInstanceOf[work_week_]
}

