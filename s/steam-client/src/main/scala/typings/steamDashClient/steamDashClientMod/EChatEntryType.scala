package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatEntryType extends js.Object

@JSImport("steam-client", "EChatEntryType")
@js.native
object EChatEntryType extends js.Object {
  @js.native
  sealed trait ChatMsg extends EChatEntryType
  
  @js.native
  sealed trait Disconnected extends EChatEntryType
  
   // removed "No longer supported by clients"
  @js.native
  sealed trait Emote extends EChatEntryType
  
  @js.native
  sealed trait Entered extends EChatEntryType
  
  @js.native
  sealed trait HistoricalChat extends EChatEntryType
  
  @js.native
  sealed trait Invalid extends EChatEntryType
  
  @js.native
  sealed trait InviteGame extends EChatEntryType
  
  @js.native
  sealed trait LeftConversation extends EChatEntryType
  
  @js.native
  sealed trait LinkBlocked extends EChatEntryType
  
   // removed "Listen for LobbyGameCreated_t callback instead"
  @js.native
  sealed trait LobbyGameStart extends EChatEntryType
  
  @js.native
  sealed trait Reserved1 extends EChatEntryType
  
  @js.native
  sealed trait Reserved2 extends EChatEntryType
  
  @js.native
  sealed trait Typing extends EChatEntryType
  
  @js.native
  sealed trait WasBanned extends EChatEntryType
  
  @js.native
  sealed trait WasKicked extends EChatEntryType
  
  /* 1 */ val ChatMsg: typings.steamDashClient.steamDashClientMod.EChatEntryType.ChatMsg with Double = js.native
  /* 10 */ val Disconnected: typings.steamDashClient.steamDashClientMod.EChatEntryType.Disconnected with Double = js.native
  /* 4 */ val Emote: typings.steamDashClient.steamDashClientMod.EChatEntryType.Emote with Double = js.native
  /* 7 */ val Entered: typings.steamDashClient.steamDashClientMod.EChatEntryType.Entered with Double = js.native
  /* 11 */ val HistoricalChat: typings.steamDashClient.steamDashClientMod.EChatEntryType.HistoricalChat with Double = js.native
  /* 0 */ val Invalid: typings.steamDashClient.steamDashClientMod.EChatEntryType.Invalid with Double = js.native
  /* 3 */ val InviteGame: typings.steamDashClient.steamDashClientMod.EChatEntryType.InviteGame with Double = js.native
  /* 6 */ val LeftConversation: typings.steamDashClient.steamDashClientMod.EChatEntryType.LeftConversation with Double = js.native
  /* 14 */ val LinkBlocked: typings.steamDashClient.steamDashClientMod.EChatEntryType.LinkBlocked with Double = js.native
  /* 5 */ val LobbyGameStart: typings.steamDashClient.steamDashClientMod.EChatEntryType.LobbyGameStart with Double = js.native
  /* 12 */ val Reserved1: typings.steamDashClient.steamDashClientMod.EChatEntryType.Reserved1 with Double = js.native
  /* 13 */ val Reserved2: typings.steamDashClient.steamDashClientMod.EChatEntryType.Reserved2 with Double = js.native
  /* 2 */ val Typing: typings.steamDashClient.steamDashClientMod.EChatEntryType.Typing with Double = js.native
  /* 9 */ val WasBanned: typings.steamDashClient.steamDashClientMod.EChatEntryType.WasBanned with Double = js.native
  /* 8 */ val WasKicked: typings.steamDashClient.steamDashClientMod.EChatEntryType.WasKicked with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatEntryType with Double] = js.native
}

