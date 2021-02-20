package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Defaults extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Defaults")
@js.native
object Defaults extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Defaults with Double] = js.native
  
  @js.native
  sealed trait All extends Defaults
  /* -1 */ val All: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.All with Double = js.native
  
  @js.native
  sealed trait Lights extends Defaults
  /* 4 */ val Lights: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Lights with Double = js.native
  
  @js.native
  sealed trait Sound extends Defaults
  /* 1 */ val Sound: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Sound with Double = js.native
  
  @js.native
  sealed trait Vibrate extends Defaults
  /* 2 */ val Vibrate: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Vibrate with Double = js.native
}
