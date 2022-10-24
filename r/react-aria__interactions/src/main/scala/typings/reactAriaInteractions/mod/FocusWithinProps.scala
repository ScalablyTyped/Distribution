package typings.reactAriaInteractions.mod

import typings.react.mod.FocusEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusWithinProps extends StObject {
  
  /** Whether the focus within events should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Handler that is called when the target element and all descendants lose focus. */
  var onBlurWithin: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Unit]] = js.undefined
  
  /** Handler that is called when the target element or a descendant receives focus. */
  var onFocusWithin: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Unit]] = js.undefined
  
  /** Handler that is called when the the focus within state changes. */
  var onFocusWithinChange: js.UndefOr[js.Function1[/* isFocusWithin */ Boolean, Unit]] = js.undefined
}
object FocusWithinProps {
  
  inline def apply(): FocusWithinProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusWithinProps]
  }
  
  extension [Self <: FocusWithinProps](x: Self) {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setOnBlurWithin(value: /* e */ FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onBlurWithin", js.Any.fromFunction1(value))
    
    inline def setOnBlurWithinUndefined: Self = StObject.set(x, "onBlurWithin", js.undefined)
    
    inline def setOnFocusWithin(value: /* e */ FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocusWithin", js.Any.fromFunction1(value))
    
    inline def setOnFocusWithinChange(value: /* isFocusWithin */ Boolean => Unit): Self = StObject.set(x, "onFocusWithinChange", js.Any.fromFunction1(value))
    
    inline def setOnFocusWithinChangeUndefined: Self = StObject.set(x, "onFocusWithinChange", js.undefined)
    
    inline def setOnFocusWithinUndefined: Self = StObject.set(x, "onFocusWithin", js.undefined)
  }
}
