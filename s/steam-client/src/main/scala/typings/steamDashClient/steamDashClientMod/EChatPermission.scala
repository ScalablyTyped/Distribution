package typings.steamDashClient.steamDashClientMod

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
  
  /* 256 */ val Ban: typings.steamDashClient.steamDashClientMod.EChatPermission.Ban with Double = js.native
  /* 512 */ val ChangeAccess: typings.steamDashClient.steamDashClientMod.EChatPermission.ChangeAccess with Double = js.native
  /* 128 */ val ChangePermissions: typings.steamDashClient.steamDashClientMod.EChatPermission.ChangePermissions with Double = js.native
  /* 1 */ val Close: typings.steamDashClient.steamDashClientMod.EChatPermission.Close with Double = js.native
  /* 8 | 2 */ val EveryoneDefault: typings.steamDashClient.steamDashClientMod.EChatPermission.EveryoneDefault with Double = js.native
  /* 8 */ val EveryoneNotInClanDefault: typings.steamDashClient.steamDashClientMod.EChatPermission.EveryoneNotInClanDefault with Double = js.native
  /* 2 */ val Invite: typings.steamDashClient.steamDashClientMod.EChatPermission.Invite with Double = js.native
  /* 16 */ val Kick: typings.steamDashClient.steamDashClientMod.EChatPermission.Kick with Double = js.native
  /* 1019 */ val Mask: typings.steamDashClient.steamDashClientMod.EChatPermission.Mask with Double = js.native
  /* 256 | 16 | 8 | 2 */ val MemberDefault: typings.steamDashClient.steamDashClientMod.EChatPermission.MemberDefault with Double = js.native
  /* 32 */ val Mute: typings.steamDashClient.steamDashClientMod.EChatPermission.Mute with Double = js.native
  /* 256 | 16 | 8 | 2 */ val OfficerDefault: typings.steamDashClient.steamDashClientMod.EChatPermission.OfficerDefault with Double = js.native
  /* 512 | 256 | 64 | 32 | 16 | 8 | 2 | 1 */ val OwnerDefault: typings.steamDashClient.steamDashClientMod.EChatPermission.OwnerDefault with Double = js.native
  /* 64 */ val SetMetadata: typings.steamDashClient.steamDashClientMod.EChatPermission.SetMetadata with Double = js.native
  /* 8 */ val Talk: typings.steamDashClient.steamDashClientMod.EChatPermission.Talk with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatPermission with Double] = js.native
}

