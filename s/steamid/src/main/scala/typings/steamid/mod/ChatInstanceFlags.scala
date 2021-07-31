package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatInstanceFlags extends StObject
@JSImport("steamid", "ChatInstanceFlags")
@js.native
object ChatInstanceFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[ChatInstanceFlags & scala.Nothing] = js.native
  
  /**
    * (AccountInstanceMask + 1) >> 1
    */
  @js.native
  sealed trait Clan
    extends StObject
       with ChatInstanceFlags
  /* 0x000FFFFF + 1 >> 1 */ val Clan: typings.steamid.mod.ChatInstanceFlags.Clan & scala.Nothing = js.native
  
  /**
    * (AccountInstanceMask + 1) >> 2
    */
  @js.native
  sealed trait Lobby
    extends StObject
       with ChatInstanceFlags
  /* 0x000FFFFF + 1 >> 2 */ val Lobby: typings.steamid.mod.ChatInstanceFlags.Lobby & scala.Nothing = js.native
  
  /**
    * (AccountInstanceMask + 1) >> 3
    */
  @js.native
  sealed trait MMSLobby
    extends StObject
       with ChatInstanceFlags
  /* 0x000FFFFF + 1 >> 3 */ val MMSLobby: typings.steamid.mod.ChatInstanceFlags.MMSLobby & scala.Nothing = js.native
}
