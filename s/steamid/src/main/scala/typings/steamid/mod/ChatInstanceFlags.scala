package typings.steamid.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatInstanceFlags extends js.Object
@JSImport("steamid", "ChatInstanceFlags")
@js.native
object ChatInstanceFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[ChatInstanceFlags with scala.Nothing] = js.native
  
  /**
    * (AccountInstanceMask + 1) >> 1
    */
  @js.native
  sealed trait Clan extends ChatInstanceFlags
  /* 0x000FFFFF + 1 >> 1 */ @js.native
  object Clan
    extends TopLevel[Clan with scala.Nothing]
  
  /**
    * (AccountInstanceMask + 1) >> 2
    */
  @js.native
  sealed trait Lobby extends ChatInstanceFlags
  /* 0x000FFFFF + 1 >> 2 */ @js.native
  object Lobby
    extends TopLevel[Lobby with scala.Nothing]
  
  /**
    * (AccountInstanceMask + 1) >> 3
    */
  @js.native
  sealed trait MMSLobby extends ChatInstanceFlags
  /* 0x000FFFFF + 1 >> 3 */ @js.native
  object MMSLobby
    extends TopLevel[MMSLobby with scala.Nothing]
}
