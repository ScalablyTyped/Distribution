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
  sealed trait agenda extends View
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait day extends View
  
  @js.native
  sealed trait doubleClick extends js.Object
  
  @js.native
  sealed trait ignoreEvents extends js.Object
  
  @js.native
  sealed trait month extends View
  
  @js.native
  sealed trait select extends js.Object
  
  @js.native
  sealed trait week extends View
  
  @js.native
  sealed trait work_week extends View
  
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
  def agenda: agenda = "agenda".asInstanceOf[agenda]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  @scala.inline
  def ignoreEvents: ignoreEvents = "ignoreEvents".asInstanceOf[ignoreEvents]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def work_week: work_week = "work_week".asInstanceOf[work_week]
}

