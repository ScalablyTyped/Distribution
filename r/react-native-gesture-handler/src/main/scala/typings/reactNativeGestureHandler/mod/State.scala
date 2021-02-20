package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends StObject
@JSImport("react-native-gesture-handler", "State")
@js.native
object State extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  
  @js.native
  sealed trait ACTIVE extends State
  /* 3 */ val ACTIVE: typings.reactNativeGestureHandler.mod.State.ACTIVE with Double = js.native
  
  @js.native
  sealed trait BEGAN extends State
  /* 1 */ val BEGAN: typings.reactNativeGestureHandler.mod.State.BEGAN with Double = js.native
  
  @js.native
  sealed trait CANCELLED extends State
  /* 2 */ val CANCELLED: typings.reactNativeGestureHandler.mod.State.CANCELLED with Double = js.native
  
  @js.native
  sealed trait END extends State
  /* 4 */ val END: typings.reactNativeGestureHandler.mod.State.END with Double = js.native
  
  @js.native
  sealed trait FAILED extends State
  /* 0 */ val FAILED: typings.reactNativeGestureHandler.mod.State.FAILED with Double = js.native
  
  @js.native
  sealed trait UNDETERMINED extends State
  /* 0 */ val UNDETERMINED: typings.reactNativeGestureHandler.mod.State.UNDETERMINED with Double = js.native
}
