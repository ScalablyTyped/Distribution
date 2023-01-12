package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes whose value must be a constant from a particular enumeration and which can be animated. */
trait SVGAnimatedEnumeration extends StObject {
  
  /* standard dom */
  val animVal: Double
  
  /* standard dom */
  var baseVal: Double
}
object SVGAnimatedEnumeration {
  
  inline def apply(animVal: Double, baseVal: Double): SVGAnimatedEnumeration = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedEnumeration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedEnumeration] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
