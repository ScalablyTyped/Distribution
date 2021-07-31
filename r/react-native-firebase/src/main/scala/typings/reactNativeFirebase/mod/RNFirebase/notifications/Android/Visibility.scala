package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Visibility extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Visibility")
@js.native
object Visibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility & Double] = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with Visibility
  /* 0 */ val Private: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Visibility.Private & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with Visibility
  /* 1 */ val Public: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Visibility.Public & Double = js.native
  
  @js.native
  sealed trait Secret
    extends StObject
       with Visibility
  /* -1 */ val Secret: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Visibility.Secret & Double = js.native
}
