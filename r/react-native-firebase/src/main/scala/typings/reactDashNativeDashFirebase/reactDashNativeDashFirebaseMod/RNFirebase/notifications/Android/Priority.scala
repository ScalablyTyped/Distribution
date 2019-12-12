package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.Default
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.High
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.Low
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.Max
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Priority.Min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Priority")
@js.native
object Priority extends js.Object {
  @js.native
  sealed trait Default extends Priority
  
  @js.native
  sealed trait High extends Priority
  
  @js.native
  sealed trait Low extends Priority
  
  @js.native
  sealed trait Max extends Priority
  
  @js.native
  sealed trait Min extends Priority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object High extends TopLevel[High with Double]
  
  /* -1 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  /* 2 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* -2 */ @js.native
  object Min extends TopLevel[Min with Double]
  
}

