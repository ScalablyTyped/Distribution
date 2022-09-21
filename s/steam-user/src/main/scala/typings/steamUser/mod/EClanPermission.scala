package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanPermission extends StObject
@JSImport("steam-user", "EClanPermission")
@js.native
object EClanPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanPermission & Double] = js.native
  
  @js.native
  sealed trait Member
    extends StObject
       with EClanPermission
  /* 4 */ val Member: typings.steamUser.mod.EClanPermission.Member & Double = js.native
  
  @js.native
  sealed trait Moderator
    extends StObject
       with EClanPermission
  /* 8 */ val Moderator: typings.steamUser.mod.EClanPermission.Moderator & Double = js.native
  
  @js.native
  sealed trait Nobody
    extends StObject
       with EClanPermission
  /* 0 */ val Nobody: typings.steamUser.mod.EClanPermission.Nobody & Double = js.native
  
  @js.native
  sealed trait NonMember
    extends StObject
       with EClanPermission
  /* 128 */ val NonMember: typings.steamUser.mod.EClanPermission.NonMember & Double = js.native
  
  @js.native
  sealed trait OGGGameOwner
    extends StObject
       with EClanPermission
  /* 16 */ val OGGGameOwner: typings.steamUser.mod.EClanPermission.OGGGameOwner & Double = js.native
  
  @js.native
  sealed trait Officer
    extends StObject
       with EClanPermission
  /* 2 */ val Officer: typings.steamUser.mod.EClanPermission.Officer & Double = js.native
  
  @js.native
  sealed trait Owner
    extends StObject
       with EClanPermission
  /* 1 */ val Owner: typings.steamUser.mod.EClanPermission.Owner & Double = js.native
  
  @js.native
  sealed trait OwnerAndOfficer
    extends StObject
       with EClanPermission
  /* 3 */ val OwnerAndOfficer: typings.steamUser.mod.EClanPermission.OwnerAndOfficer & Double = js.native
}
