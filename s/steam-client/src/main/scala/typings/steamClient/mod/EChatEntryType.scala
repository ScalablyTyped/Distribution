package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatEntryType extends StObject
@JSImport("steam-client", "EChatEntryType")
@js.native
object EChatEntryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatEntryType with Double] = js.native
  
  @js.native
  sealed trait ChatMsg extends EChatEntryType
  /* 1 */ val ChatMsg: typings.steamClient.mod.EChatEntryType.ChatMsg with Double = js.native
  
  @js.native
  sealed trait Disconnected extends EChatEntryType
  /* 10 */ val Disconnected: typings.steamClient.mod.EChatEntryType.Disconnected with Double = js.native
  
  @js.native
  sealed trait Emote extends EChatEntryType
  /* 4 */ val Emote: typings.steamClient.mod.EChatEntryType.Emote with Double = js.native
  
  @js.native
  sealed trait Entered extends EChatEntryType
  /* 7 */ val Entered: typings.steamClient.mod.EChatEntryType.Entered with Double = js.native
  
  @js.native
  sealed trait HistoricalChat extends EChatEntryType
  /* 11 */ val HistoricalChat: typings.steamClient.mod.EChatEntryType.HistoricalChat with Double = js.native
  
  @js.native
  sealed trait Invalid extends EChatEntryType
  /* 0 */ val Invalid: typings.steamClient.mod.EChatEntryType.Invalid with Double = js.native
  
  @js.native
  sealed trait InviteGame extends EChatEntryType
  /* 3 */ val InviteGame: typings.steamClient.mod.EChatEntryType.InviteGame with Double = js.native
  
  // removed "Listen for LobbyGameCreated_t callback instead"
  @js.native
  sealed trait LeftConversation extends EChatEntryType
  /* 6 */ val LeftConversation: typings.steamClient.mod.EChatEntryType.LeftConversation with Double = js.native
  
  @js.native
  sealed trait LinkBlocked extends EChatEntryType
  /* 14 */ val LinkBlocked: typings.steamClient.mod.EChatEntryType.LinkBlocked with Double = js.native
  
  // removed "No longer supported by clients"
  @js.native
  sealed trait LobbyGameStart extends EChatEntryType
  /* 5 */ val LobbyGameStart: typings.steamClient.mod.EChatEntryType.LobbyGameStart with Double = js.native
  
  @js.native
  sealed trait Reserved1 extends EChatEntryType
  /* 12 */ val Reserved1: typings.steamClient.mod.EChatEntryType.Reserved1 with Double = js.native
  
  @js.native
  sealed trait Reserved2 extends EChatEntryType
  /* 13 */ val Reserved2: typings.steamClient.mod.EChatEntryType.Reserved2 with Double = js.native
  
  @js.native
  sealed trait Typing extends EChatEntryType
  /* 2 */ val Typing: typings.steamClient.mod.EChatEntryType.Typing with Double = js.native
  
  @js.native
  sealed trait WasBanned extends EChatEntryType
  /* 9 */ val WasBanned: typings.steamClient.mod.EChatEntryType.WasBanned with Double = js.native
  
  @js.native
  sealed trait WasKicked extends EChatEntryType
  /* 8 */ val WasKicked: typings.steamClient.mod.EChatEntryType.WasKicked with Double = js.native
}
