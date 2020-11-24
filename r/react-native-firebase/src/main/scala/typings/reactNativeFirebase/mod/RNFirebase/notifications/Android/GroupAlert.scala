package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupAlert extends js.Object
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.GroupAlert")
@js.native
object GroupAlert extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupAlert with Double] = js.native
  
  @js.native
  sealed trait All extends GroupAlert
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Children extends GroupAlert
  /* 2 */ @js.native
  object Children extends TopLevel[Children with Double]
  
  @js.native
  sealed trait Summary extends GroupAlert
  /* 1 */ @js.native
  object Summary extends TopLevel[Summary with Double]
}
