package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SemanticAction with Double] = js.native
  /* 5 */ @js.native
  object Archive extends TopLevel[Archive with Double]
  
  /* 10 */ @js.native
  object Call extends TopLevel[Call with Double]
  
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 2 */ @js.native
  object MarkAsRead extends TopLevel[MarkAsRead with Double]
  
  /* 3 */ @js.native
  object MarkAsUnread extends TopLevel[MarkAsUnread with Double]
  
  /* 6 */ @js.native
  object Mute extends TopLevel[Mute with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Reply extends TopLevel[Reply with Double]
  
  /* 9 */ @js.native
  object ThumbsDown extends TopLevel[ThumbsDown with Double]
  
  /* 8 */ @js.native
  object ThumbsUp extends TopLevel[ThumbsUp with Double]
  
  /* 7 */ @js.native
  object Unmute extends TopLevel[Unmute with Double]
  
}

