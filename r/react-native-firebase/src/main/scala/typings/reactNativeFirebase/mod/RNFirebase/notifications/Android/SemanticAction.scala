package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticAction extends StObject
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.SemanticAction")
@js.native
object SemanticAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SemanticAction & Double] = js.native
  
  @js.native
  sealed trait Archive
    extends StObject
       with SemanticAction
  /* 5 */ val Archive: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Archive & Double = js.native
  
  @js.native
  sealed trait Call
    extends StObject
       with SemanticAction
  /* 10 */ val Call: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Call & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with SemanticAction
  /* 4 */ val Delete: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Delete & Double = js.native
  
  @js.native
  sealed trait MarkAsRead
    extends StObject
       with SemanticAction
  /* 2 */ val MarkAsRead: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.MarkAsRead & Double = js.native
  
  @js.native
  sealed trait MarkAsUnread
    extends StObject
       with SemanticAction
  /* 3 */ val MarkAsUnread: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.MarkAsUnread & Double = js.native
  
  @js.native
  sealed trait Mute
    extends StObject
       with SemanticAction
  /* 6 */ val Mute: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Mute & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SemanticAction
  /* 0 */ val None: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.None & Double = js.native
  
  @js.native
  sealed trait Reply
    extends StObject
       with SemanticAction
  /* 1 */ val Reply: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Reply & Double = js.native
  
  @js.native
  sealed trait ThumbsDown
    extends StObject
       with SemanticAction
  /* 9 */ val ThumbsDown: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.ThumbsDown & Double = js.native
  
  @js.native
  sealed trait ThumbsUp
    extends StObject
       with SemanticAction
  /* 8 */ val ThumbsUp: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.ThumbsUp & Double = js.native
  
  @js.native
  sealed trait Unmute
    extends StObject
       with SemanticAction
  /* 7 */ val Unmute: typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.SemanticAction.Unmute & Double = js.native
}
