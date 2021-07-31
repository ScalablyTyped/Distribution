package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientPersonaStateFlag extends StObject
@JSImport("steam-client", "EClientPersonaStateFlag")
@js.native
object EClientPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientPersonaStateFlag & Double] = js.native
  
  @js.native
  sealed trait ClanInfo
    extends StObject
       with EClientPersonaStateFlag
  /* 128 */ val ClanInfo: typings.steamClient.mod.EClientPersonaStateFlag.ClanInfo & Double = js.native
  
  @js.native
  sealed trait ClanTag
    extends StObject
       with EClientPersonaStateFlag
  /* 1024 */ val ClanTag: typings.steamClient.mod.EClientPersonaStateFlag.ClanTag & Double = js.native
  
  @js.native
  sealed trait Facebook
    extends StObject
       with EClientPersonaStateFlag
  /* 2048 */ val Facebook: typings.steamClient.mod.EClientPersonaStateFlag.Facebook & Double = js.native
  
  @js.native
  sealed trait GameDataBlob
    extends StObject
       with EClientPersonaStateFlag
  /* 512 */ val GameDataBlob: typings.steamClient.mod.EClientPersonaStateFlag.GameDataBlob & Double = js.native
  
  @js.native
  sealed trait GameExtraInfo
    extends StObject
       with EClientPersonaStateFlag
  /* 256 */ val GameExtraInfo: typings.steamClient.mod.EClientPersonaStateFlag.GameExtraInfo & Double = js.native
  
  // removed
  @js.native
  sealed trait LastSeen
    extends StObject
       with EClientPersonaStateFlag
  /* 64 */ val LastSeen: typings.steamClient.mod.EClientPersonaStateFlag.LastSeen & Double = js.native
  
  @js.native
  sealed trait Metadata
    extends StObject
       with EClientPersonaStateFlag
  /* 32 */ val Metadata: typings.steamClient.mod.EClientPersonaStateFlag.Metadata & Double = js.native
  
  @js.native
  sealed trait PlayerName
    extends StObject
       with EClientPersonaStateFlag
  /* 2 */ val PlayerName: typings.steamClient.mod.EClientPersonaStateFlag.PlayerName & Double = js.native
  
  @js.native
  sealed trait Presence
    extends StObject
       with EClientPersonaStateFlag
  /* 16 */ val Presence: typings.steamClient.mod.EClientPersonaStateFlag.Presence & Double = js.native
  
  @js.native
  sealed trait QueryPort
    extends StObject
       with EClientPersonaStateFlag
  /* 4 */ val QueryPort: typings.steamClient.mod.EClientPersonaStateFlag.QueryPort & Double = js.native
  
  @js.native
  sealed trait SourceID
    extends StObject
       with EClientPersonaStateFlag
  /* 8 */ val SourceID: typings.steamClient.mod.EClientPersonaStateFlag.SourceID & Double = js.native
  
  @js.native
  sealed trait Status
    extends StObject
       with EClientPersonaStateFlag
  /* 1 */ val Status: typings.steamClient.mod.EClientPersonaStateFlag.Status & Double = js.native
}
