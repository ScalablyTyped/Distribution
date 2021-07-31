package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EConnectionProtocol extends StObject
@JSImport("steam-client", "EConnectionProtocol")
@js.native
object EConnectionProtocol extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EConnectionProtocol & Double] = js.native
  
  @js.native
  sealed trait TCP
    extends StObject
       with EConnectionProtocol
  /* 1 */ val TCP: typings.steamClient.mod.EConnectionProtocol.TCP & Double = js.native
  
  @js.native
  sealed trait UDP
    extends StObject
       with EConnectionProtocol
  /* 2 */ val UDP: typings.steamClient.mod.EConnectionProtocol.UDP & Double = js.native
  
  @js.native
  sealed trait WebSocket
    extends StObject
       with EConnectionProtocol
  /* 3 */ val WebSocket: typings.steamClient.mod.EConnectionProtocol.WebSocket & Double = js.native
}
