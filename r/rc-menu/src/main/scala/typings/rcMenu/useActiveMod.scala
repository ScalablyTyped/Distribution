package typings.rcMenu

import typings.rcMenu.interfaceMod.MenuHoverEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useActiveMod {
  
  @JSImport("rc-menu/es/hooks/useActive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(eventKey: String, disabled: Boolean): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  inline def default(eventKey: String, disabled: Boolean, onMouseEnter: Unit, onMouseLeave: MenuHoverEventHandler): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any], onMouseLeave.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  inline def default(eventKey: String, disabled: Boolean, onMouseEnter: MenuHoverEventHandler): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  inline def default(
    eventKey: String,
    disabled: Boolean,
    onMouseEnter: MenuHoverEventHandler,
    onMouseLeave: MenuHoverEventHandler
  ): ActiveObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventKey.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onMouseEnter.asInstanceOf[js.Any], onMouseLeave.asInstanceOf[js.Any])).asInstanceOf[ActiveObj]
  
  trait ActiveObj extends StObject {
    
    var active: Boolean
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  }
  object ActiveObj {
    
    inline def apply(active: Boolean): ActiveObj = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveObj]
    }
    
    extension [Self <: ActiveObj](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
}
