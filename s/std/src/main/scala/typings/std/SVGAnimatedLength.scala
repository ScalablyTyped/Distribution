package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <length> which can be animated. */
trait SVGAnimatedLength extends StObject {
  
  /* standard dom */
  val animVal: SVGLength
  
  /* standard dom */
  val baseVal: SVGLength
}
object SVGAnimatedLength {
  
  inline def apply(animVal: SVGLength, baseVal: SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
  
  extension [Self <: SVGAnimatedLength](x: Self) {
    
    inline def setAnimVal(value: SVGLength): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGLength): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
