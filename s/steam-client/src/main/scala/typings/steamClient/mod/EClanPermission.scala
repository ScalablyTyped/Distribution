package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait AllMembers extends EClanPermission
  
   // 143
  @js.native
  sealed trait Anybody extends EClanPermission
  
  @js.native
  sealed trait Member extends EClanPermission
  
   // 132
  @js.native
  sealed trait MemberAllowed extends EClanPermission
  
  @js.native
  sealed trait Moderator extends EClanPermission
  
   // 140
  @js.native
  sealed trait ModeratorAllowed extends EClanPermission
  
  @js.native
  sealed trait Nobody extends EClanPermission
  
  @js.native
  sealed trait NonMember extends EClanPermission
  
  @js.native
  sealed trait OGGGameOwner extends EClanPermission
  
  @js.native
  sealed trait Officer extends EClanPermission
  
   // 142
  @js.native
  sealed trait OfficerAllowed extends EClanPermission
  
  @js.native
  sealed trait Owner extends EClanPermission
  
   // 143
  @js.native
  sealed trait OwnerAllowed extends EClanPermission
  
  @js.native
  sealed trait OwnerAndOfficer extends EClanPermission
  
   // 11
  @js.native
  sealed trait OwnerOfficerModerator extends EClanPermission
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanPermission with Double] = js.native
  /* 1 | 2 | 8 | 4 */ @js.native
  object AllMembers extends TopLevel[AllMembers with Double]
  
  /* 128 | 4 | 8 | 2 | 1 */ @js.native
  object Anybody extends TopLevel[Anybody with Double]
  
  /* 4 */ @js.native
  object Member extends TopLevel[Member with Double]
  
  /* 128 | 4 */ @js.native
  object MemberAllowed extends TopLevel[MemberAllowed with Double]
  
  /* 8 */ @js.native
  object Moderator extends TopLevel[Moderator with Double]
  
  /* 128 | 4 | 8 */ @js.native
  object ModeratorAllowed extends TopLevel[ModeratorAllowed with Double]
  
  /* 0 */ @js.native
  object Nobody extends TopLevel[Nobody with Double]
  
  /* 128 */ @js.native
  object NonMember extends TopLevel[NonMember with Double]
  
  /* 16 */ @js.native
  object OGGGameOwner extends TopLevel[OGGGameOwner with Double]
  
  /* 2 */ @js.native
  object Officer extends TopLevel[Officer with Double]
  
  /* 128 | 4 | 8 | 2 */ @js.native
  object OfficerAllowed extends TopLevel[OfficerAllowed with Double]
  
  /* 1 */ @js.native
  object Owner extends TopLevel[Owner with Double]
  
  /* 128 | 4 | 8 | 2 | 1 */ @js.native
  object OwnerAllowed extends TopLevel[OwnerAllowed with Double]
  
  /* 3 */ @js.native
  object OwnerAndOfficer extends TopLevel[OwnerAndOfficer with Double]
  
  /* 1 | 2 | 8 */ @js.native
  object OwnerOfficerModerator extends TopLevel[OwnerOfficerModerator with Double]
  
}

