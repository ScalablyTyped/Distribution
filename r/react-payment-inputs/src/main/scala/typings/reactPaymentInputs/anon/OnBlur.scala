package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  var onBlur: js.UndefOr[Any] = js.undefined
  
  var onChange: js.UndefOr[Any] = js.undefined
  
  var onFocus: js.UndefOr[Any] = js.undefined
  
  var onKeyPress: js.UndefOr[Any] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object OnBlur {
  
  inline def apply(): OnBlur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBlur]
  }
  
  extension [Self <: OnBlur](x: Self) {
    
    inline def setOnBlur(value: Any): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: Any): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyPress(value: Any): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
