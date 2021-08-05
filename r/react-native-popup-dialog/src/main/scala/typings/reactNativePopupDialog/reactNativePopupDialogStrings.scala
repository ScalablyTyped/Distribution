package typings.reactNativePopupDialog

import typings.reactNativePopupDialog.mod.AlignTypes
import typings.reactNativePopupDialog.mod.OverlayPointerEventTypes
import typings.reactNativePopupDialog.mod.SlideFromTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativePopupDialogStrings {
  
  @js.native
  sealed trait auto
    extends StObject
       with OverlayPointerEventTypes
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bottom
    extends StObject
       with SlideFromTypes
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait center
    extends StObject
       with AlignTypes
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait left
    extends StObject
       with AlignTypes
       with SlideFromTypes
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait none
    extends StObject
       with OverlayPointerEventTypes
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait right
    extends StObject
       with AlignTypes
       with SlideFromTypes
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait top
    extends StObject
       with SlideFromTypes
  inline def top: top = "top".asInstanceOf[top]
}
