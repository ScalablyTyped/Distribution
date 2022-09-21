package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPressOnValueChange extends StObject {
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  var value: String
}
object OnPressOnValueChange {
  
  inline def apply(value: String): OnPressOnValueChange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPressOnValueChange]
  }
  
  extension [Self <: OnPressOnValueChange](x: Self) {
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnValueChange(value: /* value */ String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
