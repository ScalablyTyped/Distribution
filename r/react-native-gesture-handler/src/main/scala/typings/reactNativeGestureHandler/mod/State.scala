package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends js.Object
@JSImport("react-native-gesture-handler", "State")
@js.native
object State extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  
  @js.native
  sealed trait ACTIVE extends State
  /* 3 */ @js.native
  object ACTIVE extends TopLevel[ACTIVE with Double]
  
  @js.native
  sealed trait BEGAN extends State
  /* 1 */ @js.native
  object BEGAN extends TopLevel[BEGAN with Double]
  
  @js.native
  sealed trait CANCELLED extends State
  /* 2 */ @js.native
  object CANCELLED extends TopLevel[CANCELLED with Double]
  
  @js.native
  sealed trait END extends State
  /* 4 */ @js.native
  object END extends TopLevel[END with Double]
  
  @js.native
  sealed trait FAILED extends State
  /* 0 */ @js.native
  object FAILED extends TopLevel[FAILED with Double]
  
  @js.native
  sealed trait UNDETERMINED extends State
  /* 0 */ @js.native
  object UNDETERMINED extends TopLevel[UNDETERMINED with Double]
}
