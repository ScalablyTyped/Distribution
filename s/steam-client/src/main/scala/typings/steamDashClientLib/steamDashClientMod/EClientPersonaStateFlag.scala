package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClientPersonaStateFlag extends js.Object

@JSImport("steam-client", "EClientPersonaStateFlag")
@js.native
object EClientPersonaStateFlag extends js.Object {
  @js.native
  sealed trait ClanInfo
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait ClanTag
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait Facebook
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait GameDataBlob
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait GameExtraInfo
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait LastSeen
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
   // removed
  @js.native
  sealed trait Metadata
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait PlayerName
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait Presence
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait QueryPort
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait SourceID
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  @js.native
  sealed trait Status
    extends steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag
  
  /* 128 */ val ClanInfo: ClanInfo with scala.Double = js.native
  /* 1024 */ val ClanTag: ClanTag with scala.Double = js.native
  /* 2048 */ val Facebook: Facebook with scala.Double = js.native
  /* 512 */ val GameDataBlob: GameDataBlob with scala.Double = js.native
  /* 256 */ val GameExtraInfo: GameExtraInfo with scala.Double = js.native
  /* 64 */ val LastSeen: LastSeen with scala.Double = js.native
  /* 32 */ val Metadata: Metadata with scala.Double = js.native
  /* 2 */ val PlayerName: PlayerName with scala.Double = js.native
  /* 16 */ val Presence: Presence with scala.Double = js.native
  /* 4 */ val QueryPort: QueryPort with scala.Double = js.native
  /* 8 */ val SourceID: SourceID with scala.Double = js.native
  /* 1 */ val Status: Status with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EClientPersonaStateFlag with scala.Double] = js.native
}

