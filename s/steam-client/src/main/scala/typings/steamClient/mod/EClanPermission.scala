package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanPermission extends StObject
@JSImport("steam-client", "EClanPermission")
@js.native
object EClanPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanPermission with Double] = js.native
  
  // 11
  @js.native
  sealed trait AllMembers extends EClanPermission
  /* 1 | 2 | 8 | 4 */ val AllMembers: typings.steamClient.mod.EClanPermission.AllMembers with Double = js.native
  
  // 143
  @js.native
  sealed trait Anybody extends EClanPermission
  /* 128 | 4 | 8 | 2 | 1 */ val Anybody: typings.steamClient.mod.EClanPermission.Anybody with Double = js.native
  
  @js.native
  sealed trait Member extends EClanPermission
  /* 4 */ val Member: typings.steamClient.mod.EClanPermission.Member with Double = js.native
  
  @js.native
  sealed trait MemberAllowed extends EClanPermission
  /* 128 | 4 */ val MemberAllowed: typings.steamClient.mod.EClanPermission.MemberAllowed with Double = js.native
  
  @js.native
  sealed trait Moderator extends EClanPermission
  /* 8 */ val Moderator: typings.steamClient.mod.EClanPermission.Moderator with Double = js.native
  
  // 132
  @js.native
  sealed trait ModeratorAllowed extends EClanPermission
  /* 128 | 4 | 8 */ val ModeratorAllowed: typings.steamClient.mod.EClanPermission.ModeratorAllowed with Double = js.native
  
  @js.native
  sealed trait Nobody extends EClanPermission
  /* 0 */ val Nobody: typings.steamClient.mod.EClanPermission.Nobody with Double = js.native
  
  @js.native
  sealed trait NonMember extends EClanPermission
  /* 128 */ val NonMember: typings.steamClient.mod.EClanPermission.NonMember with Double = js.native
  
  // 15
  @js.native
  sealed trait OGGGameOwner extends EClanPermission
  /* 16 */ val OGGGameOwner: typings.steamClient.mod.EClanPermission.OGGGameOwner with Double = js.native
  
  @js.native
  sealed trait Officer extends EClanPermission
  /* 2 */ val Officer: typings.steamClient.mod.EClanPermission.Officer with Double = js.native
  
  // 140
  @js.native
  sealed trait OfficerAllowed extends EClanPermission
  /* 128 | 4 | 8 | 2 */ val OfficerAllowed: typings.steamClient.mod.EClanPermission.OfficerAllowed with Double = js.native
  
  @js.native
  sealed trait Owner extends EClanPermission
  /* 1 */ val Owner: typings.steamClient.mod.EClanPermission.Owner with Double = js.native
  
  // 142
  @js.native
  sealed trait OwnerAllowed extends EClanPermission
  /* 128 | 4 | 8 | 2 | 1 */ val OwnerAllowed: typings.steamClient.mod.EClanPermission.OwnerAllowed with Double = js.native
  
  @js.native
  sealed trait OwnerAndOfficer extends EClanPermission
  /* 3 */ val OwnerAndOfficer: typings.steamClient.mod.EClanPermission.OwnerAndOfficer with Double = js.native
  
  @js.native
  sealed trait OwnerOfficerModerator extends EClanPermission
  /* 1 | 2 | 8 */ val OwnerOfficerModerator: typings.steamClient.mod.EClanPermission.OwnerOfficerModerator with Double = js.native
}
