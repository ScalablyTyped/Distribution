package typings.reactNativeModals

import typings.reactNativeModals.mod.AlignTypes
import typings.reactNativeModals.mod.OverlayPointerEventTypes
import typings.reactNativeModals.mod.SlideFromTypes
import typings.reactNativeModals.mod.SwipeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeModalsStrings {
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @scala.inline
  def `flex-end`: `flex-end` = "flex-end".asInstanceOf[`flex-end`]
  
  @scala.inline
  def `flex-start`: `flex-start` = "flex-start".asInstanceOf[`flex-start`]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait auto extends OverlayPointerEventTypes
  
  @js.native
  sealed trait bottom extends SlideFromTypes
  
  @js.native
  sealed trait center extends AlignTypes
  
  @js.native
  sealed trait down extends SwipeDirection
  
  @js.native
  sealed trait `flex-end` extends AlignTypes
  
  @js.native
  sealed trait `flex-start` extends AlignTypes
  
  @js.native
  sealed trait left
    extends SlideFromTypes
       with SwipeDirection
  
  @js.native
  sealed trait none extends OverlayPointerEventTypes
  
  @js.native
  sealed trait right
    extends SlideFromTypes
       with SwipeDirection
  
  @js.native
  sealed trait top extends SlideFromTypes
  
  @js.native
  sealed trait up extends SwipeDirection
}
