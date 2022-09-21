package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatEntryType extends StObject
@JSImport("steam-user", "EChatEntryType")
@js.native
object EChatEntryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatEntryType & Double] = js.native
  
  @js.native
  sealed trait ChatMsg
    extends StObject
       with EChatEntryType
  /* 1 */ val ChatMsg: typings.steamUser.mod.EChatEntryType.ChatMsg & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with EChatEntryType
  /* 10 */ val Disconnected: typings.steamUser.mod.EChatEntryType.Disconnected & Double = js.native
  
  @js.native
  sealed trait Emote
    extends StObject
       with EChatEntryType
  /* 4 */ val Emote: typings.steamUser.mod.EChatEntryType.Emote & Double = js.native
  
  @js.native
  sealed trait Entered
    extends StObject
       with EChatEntryType
  /* 7 */ val Entered: typings.steamUser.mod.EChatEntryType.Entered & Double = js.native
  
  @js.native
  sealed trait HistoricalChat
    extends StObject
       with EChatEntryType
  /* 11 */ val HistoricalChat: typings.steamUser.mod.EChatEntryType.HistoricalChat & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EChatEntryType
  /* 0 */ val Invalid: typings.steamUser.mod.EChatEntryType.Invalid & Double = js.native
  
  @js.native
  sealed trait InviteGame
    extends StObject
       with EChatEntryType
  /* 3 */ val InviteGame: typings.steamUser.mod.EChatEntryType.InviteGame & Double = js.native
  
  @js.native
  sealed trait LeftConversation
    extends StObject
       with EChatEntryType
  /* 6 */ val LeftConversation: typings.steamUser.mod.EChatEntryType.LeftConversation & Double = js.native
  
  @js.native
  sealed trait LinkBlocked
    extends StObject
       with EChatEntryType
  /* 14 */ val LinkBlocked: typings.steamUser.mod.EChatEntryType.LinkBlocked & Double = js.native
  
  @js.native
  sealed trait LobbyGameStart
    extends StObject
       with EChatEntryType
  /* 5 */ val LobbyGameStart: typings.steamUser.mod.EChatEntryType.LobbyGameStart & Double = js.native
  
  @js.native
  sealed trait Reserved1
    extends StObject
       with EChatEntryType
  /* 12 */ val Reserved1: typings.steamUser.mod.EChatEntryType.Reserved1 & Double = js.native
  
  @js.native
  sealed trait Reserved2
    extends StObject
       with EChatEntryType
  /* 13 */ val Reserved2: typings.steamUser.mod.EChatEntryType.Reserved2 & Double = js.native
  
  @js.native
  sealed trait Typing
    extends StObject
       with EChatEntryType
  /* 2 */ val Typing: typings.steamUser.mod.EChatEntryType.Typing & Double = js.native
  
  @js.native
  sealed trait WasBanned
    extends StObject
       with EChatEntryType
  /* 9 */ val WasBanned: typings.steamUser.mod.EChatEntryType.WasBanned & Double = js.native
  
  @js.native
  sealed trait WasKicked
    extends StObject
       with EChatEntryType
  /* 8 */ val WasKicked: typings.steamUser.mod.EChatEntryType.WasKicked & Double = js.native
}
