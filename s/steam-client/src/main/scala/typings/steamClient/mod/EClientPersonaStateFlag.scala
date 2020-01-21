package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClientPersonaStateFlag extends js.Object

@JSImport("steam-client", "EClientPersonaStateFlag")
@js.native
object EClientPersonaStateFlag extends js.Object {
  @js.native
  sealed trait ClanInfo extends EClientPersonaStateFlag
  
  @js.native
  sealed trait ClanTag extends EClientPersonaStateFlag
  
  @js.native
  sealed trait Facebook extends EClientPersonaStateFlag
  
  @js.native
  sealed trait GameDataBlob extends EClientPersonaStateFlag
  
  @js.native
  sealed trait GameExtraInfo extends EClientPersonaStateFlag
  
  @js.native
  sealed trait LastSeen extends EClientPersonaStateFlag
  
   // removed
  @js.native
  sealed trait Metadata extends EClientPersonaStateFlag
  
  @js.native
  sealed trait PlayerName extends EClientPersonaStateFlag
  
  @js.native
  sealed trait Presence extends EClientPersonaStateFlag
  
  @js.native
  sealed trait QueryPort extends EClientPersonaStateFlag
  
  @js.native
  sealed trait SourceID extends EClientPersonaStateFlag
  
  @js.native
  sealed trait Status extends EClientPersonaStateFlag
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientPersonaStateFlag with Double] = js.native
  /* 128 */ @js.native
  object ClanInfo extends TopLevel[ClanInfo with Double]
  
  /* 1024 */ @js.native
  object ClanTag extends TopLevel[ClanTag with Double]
  
  /* 2048 */ @js.native
  object Facebook extends TopLevel[Facebook with Double]
  
  /* 512 */ @js.native
  object GameDataBlob extends TopLevel[GameDataBlob with Double]
  
  /* 256 */ @js.native
  object GameExtraInfo extends TopLevel[GameExtraInfo with Double]
  
  /* 64 */ @js.native
  object LastSeen extends TopLevel[LastSeen with Double]
  
  /* 32 */ @js.native
  object Metadata extends TopLevel[Metadata with Double]
  
  /* 2 */ @js.native
  object PlayerName extends TopLevel[PlayerName with Double]
  
  /* 16 */ @js.native
  object Presence extends TopLevel[Presence with Double]
  
  /* 4 */ @js.native
  object QueryPort extends TopLevel[QueryPort with Double]
  
  /* 8 */ @js.native
  object SourceID extends TopLevel[SourceID with Double]
  
  /* 1 */ @js.native
  object Status extends TopLevel[Status with Double]
  
}

