package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientPersonaStateFlag extends js.Object
@JSImport("steam-client", "EClientPersonaStateFlag")
@js.native
object EClientPersonaStateFlag extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientPersonaStateFlag with Double] = js.native
  
  @js.native
  sealed trait ClanInfo extends EClientPersonaStateFlag
  /* 128 */ @js.native
  object ClanInfo extends TopLevel[ClanInfo with Double]
  
  @js.native
  sealed trait ClanTag extends EClientPersonaStateFlag
  /* 1024 */ @js.native
  object ClanTag extends TopLevel[ClanTag with Double]
  
  @js.native
  sealed trait Facebook extends EClientPersonaStateFlag
  /* 2048 */ @js.native
  object Facebook extends TopLevel[Facebook with Double]
  
  @js.native
  sealed trait GameDataBlob extends EClientPersonaStateFlag
  /* 512 */ @js.native
  object GameDataBlob extends TopLevel[GameDataBlob with Double]
  
  @js.native
  sealed trait GameExtraInfo extends EClientPersonaStateFlag
  /* 256 */ @js.native
  object GameExtraInfo extends TopLevel[GameExtraInfo with Double]
  
  @js.native
  sealed trait LastSeen extends EClientPersonaStateFlag
  /* 64 */ @js.native
  object LastSeen extends TopLevel[LastSeen with Double]
  
   // removed
  @js.native
  sealed trait Metadata extends EClientPersonaStateFlag
  /* 32 */ @js.native
  object Metadata extends TopLevel[Metadata with Double]
  
  @js.native
  sealed trait PlayerName extends EClientPersonaStateFlag
  /* 2 */ @js.native
  object PlayerName extends TopLevel[PlayerName with Double]
  
  @js.native
  sealed trait Presence extends EClientPersonaStateFlag
  /* 16 */ @js.native
  object Presence extends TopLevel[Presence with Double]
  
  @js.native
  sealed trait QueryPort extends EClientPersonaStateFlag
  /* 4 */ @js.native
  object QueryPort extends TopLevel[QueryPort with Double]
  
  @js.native
  sealed trait SourceID extends EClientPersonaStateFlag
  /* 8 */ @js.native
  object SourceID extends TopLevel[SourceID with Double]
  
  @js.native
  sealed trait Status extends EClientPersonaStateFlag
  /* 1 */ @js.native
  object Status extends TopLevel[Status with Double]
}
