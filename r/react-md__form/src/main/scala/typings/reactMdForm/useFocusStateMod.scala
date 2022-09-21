package typings.reactMdForm

import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLLabelElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusStateMod {
  
  @JSImport("@react-md/form/types/useFocusState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFocusState(hasOnFocusOnBlur: Options): js.Tuple3[Boolean, FocusEventHandler, BlurEventHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusState")(hasOnFocusOnBlur.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, FocusEventHandler, BlurEventHandler]]
  
  type BlurEventHandler = typings.react.mod.FocusEventHandler[FocusElement]
  
  type FocusElement = HTMLInputElement | HTMLTextAreaElement | HTMLLabelElement | HTMLSelectElement | HTMLDivElement
  
  type FocusEventHandler = typings.react.mod.FocusEventHandler[FocusElement]
  
  /* Inlined std.Pick<react.react.HTMLAttributes<@react-md/form.@react-md/form/types/useFocusState.FocusElement>, 'onBlur' | 'onFocus'> */
  trait Options extends StObject {
    
    var onBlur: js.UndefOr[typings.react.mod.FocusEventHandler[FocusElement]] = js.undefined
    
    var onFocus: js.UndefOr[typings.react.mod.FocusEventHandler[FocusElement]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnBlur(value: FocusEvent[FocusElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[FocusElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
