package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanRelationship extends StObject
@JSImport("steam-client", "EClanRelationship")
@js.native
object EClanRelationship extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRelationship with Double] = js.native
  
  @js.native
  sealed trait Blocked extends EClanRelationship
  /* 1 */ val Blocked: typings.steamClient.mod.EClanRelationship.Blocked with Double = js.native
  
  @js.native
  sealed trait Invited extends EClanRelationship
  /* 2 */ val Invited: typings.steamClient.mod.EClanRelationship.Invited with Double = js.native
  
  @js.native
  sealed trait KickAcknowledged extends EClanRelationship
  /* 5 */ val KickAcknowledged: typings.steamClient.mod.EClanRelationship.KickAcknowledged with Double = js.native
  
  @js.native
  sealed trait Kicked extends EClanRelationship
  /* 4 */ val Kicked: typings.steamClient.mod.EClanRelationship.Kicked with Double = js.native
  
  @js.native
  sealed trait Member extends EClanRelationship
  /* 3 */ val Member: typings.steamClient.mod.EClanRelationship.Member with Double = js.native
  
  @js.native
  sealed trait None extends EClanRelationship
  /* 0 */ val None: typings.steamClient.mod.EClanRelationship.None with Double = js.native
}
