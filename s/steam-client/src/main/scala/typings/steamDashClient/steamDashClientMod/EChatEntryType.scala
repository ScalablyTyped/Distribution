package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EChatEntryType.ChatMsg
import typings.steamDashClient.steamDashClientMod.EChatEntryType.Disconnected
import typings.steamDashClient.steamDashClientMod.EChatEntryType.Emote
import typings.steamDashClient.steamDashClientMod.EChatEntryType.Entered
import typings.steamDashClient.steamDashClientMod.EChatEntryType.HistoricalChat
import typings.steamDashClient.steamDashClientMod.EChatEntryType.Invalid
import typings.steamDashClient.steamDashClientMod.EChatEntryType.InviteGame
import typings.steamDashClient.steamDashClientMod.EChatEntryType.LeftConversation
import typings.steamDashClient.steamDashClientMod.EChatEntryType.LinkBlocked
import typings.steamDashClient.steamDashClientMod.EChatEntryType.LobbyGameStart
import typings.steamDashClient.steamDashClientMod.EChatEntryType.Reserved1
import typings.steamDashClient.steamDashClientMod.EChatEntryType.Reserved2
import typings.steamDashClient.steamDashClientMod.EChatEntryType.Typing
import typings.steamDashClient.steamDashClientMod.EChatEntryType.WasBanned
import typings.steamDashClient.steamDashClientMod.EChatEntryType.WasKicked
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatEntryType with Double] = js.native
  /* 1 */ @js.native
  object ChatMsg extends TopLevel[ChatMsg with Double]
  
  /* 10 */ @js.native
  object Disconnected extends TopLevel[Disconnected with Double]
  
  /* 4 */ @js.native
  object Emote extends TopLevel[Emote with Double]
  
  /* 7 */ @js.native
  object Entered extends TopLevel[Entered with Double]
  
  /* 11 */ @js.native
  object HistoricalChat extends TopLevel[HistoricalChat with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 3 */ @js.native
  object InviteGame extends TopLevel[InviteGame with Double]
  
  /* 6 */ @js.native
  object LeftConversation extends TopLevel[LeftConversation with Double]
  
  /* 14 */ @js.native
  object LinkBlocked extends TopLevel[LinkBlocked with Double]
  
  /* 5 */ @js.native
  object LobbyGameStart extends TopLevel[LobbyGameStart with Double]
  
  /* 12 */ @js.native
  object Reserved1 extends TopLevel[Reserved1 with Double]
  
  /* 13 */ @js.native
  object Reserved2 extends TopLevel[Reserved2 with Double]
  
  /* 2 */ @js.native
  object Typing extends TopLevel[Typing with Double]
  
  /* 9 */ @js.native
  object WasBanned extends TopLevel[WasBanned with Double]
  
  /* 8 */ @js.native
  object WasKicked extends TopLevel[WasKicked with Double]
  
}

