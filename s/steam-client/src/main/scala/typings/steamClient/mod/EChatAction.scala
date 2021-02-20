package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatAction extends StObject
@JSImport("steam-client", "EChatAction")
@js.native
object EChatAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatAction with Double] = js.native
  
  @js.native
  sealed trait Ban extends EChatAction
  /* 3 */ val Ban: typings.steamClient.mod.EChatAction.Ban with Double = js.native
  
  @js.native
  sealed trait CloseChat extends EChatAction
  /* 9 */ val CloseChat: typings.steamClient.mod.EChatAction.CloseChat with Double = js.native
  
  @js.native
  sealed trait EndVoiceSpeak extends EChatAction
  /* 6 */ val EndVoiceSpeak: typings.steamClient.mod.EChatAction.EndVoiceSpeak with Double = js.native
  
  @js.native
  sealed trait InviteChat extends EChatAction
  /* 1 */ val InviteChat: typings.steamClient.mod.EChatAction.InviteChat with Double = js.native
  
  @js.native
  sealed trait Kick extends EChatAction
  /* 2 */ val Kick: typings.steamClient.mod.EChatAction.Kick with Double = js.native
  
  @js.native
  sealed trait LockChat extends EChatAction
  /* 7 */ val LockChat: typings.steamClient.mod.EChatAction.LockChat with Double = js.native
  
  @js.native
  sealed trait SetInvisibleToFriends extends EChatAction
  /* 13 */ val SetInvisibleToFriends: typings.steamClient.mod.EChatAction.SetInvisibleToFriends with Double = js.native
  
  @js.native
  sealed trait SetJoinable extends EChatAction
  /* 10 */ val SetJoinable: typings.steamClient.mod.EChatAction.SetJoinable with Double = js.native
  
  @js.native
  sealed trait SetModerated extends EChatAction
  /* 15 */ val SetModerated: typings.steamClient.mod.EChatAction.SetModerated with Double = js.native
  
  @js.native
  sealed trait SetOwner extends EChatAction
  /* 12 */ val SetOwner: typings.steamClient.mod.EChatAction.SetOwner with Double = js.native
  
  @js.native
  sealed trait SetUnjoinable extends EChatAction
  /* 11 */ val SetUnjoinable: typings.steamClient.mod.EChatAction.SetUnjoinable with Double = js.native
  
  @js.native
  sealed trait SetUnmoderated extends EChatAction
  /* 16 */ val SetUnmoderated: typings.steamClient.mod.EChatAction.SetUnmoderated with Double = js.native
  
  @js.native
  sealed trait SetVisibleToFriends extends EChatAction
  /* 14 */ val SetVisibleToFriends: typings.steamClient.mod.EChatAction.SetVisibleToFriends with Double = js.native
  
  @js.native
  sealed trait StartVoiceSpeak extends EChatAction
  /* 5 */ val StartVoiceSpeak: typings.steamClient.mod.EChatAction.StartVoiceSpeak with Double = js.native
  
  @js.native
  sealed trait UnBan extends EChatAction
  /* 4 */ val UnBan: typings.steamClient.mod.EChatAction.UnBan with Double = js.native
  
  @js.native
  sealed trait UnlockChat extends EChatAction
  /* 8 */ val UnlockChat: typings.steamClient.mod.EChatAction.UnlockChat with Double = js.native
}
