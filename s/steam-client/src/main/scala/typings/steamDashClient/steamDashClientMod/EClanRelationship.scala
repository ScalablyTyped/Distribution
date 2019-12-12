package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EClanRelationship.Blocked
import typings.steamDashClient.steamDashClientMod.EClanRelationship.Invited
import typings.steamDashClient.steamDashClientMod.EClanRelationship.KickAcknowledged
import typings.steamDashClient.steamDashClientMod.EClanRelationship.Kicked
import typings.steamDashClient.steamDashClientMod.EClanRelationship.Member
import typings.steamDashClient.steamDashClientMod.EClanRelationship.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRelationship with Double] = js.native
  /* 1 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  /* 2 */ @js.native
  object Invited extends TopLevel[Invited with Double]
  
  /* 5 */ @js.native
  object KickAcknowledged extends TopLevel[KickAcknowledged with Double]
  
  /* 4 */ @js.native
  object Kicked extends TopLevel[Kicked with Double]
  
  /* 3 */ @js.native
  object Member extends TopLevel[Member with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

