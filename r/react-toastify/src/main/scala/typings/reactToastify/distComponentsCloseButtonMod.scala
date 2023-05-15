package typings.reactToastify

import typings.react.mod.JSX.Element
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactToastify.distTypesMod.Theme
import typings.reactToastify.distTypesMod.TypeOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsCloseButtonMod {
  
  @JSImport("react-toastify/dist/components/CloseButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CloseButton(param0: CloseButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CloseButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CloseButtonProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    def closeToast(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
    
    var theme: Theme
    
    var `type`: TypeOptions
  }
  object CloseButtonProps {
    
    inline def apply(closeToast: MouseEvent[HTMLElement, NativeMouseEvent] => Unit, theme: Theme, `type`: TypeOptions): CloseButtonProps = {
      val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction1(closeToast), theme = theme.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseButtonProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setCloseToast(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction1(value))
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
