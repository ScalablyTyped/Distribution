package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Importance extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Importance")
@js.native
object Importance extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Importance with Double] = js.native
  
  @js.native
  sealed trait Default extends Importance
  /* 3 */ val Default: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Default with Double = js.native
  
  @js.native
  sealed trait High extends Importance
  /* 4 */ val High: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.High with Double = js.native
  
  @js.native
  sealed trait Low extends Importance
  /* 2 */ val Low: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Low with Double = js.native
  
  @js.native
  sealed trait Max extends Importance
  /* 5 */ val Max: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Max with Double = js.native
  
  @js.native
  sealed trait Min extends Importance
  /* 1 */ val Min: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Min with Double = js.native
  
  @js.native
  sealed trait None extends Importance
  /* 3 */ val None: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.None with Double = js.native
  
  @js.native
  sealed trait Unspecified extends Importance
  /* -1000 */ val Unspecified: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Unspecified with Double = js.native
}
