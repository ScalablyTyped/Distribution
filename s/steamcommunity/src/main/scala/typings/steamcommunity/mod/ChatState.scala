package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatState extends StObject
/** The current state of our chat connection. One of the following values. */
@JSImport("steamcommunity", "ChatState")
@js.native
object ChatState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatState & Double] = js.native
  
  @js.native
  sealed trait LogOnFailed
    extends StObject
       with ChatState
  /* 2 */ val LogOnFailed: typings.steamcommunity.mod.ChatState.LogOnFailed & Double = js.native
  
  @js.native
  sealed trait LoggedOn
    extends StObject
       with ChatState
  /* 3 */ val LoggedOn: typings.steamcommunity.mod.ChatState.LoggedOn & Double = js.native
  
  @js.native
  sealed trait LoggingOn
    extends StObject
       with ChatState
  /* 1 */ val LoggingOn: typings.steamcommunity.mod.ChatState.LoggingOn & Double = js.native
  
  @js.native
  sealed trait Offline
    extends StObject
       with ChatState
  /* 0 */ val Offline: typings.steamcommunity.mod.ChatState.Offline & Double = js.native
}
