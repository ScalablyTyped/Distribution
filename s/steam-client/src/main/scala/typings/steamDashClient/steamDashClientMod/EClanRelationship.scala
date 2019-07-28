package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClanRelationship extends js.Object

@JSImport("steam-client", "EClanRelationship")
@js.native
object EClanRelationship extends js.Object {
  @js.native
  sealed trait Blocked extends EClanRelationship
  
  @js.native
  sealed trait Invited extends EClanRelationship
  
  @js.native
  sealed trait KickAcknowledged extends EClanRelationship
  
  @js.native
  sealed trait Kicked extends EClanRelationship
  
  @js.native
  sealed trait Member extends EClanRelationship
  
  @js.native
  sealed trait None extends EClanRelationship
  
  /* 1 */ val Blocked: typings.steamDashClient.steamDashClientMod.EClanRelationship.Blocked with Double = js.native
  /* 2 */ val Invited: typings.steamDashClient.steamDashClientMod.EClanRelationship.Invited with Double = js.native
  /* 5 */ val KickAcknowledged: typings.steamDashClient.steamDashClientMod.EClanRelationship.KickAcknowledged with Double = js.native
  /* 4 */ val Kicked: typings.steamDashClient.steamDashClientMod.EClanRelationship.Kicked with Double = js.native
  /* 3 */ val Member: typings.steamDashClient.steamDashClientMod.EClanRelationship.Member with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.EClanRelationship.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRelationship with Double] = js.native
}

