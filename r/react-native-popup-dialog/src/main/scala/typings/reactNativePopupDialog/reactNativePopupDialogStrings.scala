package typings.reactNativePopupDialog

import typings.reactNativePopupDialog.mod.AlignTypes
import typings.reactNativePopupDialog.mod.OverlayPointerEventTypes
import typings.reactNativePopupDialog.mod.SlideFromTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativePopupDialogStrings {
  
  @js.native
  sealed trait auto extends OverlayPointerEventTypes
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bottom extends SlideFromTypes
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait center extends AlignTypes
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait left
    extends AlignTypes
       with SlideFromTypes
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait none extends OverlayPointerEventTypes
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait right
    extends AlignTypes
       with SlideFromTypes
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait top extends SlideFromTypes
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}
