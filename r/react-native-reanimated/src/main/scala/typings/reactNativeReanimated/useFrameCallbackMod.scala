package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFrameCallbackMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useFrameCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFrameCallback(callback: js.Function0[Unit]): FrameCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[FrameCallback]
  inline def useFrameCallback(callback: js.Function0[Unit], autostart: Boolean): FrameCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any], autostart.asInstanceOf[js.Any])).asInstanceOf[FrameCallback]
  
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
    
    extension [Self <: FrameCallback](x: Self) {
      
      inline def setCallbackId(value: Double): Self = StObject.set(x, "callbackId", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
}
