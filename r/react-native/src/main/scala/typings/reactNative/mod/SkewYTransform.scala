package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkewYTransform extends StObject {
  
  var skewY: String
}
object SkewYTransform {
  
  inline def apply(skewY: String): SkewYTransform = {
    val __obj = js.Dynamic.literal(skewY = skewY.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkewYTransform]
  }
  
  extension [Self <: SkewYTransform](x: Self) {
    
    inline def setSkewY(value: String): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
  }
}
