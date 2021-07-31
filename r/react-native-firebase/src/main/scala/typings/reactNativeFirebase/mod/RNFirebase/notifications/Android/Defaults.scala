package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Defaults extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Defaults")
@js.native
object Defaults extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Defaults & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with Defaults
  /* -1 */ val All: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.All & Double = js.native
  
  @js.native
  sealed trait Lights
    extends StObject
       with Defaults
  /* 4 */ val Lights: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Lights & Double = js.native
  
  @js.native
  sealed trait Sound
    extends StObject
       with Defaults
  /* 1 */ val Sound: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Sound & Double = js.native
  
  @js.native
  sealed trait Vibrate
    extends StObject
       with Defaults
  /* 2 */ val Vibrate: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Vibrate & Double = js.native
}
