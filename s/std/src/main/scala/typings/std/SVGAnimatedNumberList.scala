package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedNumberList)
  */
trait SVGAnimatedNumberList extends StObject {
  
  /* standard dom */
  val animVal: SVGNumberList
  
  /* standard dom */
  val baseVal: SVGNumberList
}
object SVGAnimatedNumberList {
  
  inline def apply(animVal: SVGNumberList, baseVal: SVGNumberList): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedNumberList] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: SVGNumberList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGNumberList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
