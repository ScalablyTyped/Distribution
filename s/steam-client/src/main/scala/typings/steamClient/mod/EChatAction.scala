package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatAction extends js.Object
@JSImport("steam-client", "EChatAction")
@js.native
object EChatAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatAction with Double] = js.native
  
  @js.native
  sealed trait Ban extends EChatAction
  /* 3 */ @js.native
  object Ban extends TopLevel[Ban with Double]
  
  @js.native
  sealed trait CloseChat extends EChatAction
  /* 9 */ @js.native
  object CloseChat extends TopLevel[CloseChat with Double]
  
  @js.native
  sealed trait EndVoiceSpeak extends EChatAction
  /* 6 */ @js.native
  object EndVoiceSpeak extends TopLevel[EndVoiceSpeak with Double]
  
  @js.native
  sealed trait InviteChat extends EChatAction
  /* 1 */ @js.native
  object InviteChat extends TopLevel[InviteChat with Double]
  
  @js.native
  sealed trait Kick extends EChatAction
  /* 2 */ @js.native
  object Kick extends TopLevel[Kick with Double]
  
  @js.native
  sealed trait LockChat extends EChatAction
  /* 7 */ @js.native
  object LockChat extends TopLevel[LockChat with Double]
  
  @js.native
  sealed trait SetInvisibleToFriends extends EChatAction
  /* 13 */ @js.native
  object SetInvisibleToFriends extends TopLevel[SetInvisibleToFriends with Double]
  
  @js.native
  sealed trait SetJoinable extends EChatAction
  /* 10 */ @js.native
  object SetJoinable extends TopLevel[SetJoinable with Double]
  
  @js.native
  sealed trait SetModerated extends EChatAction
  /* 15 */ @js.native
  object SetModerated extends TopLevel[SetModerated with Double]
  
  @js.native
  sealed trait SetOwner extends EChatAction
  /* 12 */ @js.native
  object SetOwner extends TopLevel[SetOwner with Double]
  
  @js.native
  sealed trait SetUnjoinable extends EChatAction
  /* 11 */ @js.native
  object SetUnjoinable extends TopLevel[SetUnjoinable with Double]
  
  @js.native
  sealed trait SetUnmoderated extends EChatAction
  /* 16 */ @js.native
  object SetUnmoderated extends TopLevel[SetUnmoderated with Double]
  
  @js.native
  sealed trait SetVisibleToFriends extends EChatAction
  /* 14 */ @js.native
  object SetVisibleToFriends extends TopLevel[SetVisibleToFriends with Double]
  
  @js.native
  sealed trait StartVoiceSpeak extends EChatAction
  /* 5 */ @js.native
  object StartVoiceSpeak extends TopLevel[StartVoiceSpeak with Double]
  
  @js.native
  sealed trait UnBan extends EChatAction
  /* 4 */ @js.native
  object UnBan extends TopLevel[UnBan with Double]
  
  @js.native
  sealed trait UnlockChat extends EChatAction
  /* 8 */ @js.native
  object UnlockChat extends TopLevel[UnlockChat with Double]
}
