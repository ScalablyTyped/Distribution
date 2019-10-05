package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Importance extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Importance")
@js.native
object Importance extends js.Object {
  @js.native
  sealed trait Default extends Importance
  
  @js.native
  sealed trait High extends Importance
  
  @js.native
  sealed trait Low extends Importance
  
  @js.native
  sealed trait Max extends Importance
  
  @js.native
  sealed trait Min extends Importance
  
  @js.native
  sealed trait None extends Importance
  
  @js.native
  sealed trait Unspecified extends Importance
  
  /* 3 */ val Default: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Default with Double = js.native
  /* 4 */ val High: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.High with Double = js.native
  /* 2 */ val Low: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Low with Double = js.native
  /* 5 */ val Max: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Max with Double = js.native
  /* 1 */ val Min: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Min with Double = js.native
  /* 3 */ val None: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.None with Double = js.native
  /* -1000 */ val Unspecified: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Importance with Double] = js.native
}

