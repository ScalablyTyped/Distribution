package typings.reactNativeReanimated

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameCallbackRegistryUIMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/frameCallback/FrameCallbackRegistryUI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareUIRegistry(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareUIRegistry")().asInstanceOf[Unit]
  
  trait FrameCallbackRegistryUI extends StObject {
    
    var frameCallbackActive: Set[Double]
    
    var frameCallbackRegistry: Map[Double, js.Function0[Unit]]
    
    var isFrameCallbackRunning: Boolean
    
    def manageStateFrameCallback(frameCallbackId: Double, state: Boolean): Unit
    
    def registerFrameCallback(callback: js.Function0[Unit], callbackId: Double): Unit
    
    def runCallbacks(): Unit
    
    def unregisterFrameCallback(frameCallbackId: Double): Unit
  }
  object FrameCallbackRegistryUI {
    
    inline def apply(
      frameCallbackActive: Set[Double],
      frameCallbackRegistry: Map[Double, js.Function0[Unit]],
      isFrameCallbackRunning: Boolean,
      manageStateFrameCallback: (Double, Boolean) => Unit,
      registerFrameCallback: (js.Function0[Unit], Double) => Unit,
      runCallbacks: () => Unit,
      unregisterFrameCallback: Double => Unit
    ): FrameCallbackRegistryUI = {
      val __obj = js.Dynamic.literal(frameCallbackActive = frameCallbackActive.asInstanceOf[js.Any], frameCallbackRegistry = frameCallbackRegistry.asInstanceOf[js.Any], isFrameCallbackRunning = isFrameCallbackRunning.asInstanceOf[js.Any], manageStateFrameCallback = js.Any.fromFunction2(manageStateFrameCallback), registerFrameCallback = js.Any.fromFunction2(registerFrameCallback), runCallbacks = js.Any.fromFunction0(runCallbacks), unregisterFrameCallback = js.Any.fromFunction1(unregisterFrameCallback))
      __obj.asInstanceOf[FrameCallbackRegistryUI]
    }
    
    extension [Self <: FrameCallbackRegistryUI](x: Self) {
      
      inline def setFrameCallbackActive(value: Set[Double]): Self = StObject.set(x, "frameCallbackActive", value.asInstanceOf[js.Any])
      
      inline def setFrameCallbackRegistry(value: Map[Double, js.Function0[Unit]]): Self = StObject.set(x, "frameCallbackRegistry", value.asInstanceOf[js.Any])
      
      inline def setIsFrameCallbackRunning(value: Boolean): Self = StObject.set(x, "isFrameCallbackRunning", value.asInstanceOf[js.Any])
      
      inline def setManageStateFrameCallback(value: (Double, Boolean) => Unit): Self = StObject.set(x, "manageStateFrameCallback", js.Any.fromFunction2(value))
      
      inline def setRegisterFrameCallback(value: (js.Function0[Unit], Double) => Unit): Self = StObject.set(x, "registerFrameCallback", js.Any.fromFunction2(value))
      
      inline def setRunCallbacks(value: () => Unit): Self = StObject.set(x, "runCallbacks", js.Any.fromFunction0(value))
      
      inline def setUnregisterFrameCallback(value: Double => Unit): Self = StObject.set(x, "unregisterFrameCallback", js.Any.fromFunction1(value))
    }
  }
}
