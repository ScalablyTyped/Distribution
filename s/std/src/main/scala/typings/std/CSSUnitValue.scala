package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnitValue) */
trait CSSUnitValue
  extends StObject
     with CSSNumericValue {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnitValue/unit) */
  /* standard dom */
  val unit: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnitValue/value) */
  /* standard dom */
  var value: Double
}
object CSSUnitValue {
  
  inline def apply(
    add: /* repeated */ CSSNumberish => CSSNumericValue,
    div: /* repeated */ CSSNumberish => CSSNumericValue,
    equals_ : /* repeated */ CSSNumberish => scala.Boolean,
    max: /* repeated */ CSSNumberish => CSSNumericValue,
    min: /* repeated */ CSSNumberish => CSSNumericValue,
    mul: /* repeated */ CSSNumberish => CSSNumericValue,
    sub: /* repeated */ CSSNumberish => CSSNumericValue,
    to: java.lang.String => CSSUnitValue,
    toSum: /* repeated */ java.lang.String => CSSMathSum,
    `type`: () => CSSNumericType,
    unit: java.lang.String,
    value: Double
  ): CSSUnitValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSUnitValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSUnitValue] (val x: Self) extends AnyVal {
    
    inline def setUnit(value: java.lang.String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
