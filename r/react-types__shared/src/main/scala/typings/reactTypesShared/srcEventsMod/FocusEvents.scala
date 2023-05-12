package typings.reactTypesShared.srcEventsMod

import typings.react.mod.FocusEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusEvents[Target] extends StObject {
  
  /** Handler that is called when the element loses focus. */
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[Target, Element], Unit]] = js.undefined
  
  /** Handler that is called when the element receives focus. */
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[Target, Element], Unit]] = js.undefined
  
  /** Handler that is called when the element's focus status changes. */
  var onFocusChange: js.UndefOr[js.Function1[/* isFocused */ Boolean, Unit]] = js.undefined
}
object FocusEvents {
  
  inline def apply[Target](): FocusEvents[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusEvents[Target]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusEvents[?], Target] (val x: Self & FocusEvents[Target]) extends AnyVal {
    
    inline def setOnBlur(value: /* e */ FocusEvent[Target, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(value: /* e */ FocusEvent[Target, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusChange(value: /* isFocused */ Boolean => Unit): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction1(value))
    
    inline def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
  }
}
