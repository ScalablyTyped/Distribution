package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2FrameCallbackFrameCallbackRegistryUIMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/frameCallback/FrameCallbackRegistryUI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareUIRegistry(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareUIRegistry")().asInstanceOf[Unit]
  
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
    
    extension [Self <: FrameInfo](x: Self) {
      
      inline def setTimeSinceFirstFrame(value: Double): Self = StObject.set(x, "timeSinceFirstFrame", value.asInstanceOf[js.Any])
      
      inline def setTimeSincePreviousFrame(value: Double): Self = StObject.set(x, "timeSincePreviousFrame", value.asInstanceOf[js.Any])
      
      inline def setTimeSincePreviousFrameNull: Self = StObject.set(x, "timeSincePreviousFrame", null)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
