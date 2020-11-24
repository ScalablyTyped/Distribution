package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatActionResult extends js.Object
@JSImport("steam-client", "EChatActionResult")
@js.native
object EChatActionResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatActionResult with Double] = js.native
  
  @js.native
  sealed trait ChatDoesntExist extends EChatActionResult
  /* 8 */ @js.native
  object ChatDoesntExist extends TopLevel[ChatDoesntExist with Double]
  
  @js.native
  sealed trait ChatFull extends EChatActionResult
  /* 9 */ @js.native
  object ChatFull extends TopLevel[ChatFull with Double]
  
  @js.native
  sealed trait Error extends EChatActionResult
  /* 2 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait NotAllowedOnBannedUser extends EChatActionResult
  /* 5 */ @js.native
  object NotAllowedOnBannedUser extends TopLevel[NotAllowedOnBannedUser with Double]
  
  @js.native
  sealed trait NotAllowedOnChatOwner extends EChatActionResult
  /* 6 */ @js.native
  object NotAllowedOnChatOwner extends TopLevel[NotAllowedOnChatOwner with Double]
  
  @js.native
  sealed trait NotAllowedOnClanMember extends EChatActionResult
  /* 4 */ @js.native
  object NotAllowedOnClanMember extends TopLevel[NotAllowedOnClanMember with Double]
  
  @js.native
  sealed trait NotAllowedOnSelf extends EChatActionResult
  /* 7 */ @js.native
  object NotAllowedOnSelf extends TopLevel[NotAllowedOnSelf with Double]
  
  @js.native
  sealed trait NotPermitted extends EChatActionResult
  /* 3 */ @js.native
  object NotPermitted extends TopLevel[NotPermitted with Double]
  
  @js.native
  sealed trait Success extends EChatActionResult
  /* 1 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  @js.native
  sealed trait VoiceSlotsFull extends EChatActionResult
  /* 10 */ @js.native
  object VoiceSlotsFull extends TopLevel[VoiceSlotsFull with Double]
}
