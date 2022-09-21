package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EConnectionProtocol extends StObject
@JSImport("steam-user", "EConnectionProtocol")
@js.native
object EConnectionProtocol extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EConnectionProtocol & Double] = js.native
  
  @js.native
  sealed trait Auto
    extends StObject
       with EConnectionProtocol
  /* 0 */ val Auto: typings.steamUser.mod.EConnectionProtocol.Auto & Double = js.native
  
  @js.native
  sealed trait TCP
    extends StObject
       with EConnectionProtocol
  /* 1 */ val TCP: typings.steamUser.mod.EConnectionProtocol.TCP & Double = js.native
  
  @js.native
  sealed trait WebSocket
    extends StObject
       with EConnectionProtocol
  /* 2 */ val WebSocket: typings.steamUser.mod.EConnectionProtocol.WebSocket & Double = js.native
}
