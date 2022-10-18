package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.Gesture
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.GestureType
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesGestureCompositionMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gestureComposition", "ComposedGesture")
  @js.native
  open class ComposedGesture protected () extends Gesture {
    def this(gestures: Gesture*) = this()
    
    /* protected */ var gestures: js.Array[Gesture] = js.native
    
    /* protected */ def prepareSingleGesture(
      gesture: Gesture,
      simultaneousGestures: js.Array[GestureType],
      requireGesturesToFail: js.Array[GestureType]
    ): Unit = js.native
    
    /* protected */ var requireGesturesToFail: js.Array[GestureType] = js.native
    
    /* protected */ var simultaneousGestures: js.Array[GestureType] = js.native
  }
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gestureComposition", "ExclusiveGesture")
  @js.native
  open class ExclusiveGesture protected () extends ComposedGesture {
    def this(gestures: Gesture*) = this()
  }
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gestureComposition", "SimultaneousGesture")
  @js.native
  open class SimultaneousGesture protected () extends ComposedGesture {
    def this(gestures: Gesture*) = this()
  }
  
  type ComposedGestureType = InstanceType[Instantiable1[/* gestures (repeated) */ Gesture, ComposedGesture]]
  
  type ExclusiveGestureType = InstanceType[Instantiable0[ExclusiveGesture]]
  
  type RaceGestureType = ComposedGestureType
  
  type SimultaneousGestureType = InstanceType[Instantiable0[SimultaneousGesture]]
}
