package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Visibility.Private
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Visibility.Public
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Visibility.Secret
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
  /* 0 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /* 1 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  /* -1 */ @js.native
  object Secret extends TopLevel[Secret with Double]
  
}

