package typings.steamDashClient.steamDashClientMod

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
  
  /* 128 */ val ClanInfo: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.ClanInfo with Double = js.native
  /* 1024 */ val ClanTag: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.ClanTag with Double = js.native
  /* 2048 */ val Facebook: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.Facebook with Double = js.native
  /* 512 */ val GameDataBlob: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.GameDataBlob with Double = js.native
  /* 256 */ val GameExtraInfo: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.GameExtraInfo with Double = js.native
  /* 64 */ val LastSeen: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.LastSeen with Double = js.native
  /* 32 */ val Metadata: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.Metadata with Double = js.native
  /* 2 */ val PlayerName: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.PlayerName with Double = js.native
  /* 16 */ val Presence: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.Presence with Double = js.native
  /* 4 */ val QueryPort: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.QueryPort with Double = js.native
  /* 8 */ val SourceID: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.SourceID with Double = js.native
  /* 1 */ val Status: typings.steamDashClient.steamDashClientMod.EClientPersonaStateFlag.Status with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientPersonaStateFlag with Double] = js.native
}

