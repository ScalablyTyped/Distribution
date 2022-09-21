package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatActionResult extends StObject
@JSImport("steam-user", "EChatActionResult")
@js.native
object EChatActionResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatActionResult & Double] = js.native
  
  @js.native
  sealed trait ChatDoesntExist
    extends StObject
       with EChatActionResult
  /* 8 */ val ChatDoesntExist: typings.steamUser.mod.EChatActionResult.ChatDoesntExist & Double = js.native
  
  @js.native
  sealed trait ChatFull
    extends StObject
       with EChatActionResult
  /* 9 */ val ChatFull: typings.steamUser.mod.EChatActionResult.ChatFull & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with EChatActionResult
  /* 2 */ val Error: typings.steamUser.mod.EChatActionResult.Error & Double = js.native
  
  @js.native
  sealed trait NotAllowedOnBannedUser
    extends StObject
       with EChatActionResult
  /* 5 */ val NotAllowedOnBannedUser: typings.steamUser.mod.EChatActionResult.NotAllowedOnBannedUser & Double = js.native
  
  @js.native
  sealed trait NotAllowedOnChatOwner
    extends StObject
       with EChatActionResult
  /* 6 */ val NotAllowedOnChatOwner: typings.steamUser.mod.EChatActionResult.NotAllowedOnChatOwner & Double = js.native
  
  @js.native
  sealed trait NotAllowedOnClanMember
    extends StObject
       with EChatActionResult
  /* 4 */ val NotAllowedOnClanMember: typings.steamUser.mod.EChatActionResult.NotAllowedOnClanMember & Double = js.native
  
  @js.native
  sealed trait NotAllowedOnSelf
    extends StObject
       with EChatActionResult
  /* 7 */ val NotAllowedOnSelf: typings.steamUser.mod.EChatActionResult.NotAllowedOnSelf & Double = js.native
  
  @js.native
  sealed trait NotPermitted
    extends StObject
       with EChatActionResult
  /* 3 */ val NotPermitted: typings.steamUser.mod.EChatActionResult.NotPermitted & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with EChatActionResult
  /* 1 */ val Success: typings.steamUser.mod.EChatActionResult.Success & Double = js.native
  
  @js.native
  sealed trait VoiceSlotsFull
    extends StObject
       with EChatActionResult
  /* 10 */ val VoiceSlotsFull: typings.steamUser.mod.EChatActionResult.VoiceSlotsFull & Double = js.native
}
