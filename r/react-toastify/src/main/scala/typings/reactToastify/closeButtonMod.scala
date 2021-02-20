package typings.reactToastify

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.reactToastify.typesMod.TypeOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeButtonMod {
  
  @JSImport("react-toastify/dist/components/CloseButton", "CloseButton")
  @js.native
  def CloseButton(hasCloseToastTypeAriaLabel: CloseButtonProps): Element = js.native
  
  @js.native
  trait CloseButtonProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.native
    
    def closeToast(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    
    var `type`: TypeOptions = js.native
  }
  object CloseButtonProps {
    
    @scala.inline
    def apply(closeToast: MouseEvent[HTMLElement, NativeMouseEvent] => Unit, `type`: TypeOptions): CloseButtonProps = {
      val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction1(closeToast))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseButtonProps]
    }
    
    @scala.inline
    implicit class CloseButtonPropsMutableBuilder[Self <: CloseButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setCloseToast(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
