package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatEntryType extends js.Object

@JSImport("steam-client", "EChatEntryType")
@js.native
object EChatEntryType extends js.Object {
  @js.native
  sealed trait ChatMsg
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait Disconnected
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
   // removed "No longer supported by clients"
  @js.native
  sealed trait Emote
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait Entered
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait HistoricalChat
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait Invalid
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait InviteGame
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait LeftConversation
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait LinkBlocked
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
   // removed "Listen for LobbyGameCreated_t callback instead"
  @js.native
  sealed trait LobbyGameStart
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait Reserved1
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait Reserved2
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait Typing
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait WasBanned
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  @js.native
  sealed trait WasKicked
    extends steamDashClientLib.steamDashClientMod.EChatEntryType
  
  /* 1 */ val ChatMsg: ChatMsg with scala.Double = js.native
  /* 10 */ val Disconnected: Disconnected with scala.Double = js.native
  /* 4 */ val Emote: Emote with scala.Double = js.native
  /* 7 */ val Entered: Entered with scala.Double = js.native
  /* 11 */ val HistoricalChat: HistoricalChat with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 3 */ val InviteGame: InviteGame with scala.Double = js.native
  /* 6 */ val LeftConversation: LeftConversation with scala.Double = js.native
  /* 14 */ val LinkBlocked: LinkBlocked with scala.Double = js.native
  /* 5 */ val LobbyGameStart: LobbyGameStart with scala.Double = js.native
  /* 12 */ val Reserved1: Reserved1 with scala.Double = js.native
  /* 13 */ val Reserved2: Reserved2 with scala.Double = js.native
  /* 2 */ val Typing: Typing with scala.Double = js.native
  /* 9 */ val WasBanned: WasBanned with scala.Double = js.native
  /* 8 */ val WasKicked: WasKicked with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatEntryType with scala.Double] = js.native
}

