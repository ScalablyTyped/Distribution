package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for attributes of basic SVGRect which can be animated.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedRect)
  */
trait SVGAnimatedRect extends StObject {
  
  /* standard dom */
  val animVal: DOMRectReadOnly
  
  /* standard dom */
  val baseVal: DOMRect
}
object SVGAnimatedRect {
  
  inline def apply(animVal: DOMRectReadOnly, baseVal: DOMRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedRect] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: DOMRectReadOnly): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: DOMRect): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
