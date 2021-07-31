package typings.reactBeautifulDnd

import typings.reactBeautifulDnd.mod.Direction
import typings.reactBeautifulDnd.mod.DropReason
import typings.reactBeautifulDnd.mod.DroppableMode
import typings.reactBeautifulDnd.mod.InOutAnimationMode
import typings.reactBeautifulDnd.mod.MovementMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactBeautifulDndStrings {
  
  @js.native
  sealed trait CANCEL
    extends StObject
       with DropReason
  @scala.inline
  def CANCEL: CANCEL = "CANCEL".asInstanceOf[CANCEL]
  
  @js.native
  sealed trait COLLECTING extends StObject
  @scala.inline
  def COLLECTING: COLLECTING = "COLLECTING".asInstanceOf[COLLECTING]
  
  @js.native
  sealed trait COMBINE extends StObject
  @scala.inline
  def COMBINE: COMBINE = "COMBINE".asInstanceOf[COMBINE]
  
  @js.native
  sealed trait DRAGGING extends StObject
  @scala.inline
  def DRAGGING: DRAGGING = "DRAGGING".asInstanceOf[DRAGGING]
  
  @js.native
  sealed trait DROP
    extends StObject
       with DropReason
  @scala.inline
  def DROP: DROP = "DROP".asInstanceOf[DROP]
  
  @js.native
  sealed trait DROP_ANIMATING extends StObject
  @scala.inline
  def DROP_ANIMATING: DROP_ANIMATING = "DROP_ANIMATING".asInstanceOf[DROP_ANIMATING]
  
  @js.native
  sealed trait DROP_PENDING extends StObject
  @scala.inline
  def DROP_PENDING: DROP_PENDING = "DROP_PENDING".asInstanceOf[DROP_PENDING]
  
  @js.native
  sealed trait FLUID
    extends StObject
       with MovementMode
  @scala.inline
  def FLUID: FLUID = "FLUID".asInstanceOf[FLUID]
  
  @js.native
  sealed trait IDLE extends StObject
  @scala.inline
  def IDLE: IDLE = "IDLE".asInstanceOf[IDLE]
  
  @js.native
  sealed trait REORDER extends StObject
  @scala.inline
  def REORDER: REORDER = "REORDER".asInstanceOf[REORDER]
  
  @js.native
  sealed trait SNAP
    extends StObject
       with MovementMode
  @scala.inline
  def SNAP: SNAP = "SNAP".asInstanceOf[SNAP]
  
  @js.native
  sealed trait `border-box` extends StObject
  @scala.inline
  def `border-box`: `border-box` = "border-box".asInstanceOf[`border-box`]
  
  @js.native
  sealed trait bottom extends StObject
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait close
    extends StObject
       with InOutAnimationMode
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait fixed extends StObject
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait height extends StObject
  @scala.inline
  def height: height = "height".asInstanceOf[height]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with Direction
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait left extends StObject
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait none
    extends StObject
       with InOutAnimationMode
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait open
    extends StObject
       with InOutAnimationMode
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait right extends StObject
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait standard
    extends StObject
       with DroppableMode
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait top extends StObject
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait vertical
    extends StObject
       with Direction
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait virtual
    extends StObject
       with DroppableMode
  @scala.inline
  def virtual: virtual = "virtual".asInstanceOf[virtual]
  
  @js.native
  sealed trait width extends StObject
  @scala.inline
  def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait x extends StObject
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}
