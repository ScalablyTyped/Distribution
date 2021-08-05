package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type boolean which can be animated. */
trait SVGAnimatedBoolean extends StObject {
  
  val animVal: scala.Boolean
  
  var baseVal: scala.Boolean
}
object SVGAnimatedBoolean {
  
  inline def apply(animVal: scala.Boolean, baseVal: scala.Boolean): SVGAnimatedBoolean = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedBoolean]
  }
  
  extension [Self <: SVGAnimatedBoolean](x: Self) {
    
    inline def setAnimVal(value: scala.Boolean): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: scala.Boolean): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
