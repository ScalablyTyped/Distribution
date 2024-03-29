package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for attributes of basic type <angle> which can be animated.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedAngle)
  */
trait SVGAnimatedAngle extends StObject {
  
  /* standard dom */
  val animVal: SVGAngle
  
  /* standard dom */
  val baseVal: SVGAngle
}
object SVGAnimatedAngle {
  
  inline def apply(animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedAngle] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: SVGAngle): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGAngle): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
