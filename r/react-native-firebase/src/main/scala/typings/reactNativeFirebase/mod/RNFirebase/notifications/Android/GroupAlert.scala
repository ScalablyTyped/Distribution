package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupAlert extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.GroupAlert")
@js.native
object GroupAlert extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupAlert & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with GroupAlert
  /* 0 */ val All: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.GroupAlert.All & Double = js.native
  
  @js.native
  sealed trait Children
    extends StObject
       with GroupAlert
  /* 2 */ val Children: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.GroupAlert.Children & Double = js.native
  
  @js.native
  sealed trait Summary
    extends StObject
       with GroupAlert
  /* 1 */ val Summary: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.GroupAlert.Summary & Double = js.native
}
