package typings.reactNativeReanimated

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2FrameCallbackFrameCallbackRegistryUIMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/frameCallback/FrameCallbackRegistryUI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareUIRegistry(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareUIRegistry")().asInstanceOf[Unit]
  
  trait CallbackDetails extends StObject {
    
    def callback(frameInfo: FrameInfo): Unit
    
    var startTime: Double | Null
  }
  object CallbackDetails {
    
    inline def apply(callback: FrameInfo => Unit): CallbackDetails = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), startTime = null)
      __obj.asInstanceOf[CallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: FrameInfo => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    }
  }
  
  trait FrameCallbackRegistryUI extends StObject {
    
    var activeFrameCallbacks: Set[Double]
    
    var frameCallbackRegistry: Map[Double, CallbackDetails]
    
    def manageStateFrameCallback(callbackId: Double, state: Boolean): Unit
    
    var previousFrameTimestamp: Double | Null
    
    def registerFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit], callbackId: Double): Unit
    
    def runCallbacks(): Unit
    
    def unregisterFrameCallback(callbackId: Double): Unit
  }
  object FrameCallbackRegistryUI {
    
    inline def apply(
      activeFrameCallbacks: Set[Double],
      frameCallbackRegistry: Map[Double, CallbackDetails],
      manageStateFrameCallback: (Double, Boolean) => Unit,
      registerFrameCallback: (js.Function1[/* frameInfo */ FrameInfo, Unit], Double) => Unit,
      runCallbacks: () => Unit,
      unregisterFrameCallback: Double => Unit
    ): FrameCallbackRegistryUI = {
      val __obj = js.Dynamic.literal(activeFrameCallbacks = activeFrameCallbacks.asInstanceOf[js.Any], frameCallbackRegistry = frameCallbackRegistry.asInstanceOf[js.Any], manageStateFrameCallback = js.Any.fromFunction2(manageStateFrameCallback), registerFrameCallback = js.Any.fromFunction2(registerFrameCallback), runCallbacks = js.Any.fromFunction0(runCallbacks), unregisterFrameCallback = js.Any.fromFunction1(unregisterFrameCallback), previousFrameTimestamp = null)
      __obj.asInstanceOf[FrameCallbackRegistryUI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FrameCallbackRegistryUI] (val x: Self) extends AnyVal {
      
      inline def setActiveFrameCallbacks(value: Set[Double]): Self = StObject.set(x, "activeFrameCallbacks", value.asInstanceOf[js.Any])
      
      inline def setFrameCallbackRegistry(value: Map[Double, CallbackDetails]): Self = StObject.set(x, "frameCallbackRegistry", value.asInstanceOf[js.Any])
      
      inline def setManageStateFrameCallback(value: (Double, Boolean) => Unit): Self = StObject.set(x, "manageStateFrameCallback", js.Any.fromFunction2(value))
      
      inline def setPreviousFrameTimestamp(value: Double): Self = StObject.set(x, "previousFrameTimestamp", value.asInstanceOf[js.Any])
      
      inline def setPreviousFrameTimestampNull: Self = StObject.set(x, "previousFrameTimestamp", null)
      
      inline def setRegisterFrameCallback(value: (js.Function1[/* frameInfo */ FrameInfo, Unit], Double) => Unit): Self = StObject.set(x, "registerFrameCallback", js.Any.fromFunction2(value))
      
      inline def setRunCallbacks(value: () => Unit): Self = StObject.set(x, "runCallbacks", js.Any.fromFunction0(value))
      
      inline def setUnregisterFrameCallback(value: Double => Unit): Self = StObject.set(x, "unregisterFrameCallback", js.Any.fromFunction1(value))
    }
  }
  
  trait FrameInfo extends StObject {
    
    var timeSinceFirstFrame: Double
    
    var timeSincePreviousFrame: Double | Null
    
    var timestamp: Double
  }
  object FrameInfo {
    
    inline def apply(timeSinceFirstFrame: Double, timestamp: Double): FrameInfo = {
      val __obj = js.Dynamic.literal(timeSinceFirstFrame = timeSinceFirstFrame.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timeSincePreviousFrame = null)
      __obj.asInstanceOf[FrameInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FrameInfo] (val x: Self) extends AnyVal {
      
      inline def setTimeSinceFirstFrame(value: Double): Self = StObject.set(x, "timeSinceFirstFrame", value.asInstanceOf[js.Any])
      
      inline def setTimeSincePreviousFrame(value: Double): Self = StObject.set(x, "timeSincePreviousFrame", value.asInstanceOf[js.Any])
      
      inline def setTimeSincePreviousFrameNull: Self = StObject.set(x, "timeSincePreviousFrame", null)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
