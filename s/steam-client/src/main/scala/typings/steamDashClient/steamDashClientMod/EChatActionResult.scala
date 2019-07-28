package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatActionResult extends js.Object

@JSImport("steam-client", "EChatActionResult")
@js.native
object EChatActionResult extends js.Object {
  @js.native
  sealed trait ChatDoesntExist extends EChatActionResult
  
  @js.native
  sealed trait ChatFull extends EChatActionResult
  
  @js.native
  sealed trait Error extends EChatActionResult
  
  @js.native
  sealed trait NotAllowedOnBannedUser extends EChatActionResult
  
  @js.native
  sealed trait NotAllowedOnChatOwner extends EChatActionResult
  
  @js.native
  sealed trait NotAllowedOnClanMember extends EChatActionResult
  
  @js.native
  sealed trait NotAllowedOnSelf extends EChatActionResult
  
  @js.native
  sealed trait NotPermitted extends EChatActionResult
  
  @js.native
  sealed trait Success extends EChatActionResult
  
  @js.native
  sealed trait VoiceSlotsFull extends EChatActionResult
  
  /* 8 */ val ChatDoesntExist: typings.steamDashClient.steamDashClientMod.EChatActionResult.ChatDoesntExist with Double = js.native
  /* 9 */ val ChatFull: typings.steamDashClient.steamDashClientMod.EChatActionResult.ChatFull with Double = js.native
  /* 2 */ val Error: typings.steamDashClient.steamDashClientMod.EChatActionResult.Error with Double = js.native
  /* 5 */ val NotAllowedOnBannedUser: typings.steamDashClient.steamDashClientMod.EChatActionResult.NotAllowedOnBannedUser with Double = js.native
  /* 6 */ val NotAllowedOnChatOwner: typings.steamDashClient.steamDashClientMod.EChatActionResult.NotAllowedOnChatOwner with Double = js.native
  /* 4 */ val NotAllowedOnClanMember: typings.steamDashClient.steamDashClientMod.EChatActionResult.NotAllowedOnClanMember with Double = js.native
  /* 7 */ val NotAllowedOnSelf: typings.steamDashClient.steamDashClientMod.EChatActionResult.NotAllowedOnSelf with Double = js.native
  /* 3 */ val NotPermitted: typings.steamDashClient.steamDashClientMod.EChatActionResult.NotPermitted with Double = js.native
  /* 1 */ val Success: typings.steamDashClient.steamDashClientMod.EChatActionResult.Success with Double = js.native
  /* 10 */ val VoiceSlotsFull: typings.steamDashClient.steamDashClientMod.EChatActionResult.VoiceSlotsFull with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatActionResult with Double] = js.native
}

