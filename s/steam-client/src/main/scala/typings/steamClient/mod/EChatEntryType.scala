package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatEntryType extends js.Object
@JSImport("steam-client", "EChatEntryType")
@js.native
object EChatEntryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatEntryType with Double] = js.native
  
  @js.native
  sealed trait ChatMsg extends EChatEntryType
  /* 1 */ @js.native
  object ChatMsg extends TopLevel[ChatMsg with Double]
  
  @js.native
  sealed trait Disconnected extends EChatEntryType
  /* 10 */ @js.native
  object Disconnected extends TopLevel[Disconnected with Double]
  
   // removed "No longer supported by clients"
  @js.native
  sealed trait Emote extends EChatEntryType
  /* 4 */ @js.native
  object Emote extends TopLevel[Emote with Double]
  
  @js.native
  sealed trait Entered extends EChatEntryType
  /* 7 */ @js.native
  object Entered extends TopLevel[Entered with Double]
  
  @js.native
  sealed trait HistoricalChat extends EChatEntryType
  /* 11 */ @js.native
  object HistoricalChat extends TopLevel[HistoricalChat with Double]
  
  @js.native
  sealed trait Invalid extends EChatEntryType
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait InviteGame extends EChatEntryType
  /* 3 */ @js.native
  object InviteGame extends TopLevel[InviteGame with Double]
  
  @js.native
  sealed trait LeftConversation extends EChatEntryType
  /* 6 */ @js.native
  object LeftConversation extends TopLevel[LeftConversation with Double]
  
  @js.native
  sealed trait LinkBlocked extends EChatEntryType
  /* 14 */ @js.native
  object LinkBlocked extends TopLevel[LinkBlocked with Double]
  
   // removed "Listen for LobbyGameCreated_t callback instead"
  @js.native
  sealed trait LobbyGameStart extends EChatEntryType
  /* 5 */ @js.native
  object LobbyGameStart extends TopLevel[LobbyGameStart with Double]
  
  @js.native
  sealed trait Reserved1 extends EChatEntryType
  /* 12 */ @js.native
  object Reserved1 extends TopLevel[Reserved1 with Double]
  
  @js.native
  sealed trait Reserved2 extends EChatEntryType
  /* 13 */ @js.native
  object Reserved2 extends TopLevel[Reserved2 with Double]
  
  @js.native
  sealed trait Typing extends EChatEntryType
  /* 2 */ @js.native
  object Typing extends TopLevel[Typing with Double]
  
  @js.native
  sealed trait WasBanned extends EChatEntryType
  /* 9 */ @js.native
  object WasBanned extends TopLevel[WasBanned with Double]
  
  @js.native
  sealed trait WasKicked extends EChatEntryType
  /* 8 */ @js.native
  object WasKicked extends TopLevel[WasKicked with Double]
}
