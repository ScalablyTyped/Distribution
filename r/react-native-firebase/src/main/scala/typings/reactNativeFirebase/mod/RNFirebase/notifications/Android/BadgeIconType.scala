package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BadgeIconType extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.BadgeIconType")
@js.native
object BadgeIconType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgeIconType with Double] = js.native
  
  @js.native
  sealed trait Large extends BadgeIconType
  /* 2 */ val Large: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.BadgeIconType.Large with Double = js.native
  
  @js.native
  sealed trait None extends BadgeIconType
  /* 0 */ val None: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.BadgeIconType.None with Double = js.native
  
  @js.native
  sealed trait Small extends BadgeIconType
  /* 1 */ val Small: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.BadgeIconType.Small with Double = js.native
}
