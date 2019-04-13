package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClanPermission extends js.Object

@JSImport("steam-client", "EClanPermission")
@js.native
object EClanPermission extends js.Object {
   // 15
  @js.native
  sealed trait AllMembers
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
   // 143
  @js.native
  sealed trait Anybody
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  @js.native
  sealed trait Member
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
   // 132
  @js.native
  sealed trait MemberAllowed
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  @js.native
  sealed trait Moderator
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
   // 140
  @js.native
  sealed trait ModeratorAllowed
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  @js.native
  sealed trait Nobody
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  @js.native
  sealed trait NonMember
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  @js.native
  sealed trait OGGGameOwner
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  @js.native
  sealed trait Officer
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
   // 142
  @js.native
  sealed trait OfficerAllowed
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  @js.native
  sealed trait Owner
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
   // 143
  @js.native
  sealed trait OwnerAllowed
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  @js.native
  sealed trait OwnerAndOfficer
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
   // 11
  @js.native
  sealed trait OwnerOfficerModerator
    extends steamDashClientLib.steamDashClientMod.EClanPermission
  
  /* Owner | Officer | Moderator | Member */ val AllMembers: AllMembers with scala.Double = js.native
  /* NonMember | Member | Moderator | Officer | Owner */ val Anybody: Anybody with scala.Double = js.native
  /* 4 */ val Member: Member with scala.Double = js.native
  /* NonMember | Member */ val MemberAllowed: MemberAllowed with scala.Double = js.native
  /* 8 */ val Moderator: Moderator with scala.Double = js.native
  /* NonMember | Member | Moderator */ val ModeratorAllowed: ModeratorAllowed with scala.Double = js.native
  /* 0 */ val Nobody: Nobody with scala.Double = js.native
  /* 128 */ val NonMember: NonMember with scala.Double = js.native
  /* 16 */ val OGGGameOwner: OGGGameOwner with scala.Double = js.native
  /* 2 */ val Officer: Officer with scala.Double = js.native
  /* NonMember | Member | Moderator | Officer */ val OfficerAllowed: OfficerAllowed with scala.Double = js.native
  /* 1 */ val Owner: Owner with scala.Double = js.native
  /* NonMember | Member | Moderator | Officer | Owner */ val OwnerAllowed: OwnerAllowed with scala.Double = js.native
  /* 3 */ val OwnerAndOfficer: OwnerAndOfficer with scala.Double = js.native
  /* Owner | Officer | Moderator */ val OwnerOfficerModerator: OwnerOfficerModerator with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EClanPermission with scala.Double] = js.native
}

