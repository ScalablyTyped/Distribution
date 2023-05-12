package typings.storybookTheming.distCreateC2b2ce6dMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Easing extends StObject {
  
  var rubber: String
}
object Easing {
  
  inline def apply(rubber: String): Easing = {
    val __obj = js.Dynamic.literal(rubber = rubber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Easing] (val x: Self) extends AnyVal {
    
    inline def setRubber(value: String): Self = StObject.set(x, "rubber", value.asInstanceOf[js.Any])
  }
}
