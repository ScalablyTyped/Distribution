package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends js.Object
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Visibility")
@js.native
object Visibility extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
  
  @js.native
  sealed trait Private extends Visibility
  /* 0 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Public extends Visibility
  /* 1 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  @js.native
  sealed trait Secret extends Visibility
  /* -1 */ @js.native
  object Secret extends TopLevel[Secret with Double]
}
