package typings.reactNativeModals

import typings.reactNativeModals.mod.AlignTypes
import typings.reactNativeModals.mod.OverlayPointerEventTypes
import typings.reactNativeModals.mod.SlideFromTypes
import typings.reactNativeModals.mod.SwipeDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeModalsStrings {
  
  @js.native
  sealed trait auto
    extends StObject
       with OverlayPointerEventTypes
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bottom
    extends StObject
       with SlideFromTypes
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait center
    extends StObject
       with AlignTypes
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait down
    extends StObject
       with SwipeDirection
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait `flex-end`
    extends StObject
       with AlignTypes
  @scala.inline
  def `flex-end`: `flex-end` = "flex-end".asInstanceOf[`flex-end`]
  
  @js.native
  sealed trait `flex-start`
    extends StObject
       with AlignTypes
  @scala.inline
  def `flex-start`: `flex-start` = "flex-start".asInstanceOf[`flex-start`]
  
  @js.native
  sealed trait left
    extends StObject
       with SlideFromTypes
       with SwipeDirection
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait none
    extends StObject
       with OverlayPointerEventTypes
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait right
    extends StObject
       with SlideFromTypes
       with SwipeDirection
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait top
    extends StObject
       with SlideFromTypes
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait up
    extends StObject
       with SwipeDirection
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}
