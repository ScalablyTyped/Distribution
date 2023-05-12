package typings.rcDropdown

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseAccessibilityMod {
  
  @JSImport("rc-dropdown/es/hooks/useAccessibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: UseAccessibilityProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait UseAccessibilityProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var overlayRef: js.UndefOr[RefObject[Any]] = js.undefined
    
    var triggerRef: RefObject[Any]
    
    var visible: Boolean
  }
  object UseAccessibilityProps {
    
    inline def apply(triggerRef: RefObject[Any], visible: Boolean): UseAccessibilityProps = {
      val __obj = js.Dynamic.literal(triggerRef = triggerRef.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseAccessibilityProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseAccessibilityProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOverlayRef(value: RefObject[Any]): Self = StObject.set(x, "overlayRef", value.asInstanceOf[js.Any])
      
      inline def setOverlayRefUndefined: Self = StObject.set(x, "overlayRef", js.undefined)
      
      inline def setTriggerRef(value: RefObject[Any]): Self = StObject.set(x, "triggerRef", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
