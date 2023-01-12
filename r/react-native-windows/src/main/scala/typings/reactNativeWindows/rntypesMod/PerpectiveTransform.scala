package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerpectiveTransform extends StObject {
  
  var perspective: Double
}
object PerpectiveTransform {
  
  inline def apply(perspective: Double): PerpectiveTransform = {
    val __obj = js.Dynamic.literal(perspective = perspective.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpectiveTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerpectiveTransform] (val x: Self) extends AnyVal {
    
    inline def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
  }
}
