package typings.reactBigCalendar

import typings.reactBigCalendar.libAddonsDragAndDropMod.DragAction
import typings.reactBigCalendar.libAddonsDragAndDropMod.DragDirection
import typings.reactBigCalendar.mod.DayLayoutAlgorithm
import typings.reactBigCalendar.mod.NavigateAction
import typings.reactBigCalendar.mod.View
import typings.reactBigCalendar.mod.ViewKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactBigCalendarStrings {
  
  @js.native
  sealed trait AGENDA
    extends StObject
       with ViewKey
  inline def AGENDA: AGENDA = "AGENDA".asInstanceOf[AGENDA]
  
  @js.native
  sealed trait DATE
    extends StObject
       with NavigateAction
  inline def DATE: DATE = "DATE".asInstanceOf[DATE]
  
  @js.native
  sealed trait DAY
    extends StObject
       with ViewKey
  inline def DAY: DAY = "DAY".asInstanceOf[DAY]
  
  @js.native
  sealed trait DOWN
    extends StObject
       with DragDirection
  inline def DOWN: DOWN = "DOWN".asInstanceOf[DOWN]
  
  @js.native
  sealed trait LEFT
    extends StObject
       with DragDirection
  inline def LEFT: LEFT = "LEFT".asInstanceOf[LEFT]
  
  @js.native
  sealed trait MONTH
    extends StObject
       with ViewKey
  inline def MONTH: MONTH = "MONTH".asInstanceOf[MONTH]
  
  @js.native
  sealed trait NEXT
    extends StObject
       with NavigateAction
  inline def NEXT: NEXT = "NEXT".asInstanceOf[NEXT]
  
  @js.native
  sealed trait PREV
    extends StObject
       with NavigateAction
  inline def PREV: PREV = "PREV".asInstanceOf[PREV]
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with DragDirection
  inline def RIGHT: RIGHT = "RIGHT".asInstanceOf[RIGHT]
  
  @js.native
  sealed trait TODAY
    extends StObject
       with NavigateAction
  inline def TODAY: TODAY = "TODAY".asInstanceOf[TODAY]
  
  @js.native
  sealed trait UP
    extends StObject
       with DragDirection
  inline def UP: UP = "UP".asInstanceOf[UP]
  
  @js.native
  sealed trait WEEK
    extends StObject
       with ViewKey
  inline def WEEK: WEEK = "WEEK".asInstanceOf[WEEK]
  
  @js.native
  sealed trait WORK_WEEK
    extends StObject
       with ViewKey
  inline def WORK_WEEK: WORK_WEEK = "WORK_WEEK".asInstanceOf[WORK_WEEK]
  
  @js.native
  sealed trait agenda_
    extends StObject
       with View
  inline def agenda_ : agenda_ = "agenda".asInstanceOf[agenda_]
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait day_
    extends StObject
       with View
  inline def day_ : day_ = "day".asInstanceOf[day_]
  
  @js.native
  sealed trait doubleClick extends StObject
  inline def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  
  @js.native
  sealed trait ignoreEvents extends StObject
  inline def ignoreEvents: ignoreEvents = "ignoreEvents".asInstanceOf[ignoreEvents]
  
  @js.native
  sealed trait month_
    extends StObject
       with View
  inline def month_ : month_ = "month".asInstanceOf[month_]
  
  @js.native
  sealed trait move
    extends StObject
       with DragAction
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait `no-overlap`
    extends StObject
       with DayLayoutAlgorithm
  inline def `no-overlap`: `no-overlap` = "no-overlap".asInstanceOf[`no-overlap`]
  
  @js.native
  sealed trait overlap
    extends StObject
       with DayLayoutAlgorithm
  inline def overlap: overlap = "overlap".asInstanceOf[overlap]
  
  @js.native
  sealed trait resize
    extends StObject
       with DragAction
  inline def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait week_
    extends StObject
       with View
  inline def week_ : week_ = "week".asInstanceOf[week_]
  
  @js.native
  sealed trait work_week_
    extends StObject
       with View
  inline def work_week_ : work_week_ = "work_week".asInstanceOf[work_week_]
}
