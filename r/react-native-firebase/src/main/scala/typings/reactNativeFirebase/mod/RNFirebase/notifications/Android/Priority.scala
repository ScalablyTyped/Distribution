package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Priority extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Priority")
@js.native
object Priority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority & Double] = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with Priority
  /* 0 */ val Default: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.Default & Double = js.native
  
  @js.native
  sealed trait High
    extends StObject
       with Priority
  /* 1 */ val High: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.High & Double = js.native
  
  @js.native
  sealed trait Low
    extends StObject
       with Priority
  /* -1 */ val Low: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.Low & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with Priority
  /* 2 */ val Max: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.Max & Double = js.native
  
  @js.native
  sealed trait Min
    extends StObject
       with Priority
  /* -2 */ val Min: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority.Min & Double = js.native
}
