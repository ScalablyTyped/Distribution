package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClanRelationship extends js.Object

@JSImport("steam-client", "EClanRelationship")
@js.native
object EClanRelationship extends js.Object {
  @js.native
  sealed trait Blocked
    extends steamDashClientLib.steamDashClientMod.EClanRelationship
  
  @js.native
  sealed trait Invited
    extends steamDashClientLib.steamDashClientMod.EClanRelationship
  
  @js.native
  sealed trait KickAcknowledged
    extends steamDashClientLib.steamDashClientMod.EClanRelationship
  
  @js.native
  sealed trait Kicked
    extends steamDashClientLib.steamDashClientMod.EClanRelationship
  
  @js.native
  sealed trait Member
    extends steamDashClientLib.steamDashClientMod.EClanRelationship
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.EClanRelationship
  
  /* 1 */ val Blocked: Blocked with scala.Double = js.native
  /* 2 */ val Invited: Invited with scala.Double = js.native
  /* 5 */ val KickAcknowledged: KickAcknowledged with scala.Double = js.native
  /* 4 */ val Kicked: Kicked with scala.Double = js.native
  /* 3 */ val Member: Member with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EClanRelationship with scala.Double] = js.native
}

