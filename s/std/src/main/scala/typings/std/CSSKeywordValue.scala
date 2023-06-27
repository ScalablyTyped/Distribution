package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeywordValue) */
trait CSSKeywordValue
  extends StObject
     with CSSStyleValue {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeywordValue/value) */
  /* standard dom */
  var value: java.lang.String
}
object CSSKeywordValue {
  
  inline def apply(value: java.lang.String): CSSKeywordValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeywordValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSKeywordValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
