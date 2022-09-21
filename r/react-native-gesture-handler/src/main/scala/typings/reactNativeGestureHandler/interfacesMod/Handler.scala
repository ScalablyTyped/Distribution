package typings.reactNativeGestureHandler.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  var handlerTag: Double
}
object Handler {
  
  inline def apply(handlerTag: Double): Handler = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
  }
}
