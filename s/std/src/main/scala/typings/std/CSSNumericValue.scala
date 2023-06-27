package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue) */
trait CSSNumericValue
  extends StObject
     with CSSStyleValue {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/add) */
  /* standard dom */
  def add(values: CSSNumberish*): CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/div) */
  /* standard dom */
  def div(values: CSSNumberish*): CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/equals) */
  /* standard dom */
  def equals(value: CSSNumberish*): scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/max) */
  /* standard dom */
  def max(values: CSSNumberish*): CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/min) */
  /* standard dom */
  def min(values: CSSNumberish*): CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/mul) */
  /* standard dom */
  def mul(values: CSSNumberish*): CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/sub) */
  /* standard dom */
  def sub(values: CSSNumberish*): CSSNumericValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/to) */
  /* standard dom */
  def to(unit: java.lang.String): CSSUnitValue
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/toSum) */
  /* standard dom */
  def toSum(units: java.lang.String*): CSSMathSum
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/type) */
  /* standard dom */
  def `type`(): CSSNumericType
}
object CSSNumericValue {
  
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
    `type`: () => CSSNumericType
  ): CSSNumericValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSNumericValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSNumericValue] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setDiv(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: /* repeated */ CSSNumberish => scala.Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setMax(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMin(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMul(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "mul", js.Any.fromFunction1(value))
    
    inline def setSub(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setTo(value: java.lang.String => CSSUnitValue): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    
    inline def setToSum(value: /* repeated */ java.lang.String => CSSMathSum): Self = StObject.set(x, "toSum", js.Any.fromFunction1(value))
    
    inline def setType(value: () => CSSNumericType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
