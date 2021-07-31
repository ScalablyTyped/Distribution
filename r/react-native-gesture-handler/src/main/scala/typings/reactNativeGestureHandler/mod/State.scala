package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends StObject
@JSImport("react-native-gesture-handler", "State")
@js.native
object State extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State & Double] = js.native
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with State
  /* 3 */ val ACTIVE: typings.reactNativeGestureHandler.mod.State.ACTIVE & Double = js.native
  
  @js.native
  sealed trait BEGAN
    extends StObject
       with State
  /* 1 */ val BEGAN: typings.reactNativeGestureHandler.mod.State.BEGAN & Double = js.native
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with State
  /* 2 */ val CANCELLED: typings.reactNativeGestureHandler.mod.State.CANCELLED & Double = js.native
  
  @js.native
  sealed trait END
    extends StObject
       with State
  /* 4 */ val END: typings.reactNativeGestureHandler.mod.State.END & Double = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with State
  /* 0 */ val FAILED: typings.reactNativeGestureHandler.mod.State.FAILED & Double = js.native
  
  @js.native
  sealed trait UNDETERMINED
    extends StObject
       with State
  /* 0 */ val UNDETERMINED: typings.reactNativeGestureHandler.mod.State.UNDETERMINED & Double = js.native
}
