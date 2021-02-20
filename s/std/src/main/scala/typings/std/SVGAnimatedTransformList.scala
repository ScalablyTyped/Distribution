package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes which take a list of numbers and which can be animated. */
@js.native
trait SVGAnimatedTransformList extends StObject {
  
  val animVal: SVGTransformList = js.native
  
  val baseVal: SVGTransformList = js.native
}
object SVGAnimatedTransformList {
  
  @scala.inline
  def apply(animVal: SVGTransformList, baseVal: SVGTransformList): SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedTransformList]
  }
  
  @scala.inline
  implicit class SVGAnimatedTransformListMutableBuilder[Self <: SVGAnimatedTransformList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: SVGTransformList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: SVGTransformList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
