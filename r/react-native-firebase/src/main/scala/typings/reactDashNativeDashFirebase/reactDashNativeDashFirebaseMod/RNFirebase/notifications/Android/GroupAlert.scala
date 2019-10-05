package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

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
  
  /* 0 */ val All: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.GroupAlert.All with Double = js.native
  /* 2 */ val Children: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.GroupAlert.Children with Double = js.native
  /* 1 */ val Summary: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.GroupAlert.Summary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupAlert with Double] = js.native
}

