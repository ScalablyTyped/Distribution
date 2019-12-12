package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EChatActionResult.ChatDoesntExist
import typings.steamDashClient.steamDashClientMod.EChatActionResult.ChatFull
import typings.steamDashClient.steamDashClientMod.EChatActionResult.Error
import typings.steamDashClient.steamDashClientMod.EChatActionResult.NotAllowedOnBannedUser
import typings.steamDashClient.steamDashClientMod.EChatActionResult.NotAllowedOnChatOwner
import typings.steamDashClient.steamDashClientMod.EChatActionResult.NotAllowedOnClanMember
import typings.steamDashClient.steamDashClientMod.EChatActionResult.NotAllowedOnSelf
import typings.steamDashClient.steamDashClientMod.EChatActionResult.NotPermitted
import typings.steamDashClient.steamDashClientMod.EChatActionResult.Success
import typings.steamDashClient.steamDashClientMod.EChatActionResult.VoiceSlotsFull
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatActionResult with Double] = js.native
  /* 8 */ @js.native
  object ChatDoesntExist extends TopLevel[ChatDoesntExist with Double]
  
  /* 9 */ @js.native
  object ChatFull extends TopLevel[ChatFull with Double]
  
  /* 2 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 5 */ @js.native
  object NotAllowedOnBannedUser extends TopLevel[NotAllowedOnBannedUser with Double]
  
  /* 6 */ @js.native
  object NotAllowedOnChatOwner extends TopLevel[NotAllowedOnChatOwner with Double]
  
  /* 4 */ @js.native
  object NotAllowedOnClanMember extends TopLevel[NotAllowedOnClanMember with Double]
  
  /* 7 */ @js.native
  object NotAllowedOnSelf extends TopLevel[NotAllowedOnSelf with Double]
  
  /* 3 */ @js.native
  object NotPermitted extends TopLevel[NotPermitted with Double]
  
  /* 1 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  /* 10 */ @js.native
  object VoiceSlotsFull extends TopLevel[VoiceSlotsFull with Double]
  
}

