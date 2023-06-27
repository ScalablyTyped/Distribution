package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSVariableReferenceValue) */
trait CSSVariableReferenceValue extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSVariableReferenceValue/fallback) */
  /* standard dom */
  val fallback: CSSUnparsedValue | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSVariableReferenceValue/variable) */
  /* standard dom */
  var variable: java.lang.String
}
object CSSVariableReferenceValue {
  
  inline def apply(variable: java.lang.String): CSSVariableReferenceValue = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any], fallback = null)
    __obj.asInstanceOf[CSSVariableReferenceValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSVariableReferenceValue] (val x: Self) extends AnyVal {
    
    inline def setFallback(value: CSSUnparsedValue): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
    
    inline def setVariable(value: java.lang.String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
