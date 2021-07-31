package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanPermission extends StObject
@JSImport("steam-client", "EClanPermission")
@js.native
object EClanPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanPermission & Double] = js.native
  
  // 11
  @js.native
  sealed trait AllMembers
    extends StObject
       with EClanPermission
  /* 1 | 2 | 8 | 4 */ val AllMembers: typings.steamClient.mod.EClanPermission.AllMembers & Double = js.native
  
  // 143
  @js.native
  sealed trait Anybody
    extends StObject
       with EClanPermission
  /* 128 | 4 | 8 | 2 | 1 */ val Anybody: typings.steamClient.mod.EClanPermission.Anybody & Double = js.native
  
  @js.native
  sealed trait Member
    extends StObject
       with EClanPermission
  /* 4 */ val Member: typings.steamClient.mod.EClanPermission.Member & Double = js.native
  
  @js.native
  sealed trait MemberAllowed
    extends StObject
       with EClanPermission
  /* 128 | 4 */ val MemberAllowed: typings.steamClient.mod.EClanPermission.MemberAllowed & Double = js.native
  
  @js.native
  sealed trait Moderator
    extends StObject
       with EClanPermission
  /* 8 */ val Moderator: typings.steamClient.mod.EClanPermission.Moderator & Double = js.native
  
  // 132
  @js.native
  sealed trait ModeratorAllowed
    extends StObject
       with EClanPermission
  /* 128 | 4 | 8 */ val ModeratorAllowed: typings.steamClient.mod.EClanPermission.ModeratorAllowed & Double = js.native
  
  @js.native
  sealed trait Nobody
    extends StObject
       with EClanPermission
  /* 0 */ val Nobody: typings.steamClient.mod.EClanPermission.Nobody & Double = js.native
  
  @js.native
  sealed trait NonMember
    extends StObject
       with EClanPermission
  /* 128 */ val NonMember: typings.steamClient.mod.EClanPermission.NonMember & Double = js.native
  
  // 15
  @js.native
  sealed trait OGGGameOwner
    extends StObject
       with EClanPermission
  /* 16 */ val OGGGameOwner: typings.steamClient.mod.EClanPermission.OGGGameOwner & Double = js.native
  
  @js.native
  sealed trait Officer
    extends StObject
       with EClanPermission
  /* 2 */ val Officer: typings.steamClient.mod.EClanPermission.Officer & Double = js.native
  
  // 140
  @js.native
  sealed trait OfficerAllowed
    extends StObject
       with EClanPermission
  /* 128 | 4 | 8 | 2 */ val OfficerAllowed: typings.steamClient.mod.EClanPermission.OfficerAllowed & Double = js.native
  
  @js.native
  sealed trait Owner
    extends StObject
       with EClanPermission
  /* 1 */ val Owner: typings.steamClient.mod.EClanPermission.Owner & Double = js.native
  
  // 142
  @js.native
  sealed trait OwnerAllowed
    extends StObject
       with EClanPermission
  /* 128 | 4 | 8 | 2 | 1 */ val OwnerAllowed: typings.steamClient.mod.EClanPermission.OwnerAllowed & Double = js.native
  
  @js.native
  sealed trait OwnerAndOfficer
    extends StObject
       with EClanPermission
  /* 3 */ val OwnerAndOfficer: typings.steamClient.mod.EClanPermission.OwnerAndOfficer & Double = js.native
  
  @js.native
  sealed trait OwnerOfficerModerator
    extends StObject
       with EClanPermission
  /* 1 | 2 | 8 */ val OwnerOfficerModerator: typings.steamClient.mod.EClanPermission.OwnerOfficerModerator & Double = js.native
}
