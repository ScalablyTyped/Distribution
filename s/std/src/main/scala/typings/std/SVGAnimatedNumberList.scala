package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated. */
trait SVGAnimatedNumberList extends StObject {
  
  val animVal: SVGNumberList
  
  val baseVal: SVGNumberList
}
object SVGAnimatedNumberList {
  
  @scala.inline
  def apply(animVal: SVGNumberList, baseVal: SVGNumberList): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
  
  @scala.inline
  implicit class SVGAnimatedNumberListMutableBuilder[Self <: SVGAnimatedNumberList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: SVGNumberList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: SVGNumberList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
