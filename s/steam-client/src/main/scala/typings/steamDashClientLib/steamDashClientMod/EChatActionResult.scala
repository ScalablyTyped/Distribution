package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatActionResult extends js.Object

@JSImport("steam-client", "EChatActionResult")
@js.native
object EChatActionResult extends js.Object {
  @js.native
  sealed trait ChatDoesntExist
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait ChatFull
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait Error
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait NotAllowedOnBannedUser
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait NotAllowedOnChatOwner
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait NotAllowedOnClanMember
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait NotAllowedOnSelf
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait NotPermitted
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait Success
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  @js.native
  sealed trait VoiceSlotsFull
    extends steamDashClientLib.steamDashClientMod.EChatActionResult
  
  /* 8 */ val ChatDoesntExist: ChatDoesntExist with scala.Double = js.native
  /* 9 */ val ChatFull: ChatFull with scala.Double = js.native
  /* 2 */ val Error: Error with scala.Double = js.native
  /* 5 */ val NotAllowedOnBannedUser: NotAllowedOnBannedUser with scala.Double = js.native
  /* 6 */ val NotAllowedOnChatOwner: NotAllowedOnChatOwner with scala.Double = js.native
  /* 4 */ val NotAllowedOnClanMember: NotAllowedOnClanMember with scala.Double = js.native
  /* 7 */ val NotAllowedOnSelf: NotAllowedOnSelf with scala.Double = js.native
  /* 3 */ val NotPermitted: NotPermitted with scala.Double = js.native
  /* 1 */ val Success: Success with scala.Double = js.native
  /* 10 */ val VoiceSlotsFull: VoiceSlotsFull with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatActionResult with scala.Double] = js.native
}

