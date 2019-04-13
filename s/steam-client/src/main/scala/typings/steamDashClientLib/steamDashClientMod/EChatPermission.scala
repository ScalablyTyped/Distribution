package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatPermission extends js.Object

@JSImport("steam-client", "EChatPermission")
@js.native
object EChatPermission extends js.Object {
  @js.native
  sealed trait Ban
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait ChangeAccess
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait ChangePermissions
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait Close
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
   // 10
  @js.native
  sealed trait EveryoneDefault
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
   // 8
  @js.native
  sealed trait EveryoneNotInClanDefault
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait Invite
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait Kick
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait Mask
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  // todo: this doesn't seem correct...
   // 282
  @js.native
  sealed trait MemberDefault
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait Mute
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
   // 282
  @js.native
  sealed trait OfficerDefault
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
   // 891
  @js.native
  sealed trait OwnerDefault
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait SetMetadata
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  @js.native
  sealed trait Talk
    extends steamDashClientLib.steamDashClientMod.EChatPermission
  
  /* 256 */ val Ban: Ban with scala.Double = js.native
  /* 512 */ val ChangeAccess: ChangeAccess with scala.Double = js.native
  /* 128 */ val ChangePermissions: ChangePermissions with scala.Double = js.native
  /* 1 */ val Close: Close with scala.Double = js.native
  /* Talk | Invite */ val EveryoneDefault: EveryoneDefault with scala.Double = js.native
  /* Talk */ val EveryoneNotInClanDefault: EveryoneNotInClanDefault with scala.Double = js.native
  /* 2 */ val Invite: Invite with scala.Double = js.native
  /* 16 */ val Kick: Kick with scala.Double = js.native
  /* 1019 */ val Mask: Mask with scala.Double = js.native
  /* Ban | Kick | Talk | Invite */ val MemberDefault: MemberDefault with scala.Double = js.native
  /* 32 */ val Mute: Mute with scala.Double = js.native
  /* Ban | Kick | Talk | Invite */ val OfficerDefault: OfficerDefault with scala.Double = js.native
  /* ChangeAccess | Ban | SetMetadata | Mute | Kick | Talk | Invite | Close */ val OwnerDefault: OwnerDefault with scala.Double = js.native
  /* 64 */ val SetMetadata: SetMetadata with scala.Double = js.native
  /* 8 */ val Talk: Talk with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatPermission with scala.Double] = js.native
}

