package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCallback extends StObject {
  
  var callbackId: Double
  
  var isActive: Boolean
  
  def setActive(isActive: Boolean): Unit
}
object FrameCallback {
  
  inline def apply(callbackId: Double, isActive: Boolean, setActive: Boolean => Unit): FrameCallback = {
    val __obj = js.Dynamic.literal(callbackId = callbackId.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.asInstanceOf[FrameCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameCallback] (val x: Self) extends AnyVal {
    
    inline def setCallbackId(value: Double): Self = StObject.set(x, "callbackId", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
  }
}
