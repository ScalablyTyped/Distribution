package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BadgeIconType extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.BadgeIconType")
@js.native
object BadgeIconType extends js.Object {
  @js.native
  sealed trait Large extends BadgeIconType
  
  @js.native
  sealed trait None extends BadgeIconType
  
  @js.native
  sealed trait Small extends BadgeIconType
  
  /* 2 */ val Large: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.BadgeIconType.Large with Double = js.native
  /* 0 */ val None: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.BadgeIconType.None with Double = js.native
  /* 1 */ val Small: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.BadgeIconType.Small with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgeIconType with Double] = js.native
}

