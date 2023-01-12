package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndResult extends StObject {
  
  var finished: Boolean
}
object EndResult {
  
  inline def apply(finished: Boolean): EndResult = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndResult] (val x: Self) extends AnyVal {
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
  }
}
