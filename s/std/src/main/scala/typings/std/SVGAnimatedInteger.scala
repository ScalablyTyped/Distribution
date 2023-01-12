package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <integer> which can be animated. */
trait SVGAnimatedInteger extends StObject {
  
  /* standard dom */
  val animVal: Double
  
  /* standard dom */
  var baseVal: Double
}
object SVGAnimatedInteger {
  
  inline def apply(animVal: Double, baseVal: Double): SVGAnimatedInteger = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedInteger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedInteger] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
