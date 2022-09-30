package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameCallbackRegistryJSMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/frameCallback/FrameCallbackRegistryJS", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FrameCallbackRegistryJS {
    
    /* CompleteClass */
    override def manageStateFrameCallback(frameCallbackId: Double, state: Boolean): Unit = js.native
    
    /* private */ /* CompleteClass */
    var nextCallbackId: Any = js.native
    
    /* CompleteClass */
    override def registerFrameCallback(callback: js.Function0[Unit]): Double = js.native
    
    /* CompleteClass */
    override def unregisterFrameCallback(frameCallbackId: Double): Unit = js.native
  }
  
  trait FrameCallbackRegistryJS extends StObject {
    
    def manageStateFrameCallback(frameCallbackId: Double, state: Boolean): Unit
    
    /* private */ var nextCallbackId: Any
    
    def registerFrameCallback(callback: js.Function0[Unit]): Double
    
    def unregisterFrameCallback(frameCallbackId: Double): Unit
  }
  object FrameCallbackRegistryJS {
    
    inline def apply(
      manageStateFrameCallback: (Double, Boolean) => Unit,
      nextCallbackId: Any,
      registerFrameCallback: js.Function0[Unit] => Double,
      unregisterFrameCallback: Double => Unit
    ): FrameCallbackRegistryJS = {
      val __obj = js.Dynamic.literal(manageStateFrameCallback = js.Any.fromFunction2(manageStateFrameCallback), nextCallbackId = nextCallbackId.asInstanceOf[js.Any], registerFrameCallback = js.Any.fromFunction1(registerFrameCallback), unregisterFrameCallback = js.Any.fromFunction1(unregisterFrameCallback))
      __obj.asInstanceOf[FrameCallbackRegistryJS]
    }
    
    extension [Self <: FrameCallbackRegistryJS](x: Self) {
      
      inline def setManageStateFrameCallback(value: (Double, Boolean) => Unit): Self = StObject.set(x, "manageStateFrameCallback", js.Any.fromFunction2(value))
      
      inline def setNextCallbackId(value: Any): Self = StObject.set(x, "nextCallbackId", value.asInstanceOf[js.Any])
      
      inline def setRegisterFrameCallback(value: js.Function0[Unit] => Double): Self = StObject.set(x, "registerFrameCallback", js.Any.fromFunction1(value))
      
      inline def setUnregisterFrameCallback(value: Double => Unit): Self = StObject.set(x, "unregisterFrameCallback", js.Any.fromFunction1(value))
    }
  }
}
