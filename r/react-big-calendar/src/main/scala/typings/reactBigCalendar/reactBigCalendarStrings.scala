package typings.reactBigCalendar

import typings.reactBigCalendar.mod.DayLayoutAlgorithm
import typings.reactBigCalendar.mod.NavigateAction
import typings.reactBigCalendar.mod.View
import typings.reactBigCalendar.mod.ViewKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactBigCalendarStrings {
  @js.native
  sealed trait AGENDA extends ViewKey
  
  @js.native
  sealed trait DATE extends NavigateAction
  
  @js.native
  sealed trait DAY extends ViewKey
  
  @js.native
  sealed trait DOWN extends js.Object
  
  @js.native
  sealed trait LEFT extends js.Object
  
  @js.native
  sealed trait MONTH extends ViewKey
  
  @js.native
  sealed trait NEXT extends NavigateAction
  
  @js.native
  sealed trait PREV extends NavigateAction
  
  @js.native
  sealed trait RIGHT extends js.Object
  
  @js.native
  sealed trait TODAY extends NavigateAction
  
  @js.native
  sealed trait UP extends js.Object
  
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
  sealed trait move extends js.Object
  
  @js.native
  sealed trait `no-overlap` extends DayLayoutAlgorithm
  
  @js.native
  sealed trait overlap extends DayLayoutAlgorithm
  
  @js.native
  sealed trait resize extends js.Object
  
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
  def DOWN: DOWN = "DOWN".asInstanceOf[DOWN]
  @scala.inline
  def LEFT: LEFT = "LEFT".asInstanceOf[LEFT]
  @scala.inline
  def MONTH: MONTH = "MONTH".asInstanceOf[MONTH]
  @scala.inline
  def NEXT: NEXT = "NEXT".asInstanceOf[NEXT]
  @scala.inline
  def PREV: PREV = "PREV".asInstanceOf[PREV]
  @scala.inline
  def RIGHT: RIGHT = "RIGHT".asInstanceOf[RIGHT]
  @scala.inline
  def TODAY: TODAY = "TODAY".asInstanceOf[TODAY]
  @scala.inline
  def UP: UP = "UP".asInstanceOf[UP]
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
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def `no-overlap`: `no-overlap` = "no-overlap".asInstanceOf[`no-overlap`]
  @scala.inline
  def overlap: overlap = "overlap".asInstanceOf[overlap]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def week_ : week_ = "week".asInstanceOf[week_]
  @scala.inline
  def work_week_ : work_week_ = "work_week".asInstanceOf[work_week_]
}

