package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFocus extends StObject {
  
  var onBlur: js.UndefOr[Any] = js.undefined
  
  var onChange: js.UndefOr[Any] = js.undefined
  
  var onFocus: js.UndefOr[Any] = js.undefined
  
  var onKeyDown: js.UndefOr[Any] = js.undefined
  
  var onKeyPress: js.UndefOr[Any] = js.undefined
}
object OnFocus {
  
  inline def apply(): OnFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFocus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnFocus] (val x: Self) extends AnyVal {
    
    inline def setOnBlur(value: Any): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: Any): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: Any): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: Any): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
  }
}
