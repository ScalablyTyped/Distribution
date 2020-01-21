package typings.reactNativePopupDialog

import typings.reactNativePopupDialog.mod.AlignTypes
import typings.reactNativePopupDialog.mod.OverlayPointerEventTypes
import typings.reactNativePopupDialog.mod.SlideFromTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativePopupDialogStrings {
  @js.native
  sealed trait auto extends OverlayPointerEventTypes
  
  @js.native
  sealed trait bottom extends SlideFromTypes
  
  @js.native
  sealed trait center extends AlignTypes
  
  @js.native
  sealed trait left
    extends AlignTypes
       with SlideFromTypes
  
  @js.native
  sealed trait none extends OverlayPointerEventTypes
  
  @js.native
  sealed trait right
    extends AlignTypes
       with SlideFromTypes
  
  @js.native
  sealed trait top extends SlideFromTypes
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

