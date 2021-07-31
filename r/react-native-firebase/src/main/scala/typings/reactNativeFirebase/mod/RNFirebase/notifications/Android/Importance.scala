package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Importance extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Importance")
@js.native
object Importance extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Importance & Double] = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with Importance
  /* 3 */ val Default: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Default & Double = js.native
  
  @js.native
  sealed trait High
    extends StObject
       with Importance
  /* 4 */ val High: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.High & Double = js.native
  
  @js.native
  sealed trait Low
    extends StObject
       with Importance
  /* 2 */ val Low: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Low & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with Importance
  /* 5 */ val Max: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Max & Double = js.native
  
  @js.native
  sealed trait Min
    extends StObject
       with Importance
  /* 1 */ val Min: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Min & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with Importance
  /* 3 */ val None: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.None & Double = js.native
  
  @js.native
  sealed trait Unspecified
    extends StObject
       with Importance
  /* -1000 */ val Unspecified: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance.Unspecified & Double = js.native
}
