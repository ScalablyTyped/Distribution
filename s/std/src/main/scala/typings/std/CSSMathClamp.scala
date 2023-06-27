package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSMathClamp
  extends StObject
     with CSSMathValue {
  
  /* standard dom */
  val lower: CSSNumericValue
  
  /* standard dom */
  val upper: CSSNumericValue
  
  /* standard dom */
  val value: CSSNumericValue
}
object CSSMathClamp {
  
  inline def apply(
    add: /* repeated */ CSSNumberish => CSSNumericValue,
    div: /* repeated */ CSSNumberish => CSSNumericValue,
    equals_ : /* repeated */ CSSNumberish => scala.Boolean,
    lower: CSSNumericValue,
    max: /* repeated */ CSSNumberish => CSSNumericValue,
    min: /* repeated */ CSSNumberish => CSSNumericValue,
    mul: /* repeated */ CSSNumberish => CSSNumericValue,
    operator: CSSMathOperator,
    sub: /* repeated */ CSSNumberish => CSSNumericValue,
    to: java.lang.String => CSSUnitValue,
    toSum: /* repeated */ java.lang.String => CSSMathSum,
    `type`: () => CSSNumericType,
    upper: CSSNumericValue,
    value: CSSNumericValue
  ): CSSMathClamp = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), lower = lower.asInstanceOf[js.Any], max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), operator = operator.asInstanceOf[js.Any], sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum), upper = upper.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSMathClamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSMathClamp] (val x: Self) extends AnyVal {
    
    inline def setLower(value: CSSNumericValue): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setUpper(value: CSSNumericValue): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CSSNumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
