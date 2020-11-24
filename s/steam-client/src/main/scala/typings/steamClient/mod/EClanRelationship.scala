package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanRelationship extends js.Object
@JSImport("steam-client", "EClanRelationship")
@js.native
object EClanRelationship extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRelationship with Double] = js.native
  
  @js.native
  sealed trait Blocked extends EClanRelationship
  /* 1 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  @js.native
  sealed trait Invited extends EClanRelationship
  /* 2 */ @js.native
  object Invited extends TopLevel[Invited with Double]
  
  @js.native
  sealed trait KickAcknowledged extends EClanRelationship
  /* 5 */ @js.native
  object KickAcknowledged extends TopLevel[KickAcknowledged with Double]
  
  @js.native
  sealed trait Kicked extends EClanRelationship
  /* 4 */ @js.native
  object Kicked extends TopLevel[Kicked with Double]
  
  @js.native
  sealed trait Member extends EClanRelationship
  /* 3 */ @js.native
  object Member extends TopLevel[Member with Double]
  
  @js.native
  sealed trait None extends EClanRelationship
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
