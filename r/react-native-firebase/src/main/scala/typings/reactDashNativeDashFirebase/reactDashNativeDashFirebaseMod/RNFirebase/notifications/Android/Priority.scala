package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Priority")
@js.native
object Priority extends js.Object {
  @js.native
  sealed trait Default extends Priority
  
  @js.native
  sealed trait High extends Priority
  
  @js.native
  sealed trait Low extends Priority
  
  @js.native
  sealed trait Max extends Priority
  
  @js.native
  sealed trait Min extends Priority
  
  /* 0 */ val Default: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.Default with Double = js.native
  /* 1 */ val High: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.High with Double = js.native
  /* -1 */ val Low: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.Low with Double = js.native
  /* 2 */ val Max: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.Max with Double = js.native
  /* -2 */ val Min: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.Min with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
}

