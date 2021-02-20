package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes whose value must be a constant from a particular enumeration and which can be animated. */
@js.native
trait SVGAnimatedEnumeration extends StObject {
  
  val animVal: Double = js.native
  
  var baseVal: Double = js.native
}
object SVGAnimatedEnumeration {
  
  @scala.inline
  def apply(animVal: Double, baseVal: Double): SVGAnimatedEnumeration = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedEnumeration]
  }
  
  @scala.inline
  implicit class SVGAnimatedEnumerationMutableBuilder[Self <: SVGAnimatedEnumeration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
