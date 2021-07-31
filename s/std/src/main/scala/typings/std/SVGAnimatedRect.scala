package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic SVGRect which can be animated. */
trait SVGAnimatedRect extends StObject {
  
  val animVal: DOMRectReadOnly
  
  val baseVal: DOMRect
}
object SVGAnimatedRect {
  
  @scala.inline
  def apply(animVal: DOMRectReadOnly, baseVal: DOMRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
  
  @scala.inline
  implicit class SVGAnimatedRectMutableBuilder[Self <: SVGAnimatedRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: DOMRectReadOnly): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: DOMRect): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
