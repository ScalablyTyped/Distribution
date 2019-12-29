package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgeIconType with Double] = js.native
  /* 2 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Small extends TopLevel[Small with Double]
  
}

