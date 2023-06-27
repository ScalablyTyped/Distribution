package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathNegate) */
trait CSSMathNegate
  extends StObject
     with CSSMathValue {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathNegate/value) */
  /* standard dom */
  val value: CSSNumericValue
}
object CSSMathNegate {
  
  inline def apply(
    add: /* repeated */ CSSNumberish => CSSNumericValue,
    div: /* repeated */ CSSNumberish => CSSNumericValue,
    equals_ : /* repeated */ CSSNumberish => scala.Boolean,
    max: /* repeated */ CSSNumberish => CSSNumericValue,
    min: /* repeated */ CSSNumberish => CSSNumericValue,
    mul: /* repeated */ CSSNumberish => CSSNumericValue,
    operator: CSSMathOperator,
    sub: /* repeated */ CSSNumberish => CSSNumericValue,
    to: java.lang.String => CSSUnitValue,
    toSum: /* repeated */ java.lang.String => CSSMathSum,
    `type`: () => CSSNumericType,
    value: CSSNumericValue
  ): CSSMathNegate = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), operator = operator.asInstanceOf[js.Any], sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSMathNegate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSMathNegate] (val x: Self) extends AnyVal {
    
    inline def setValue(value: CSSNumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
