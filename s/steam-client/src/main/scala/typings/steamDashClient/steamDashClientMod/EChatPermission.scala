package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatPermission extends js.Object

@JSImport("steam-client", "EChatPermission")
@js.native
object EChatPermission extends js.Object {
  @js.native
  sealed trait Ban extends EChatPermission
  
  @js.native
  sealed trait ChangeAccess extends EChatPermission
  
  @js.native
  sealed trait ChangePermissions extends EChatPermission
  
  @js.native
  sealed trait Close extends EChatPermission
  
   // 10
  @js.native
  sealed trait EveryoneDefault extends EChatPermission
  
   // 8
  @js.native
  sealed trait EveryoneNotInClanDefault extends EChatPermission
  
  @js.native
  sealed trait Invite extends EChatPermission
  
  @js.native
  sealed trait Kick extends EChatPermission
  
  @js.native
  sealed trait Mask extends EChatPermission
  
  // todo: this doesn't seem correct...
   // 282
  @js.native
  sealed trait MemberDefault extends EChatPermission
  
  @js.native
  sealed trait Mute extends EChatPermission
  
   // 282
  @js.native
  sealed trait OfficerDefault extends EChatPermission
  
   // 891
  @js.native
  sealed trait OwnerDefault extends EChatPermission
  
  @js.native
  sealed trait SetMetadata extends EChatPermission
  
  @js.native
  sealed trait Talk extends EChatPermission
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatPermission with Double] = js.native
  /* 256 */ @js.native
  object Ban extends TopLevel[Ban with Double]
  
  /* 512 */ @js.native
  object ChangeAccess extends TopLevel[ChangeAccess with Double]
  
  /* 128 */ @js.native
  object ChangePermissions extends TopLevel[ChangePermissions with Double]
  
  /* 1 */ @js.native
  object Close extends TopLevel[Close with Double]
  
  /* 8 | 2 */ @js.native
  object EveryoneDefault extends TopLevel[EveryoneDefault with Double]
  
  /* 8 */ @js.native
  object EveryoneNotInClanDefault extends TopLevel[EveryoneNotInClanDefault with Double]
  
  /* 2 */ @js.native
  object Invite extends TopLevel[Invite with Double]
  
  /* 16 */ @js.native
  object Kick extends TopLevel[Kick with Double]
  
  /* 1019 */ @js.native
  object Mask extends TopLevel[Mask with Double]
  
  /* 256 | 16 | 8 | 2 */ @js.native
  object MemberDefault extends TopLevel[MemberDefault with Double]
  
  /* 32 */ @js.native
  object Mute extends TopLevel[Mute with Double]
  
  /* 256 | 16 | 8 | 2 */ @js.native
  object OfficerDefault extends TopLevel[OfficerDefault with Double]
  
  /* 512 | 256 | 64 | 32 | 16 | 8 | 2 | 1 */ @js.native
  object OwnerDefault extends TopLevel[OwnerDefault with Double]
  
  /* 64 */ @js.native
  object SetMetadata extends TopLevel[SetMetadata with Double]
  
  /* 8 */ @js.native
  object Talk extends TopLevel[Talk with Double]
  
}

