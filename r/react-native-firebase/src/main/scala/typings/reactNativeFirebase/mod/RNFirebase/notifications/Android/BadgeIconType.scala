package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BadgeIconType extends js.Object
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.BadgeIconType")
@js.native
object BadgeIconType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgeIconType with Double] = js.native
  
  @js.native
  sealed trait Large extends BadgeIconType
  /* 2 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  @js.native
  sealed trait None extends BadgeIconType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Small extends BadgeIconType
  /* 1 */ @js.native
  object Small extends TopLevel[Small with Double]
}
