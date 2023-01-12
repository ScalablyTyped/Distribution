package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxDistSq extends StObject {
  
  var maxDistSq: Double
  
  var shouldCancelWhenOutside: Boolean
}
object MaxDistSq {
  
  inline def apply(maxDistSq: Double, shouldCancelWhenOutside: Boolean): MaxDistSq = {
    val __obj = js.Dynamic.literal(maxDistSq = maxDistSq.asInstanceOf[js.Any], shouldCancelWhenOutside = shouldCancelWhenOutside.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxDistSq]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxDistSq] (val x: Self) extends AnyVal {
    
    inline def setMaxDistSq(value: Double): Self = StObject.set(x, "maxDistSq", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
  }
}
