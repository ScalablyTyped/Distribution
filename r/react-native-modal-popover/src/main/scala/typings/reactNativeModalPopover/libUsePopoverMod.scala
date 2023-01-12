package typings.reactNativeModalPopover

import typings.react.mod.MutableRefObject
import typings.reactNativeModalPopover.libPopoverGeometryMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUsePopoverMod {
  
  @JSImport("react-native-modal-popover/lib/usePopover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePopover(): UsePopoverHook = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopover")().asInstanceOf[UsePopoverHook]
  inline def usePopover(calculateStatusBar: Boolean): UsePopoverHook = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopover")(calculateStatusBar.asInstanceOf[js.Any]).asInstanceOf[UsePopoverHook]
  
  trait UsePopoverHook extends StObject {
    
    def closePopover(): Unit
    
    def openPopover(): Unit
    
    var popoverAnchorRect: Rect
    
    var popoverVisible: Boolean
    
    var touchableRef: MutableRefObject[Any]
  }
  object UsePopoverHook {
    
    inline def apply(
      closePopover: () => Unit,
      openPopover: () => Unit,
      popoverAnchorRect: Rect,
      popoverVisible: Boolean,
      touchableRef: MutableRefObject[Any]
    ): UsePopoverHook = {
      val __obj = js.Dynamic.literal(closePopover = js.Any.fromFunction0(closePopover), openPopover = js.Any.fromFunction0(openPopover), popoverAnchorRect = popoverAnchorRect.asInstanceOf[js.Any], popoverVisible = popoverVisible.asInstanceOf[js.Any], touchableRef = touchableRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePopoverHook]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsePopoverHook] (val x: Self) extends AnyVal {
      
      inline def setClosePopover(value: () => Unit): Self = StObject.set(x, "closePopover", js.Any.fromFunction0(value))
      
      inline def setOpenPopover(value: () => Unit): Self = StObject.set(x, "openPopover", js.Any.fromFunction0(value))
      
      inline def setPopoverAnchorRect(value: Rect): Self = StObject.set(x, "popoverAnchorRect", value.asInstanceOf[js.Any])
      
      inline def setPopoverVisible(value: Boolean): Self = StObject.set(x, "popoverVisible", value.asInstanceOf[js.Any])
      
      inline def setTouchableRef(value: MutableRefObject[Any]): Self = StObject.set(x, "touchableRef", value.asInstanceOf[js.Any])
    }
  }
}
