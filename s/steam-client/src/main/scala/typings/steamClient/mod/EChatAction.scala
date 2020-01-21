package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatAction extends js.Object

@JSImport("steam-client", "EChatAction")
@js.native
object EChatAction extends js.Object {
  @js.native
  sealed trait Ban extends EChatAction
  
  @js.native
  sealed trait CloseChat extends EChatAction
  
  @js.native
  sealed trait EndVoiceSpeak extends EChatAction
  
  @js.native
  sealed trait InviteChat extends EChatAction
  
  @js.native
  sealed trait Kick extends EChatAction
  
  @js.native
  sealed trait LockChat extends EChatAction
  
  @js.native
  sealed trait SetInvisibleToFriends extends EChatAction
  
  @js.native
  sealed trait SetJoinable extends EChatAction
  
  @js.native
  sealed trait SetModerated extends EChatAction
  
  @js.native
  sealed trait SetOwner extends EChatAction
  
  @js.native
  sealed trait SetUnjoinable extends EChatAction
  
  @js.native
  sealed trait SetUnmoderated extends EChatAction
  
  @js.native
  sealed trait SetVisibleToFriends extends EChatAction
  
  @js.native
  sealed trait StartVoiceSpeak extends EChatAction
  
  @js.native
  sealed trait UnBan extends EChatAction
  
  @js.native
  sealed trait UnlockChat extends EChatAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatAction with Double] = js.native
  /* 3 */ @js.native
  object Ban extends TopLevel[Ban with Double]
  
  /* 9 */ @js.native
  object CloseChat extends TopLevel[CloseChat with Double]
  
  /* 6 */ @js.native
  object EndVoiceSpeak extends TopLevel[EndVoiceSpeak with Double]
  
  /* 1 */ @js.native
  object InviteChat extends TopLevel[InviteChat with Double]
  
  /* 2 */ @js.native
  object Kick extends TopLevel[Kick with Double]
  
  /* 7 */ @js.native
  object LockChat extends TopLevel[LockChat with Double]
  
  /* 13 */ @js.native
  object SetInvisibleToFriends extends TopLevel[SetInvisibleToFriends with Double]
  
  /* 10 */ @js.native
  object SetJoinable extends TopLevel[SetJoinable with Double]
  
  /* 15 */ @js.native
  object SetModerated extends TopLevel[SetModerated with Double]
  
  /* 12 */ @js.native
  object SetOwner extends TopLevel[SetOwner with Double]
  
  /* 11 */ @js.native
  object SetUnjoinable extends TopLevel[SetUnjoinable with Double]
  
  /* 16 */ @js.native
  object SetUnmoderated extends TopLevel[SetUnmoderated with Double]
  
  /* 14 */ @js.native
  object SetVisibleToFriends extends TopLevel[SetVisibleToFriends with Double]
  
  /* 5 */ @js.native
  object StartVoiceSpeak extends TopLevel[StartVoiceSpeak with Double]
  
  /* 4 */ @js.native
  object UnBan extends TopLevel[UnBan with Double]
  
  /* 8 */ @js.native
  object UnlockChat extends TopLevel[UnlockChat with Double]
  
}

