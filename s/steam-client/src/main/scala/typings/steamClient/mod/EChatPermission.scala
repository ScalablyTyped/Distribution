package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatPermission extends js.Object
@JSImport("steam-client", "EChatPermission")
@js.native
object EChatPermission extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatPermission with Double] = js.native
  
  @js.native
  sealed trait Ban extends EChatPermission
  /* 256 */ @js.native
  object Ban extends TopLevel[Ban with Double]
  
  @js.native
  sealed trait ChangeAccess extends EChatPermission
  /* 512 */ @js.native
  object ChangeAccess extends TopLevel[ChangeAccess with Double]
  
  @js.native
  sealed trait ChangePermissions extends EChatPermission
  /* 128 */ @js.native
  object ChangePermissions extends TopLevel[ChangePermissions with Double]
  
  @js.native
  sealed trait Close extends EChatPermission
  /* 1 */ @js.native
  object Close extends TopLevel[Close with Double]
  
   // 10
  @js.native
  sealed trait EveryoneDefault extends EChatPermission
  /* 8 | 2 */ @js.native
  object EveryoneDefault extends TopLevel[EveryoneDefault with Double]
  
   // 8
  @js.native
  sealed trait EveryoneNotInClanDefault extends EChatPermission
  /* 8 */ @js.native
  object EveryoneNotInClanDefault extends TopLevel[EveryoneNotInClanDefault with Double]
  
  @js.native
  sealed trait Invite extends EChatPermission
  /* 2 */ @js.native
  object Invite extends TopLevel[Invite with Double]
  
  @js.native
  sealed trait Kick extends EChatPermission
  /* 16 */ @js.native
  object Kick extends TopLevel[Kick with Double]
  
  @js.native
  sealed trait Mask extends EChatPermission
  /* 1019 */ @js.native
  object Mask extends TopLevel[Mask with Double]
  
  // todo: this doesn't seem correct...
   // 282
  @js.native
  sealed trait MemberDefault extends EChatPermission
  /* 256 | 16 | 8 | 2 */ @js.native
  object MemberDefault extends TopLevel[MemberDefault with Double]
  
  @js.native
  sealed trait Mute extends EChatPermission
  /* 32 */ @js.native
  object Mute extends TopLevel[Mute with Double]
  
   // 282
  @js.native
  sealed trait OfficerDefault extends EChatPermission
  /* 256 | 16 | 8 | 2 */ @js.native
  object OfficerDefault extends TopLevel[OfficerDefault with Double]
  
   // 891
  @js.native
  sealed trait OwnerDefault extends EChatPermission
  /* 512 | 256 | 64 | 32 | 16 | 8 | 2 | 1 */ @js.native
  object OwnerDefault extends TopLevel[OwnerDefault with Double]
  
  @js.native
  sealed trait SetMetadata extends EChatPermission
  /* 64 */ @js.native
  object SetMetadata extends TopLevel[SetMetadata with Double]
  
  @js.native
  sealed trait Talk extends EChatPermission
  /* 8 */ @js.native
  object Talk extends TopLevel[Talk with Double]
}
