package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamDiscoveryMessage extends StObject
@JSImport("steam-user", "EStreamDiscoveryMessage")
@js.native
object EStreamDiscoveryMessage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamDiscoveryMessage & Double] = js.native
  
  @js.native
  sealed trait PingRequest
    extends StObject
       with EStreamDiscoveryMessage
  /* 1 */ val PingRequest: typings.steamUser.mod.EStreamDiscoveryMessage.PingRequest & Double = js.native
  
  @js.native
  sealed trait PingResponse
    extends StObject
       with EStreamDiscoveryMessage
  /* 2 */ val PingResponse: typings.steamUser.mod.EStreamDiscoveryMessage.PingResponse & Double = js.native
}
