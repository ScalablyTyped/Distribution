package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkewXTransform extends StObject {
  
  var skewX: String
}
object SkewXTransform {
  
  inline def apply(skewX: String): SkewXTransform = {
    val __obj = js.Dynamic.literal(skewX = skewX.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkewXTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkewXTransform] (val x: Self) extends AnyVal {
    
    inline def setSkewX(value: String): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
  }
}
