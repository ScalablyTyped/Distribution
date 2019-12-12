package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Default
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.High
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Low
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Max
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Min
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.None
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Importance.Unspecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Importance extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Importance")
@js.native
object Importance extends js.Object {
  @js.native
  sealed trait Default extends Importance
  
  @js.native
  sealed trait High extends Importance
  
  @js.native
  sealed trait Low extends Importance
  
  @js.native
  sealed trait Max extends Importance
  
  @js.native
  sealed trait Min extends Importance
  
  @js.native
  sealed trait None extends Importance
  
  @js.native
  sealed trait Unspecified extends Importance
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Importance with Double] = js.native
  /* 3 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 4 */ @js.native
  object High extends TopLevel[High with Double]
  
  /* 2 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 1 */ @js.native
  object Min extends TopLevel[Min with Double]
  
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* -1000 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
}

