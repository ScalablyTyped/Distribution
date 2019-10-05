package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SemanticAction extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.SemanticAction")
@js.native
object SemanticAction extends js.Object {
  @js.native
  sealed trait Archive extends SemanticAction
  
  @js.native
  sealed trait Call extends SemanticAction
  
  @js.native
  sealed trait Delete extends SemanticAction
  
  @js.native
  sealed trait MarkAsRead extends SemanticAction
  
  @js.native
  sealed trait MarkAsUnread extends SemanticAction
  
  @js.native
  sealed trait Mute extends SemanticAction
  
  @js.native
  sealed trait None extends SemanticAction
  
  @js.native
  sealed trait Reply extends SemanticAction
  
  @js.native
  sealed trait ThumbsDown extends SemanticAction
  
  @js.native
  sealed trait ThumbsUp extends SemanticAction
  
  @js.native
  sealed trait Unmute extends SemanticAction
  
  /* 5 */ val Archive: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.Archive with Double = js.native
  /* 10 */ val Call: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.Call with Double = js.native
  /* 4 */ val Delete: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.Delete with Double = js.native
  /* 2 */ val MarkAsRead: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.MarkAsRead with Double = js.native
  /* 3 */ val MarkAsUnread: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.MarkAsUnread with Double = js.native
  /* 6 */ val Mute: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.Mute with Double = js.native
  /* 0 */ val None: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.None with Double = js.native
  /* 1 */ val Reply: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.Reply with Double = js.native
  /* 9 */ val ThumbsDown: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.ThumbsDown with Double = js.native
  /* 8 */ val ThumbsUp: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.ThumbsUp with Double = js.native
  /* 7 */ val Unmute: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.SemanticAction.Unmute with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SemanticAction with Double] = js.native
}

