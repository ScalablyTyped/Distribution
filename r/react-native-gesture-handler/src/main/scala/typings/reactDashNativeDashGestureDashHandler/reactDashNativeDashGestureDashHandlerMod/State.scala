package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.ACTIVE
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.BEGAN
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.CANCELLED
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.END
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.FAILED
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.State.UNDETERMINED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

@JSImport("react-native-gesture-handler", "State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ACTIVE extends State
  
  @js.native
  sealed trait BEGAN extends State
  
  @js.native
  sealed trait CANCELLED extends State
  
  @js.native
  sealed trait END extends State
  
  @js.native
  sealed trait FAILED extends State
  
  @js.native
  sealed trait UNDETERMINED extends State
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  /* 3 */ @js.native
  object ACTIVE extends TopLevel[ACTIVE with Double]
  
  /* 1 */ @js.native
  object BEGAN extends TopLevel[BEGAN with Double]
  
  /* 2 */ @js.native
  object CANCELLED extends TopLevel[CANCELLED with Double]
  
  /* 4 */ @js.native
  object END extends TopLevel[END with Double]
  
  /* 0 */ @js.native
  object FAILED extends TopLevel[FAILED with Double]
  
  /* 0 */ @js.native
  object UNDETERMINED extends TopLevel[UNDETERMINED with Double]
  
}

