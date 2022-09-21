package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanRelationship extends StObject
@JSImport("steam-user", "EClanRelationship")
@js.native
object EClanRelationship extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRelationship & Double] = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EClanRelationship
  /* 1 */ val Blocked: typings.steamUser.mod.EClanRelationship.Blocked & Double = js.native
  
  @js.native
  sealed trait Invited
    extends StObject
       with EClanRelationship
  /* 2 */ val Invited: typings.steamUser.mod.EClanRelationship.Invited & Double = js.native
  
  @js.native
  sealed trait KickAcknowledged
    extends StObject
       with EClanRelationship
  /* 5 */ val KickAcknowledged: typings.steamUser.mod.EClanRelationship.KickAcknowledged & Double = js.native
  
  @js.native
  sealed trait Kicked
    extends StObject
       with EClanRelationship
  /* 4 */ val Kicked: typings.steamUser.mod.EClanRelationship.Kicked & Double = js.native
  
  @js.native
  sealed trait Member
    extends StObject
       with EClanRelationship
  /* 3 */ val Member: typings.steamUser.mod.EClanRelationship.Member & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EClanRelationship
  /* 0 */ val None: typings.steamUser.mod.EClanRelationship.None & Double = js.native
  
  @js.native
  sealed trait PendingApproval
    extends StObject
       with EClanRelationship
  /* 6 */ val PendingApproval: typings.steamUser.mod.EClanRelationship.PendingApproval & Double = js.native
  
  @js.native
  sealed trait RequestDenied
    extends StObject
       with EClanRelationship
  /* 7 */ val RequestDenied: typings.steamUser.mod.EClanRelationship.RequestDenied & Double = js.native
}
