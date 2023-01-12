package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rationale extends StObject {
  
  var buttonNegative: js.UndefOr[String] = js.undefined
  
  var buttonNeutral: js.UndefOr[String] = js.undefined
  
  var buttonPositive: String
  
  var message: String
  
  var title: String
}
object Rationale {
  
  inline def apply(buttonPositive: String, message: String, title: String): Rationale = {
    val __obj = js.Dynamic.literal(buttonPositive = buttonPositive.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rationale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rationale] (val x: Self) extends AnyVal {
    
    inline def setButtonNegative(value: String): Self = StObject.set(x, "buttonNegative", value.asInstanceOf[js.Any])
    
    inline def setButtonNegativeUndefined: Self = StObject.set(x, "buttonNegative", js.undefined)
    
    inline def setButtonNeutral(value: String): Self = StObject.set(x, "buttonNeutral", value.asInstanceOf[js.Any])
    
    inline def setButtonNeutralUndefined: Self = StObject.set(x, "buttonNeutral", js.undefined)
    
    inline def setButtonPositive(value: String): Self = StObject.set(x, "buttonPositive", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
