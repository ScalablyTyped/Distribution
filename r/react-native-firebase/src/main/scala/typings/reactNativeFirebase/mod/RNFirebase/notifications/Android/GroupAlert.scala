package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupAlert extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.GroupAlert")
@js.native
object GroupAlert extends js.Object {
  @js.native
  sealed trait All extends GroupAlert
  
  @js.native
  sealed trait Children extends GroupAlert
  
  @js.native
  sealed trait Summary extends GroupAlert
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupAlert with Double] = js.native
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Children extends TopLevel[Children with Double]
  
  /* 1 */ @js.native
  object Summary extends TopLevel[Summary with Double]
  
}

