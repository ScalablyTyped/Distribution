package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGAnimatedString interface represents string attributes which can be animated from each SVG declaration. You need to create SVG attribute before doing anything else, everything should be declared inside this. */
trait SVGAnimatedString extends StObject {
  
  /* standard dom */
  val animVal: java.lang.String
  
  /* standard dom */
  var baseVal: java.lang.String
}
object SVGAnimatedString {
  
  inline def apply(animVal: java.lang.String, baseVal: java.lang.String): SVGAnimatedString = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedString] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: java.lang.String): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: java.lang.String): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
