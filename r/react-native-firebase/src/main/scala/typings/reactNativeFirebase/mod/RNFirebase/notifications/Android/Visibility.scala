package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Visibility")
@js.native
object Visibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
  
  @js.native
  sealed trait Private extends Visibility
  /* 0 */ val Private: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Visibility.Private with Double = js.native
  
  @js.native
  sealed trait Public extends Visibility
  /* 1 */ val Public: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Visibility.Public with Double = js.native
  
  @js.native
  sealed trait Secret extends Visibility
  /* -1 */ val Secret: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Visibility.Secret with Double = js.native
}
