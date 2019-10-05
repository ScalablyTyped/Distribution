package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait Private extends Visibility
  
  @js.native
  sealed trait Public extends Visibility
  
  @js.native
  sealed trait Secret extends Visibility
  
  /* 0 */ val Private: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Visibility.Private with Double = js.native
  /* 1 */ val Public: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Visibility.Public with Double = js.native
  /* -1 */ val Secret: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Visibility.Secret with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
}

