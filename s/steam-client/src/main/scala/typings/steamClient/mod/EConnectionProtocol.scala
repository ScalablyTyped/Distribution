package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EConnectionProtocol extends js.Object
@JSImport("steam-client", "EConnectionProtocol")
@js.native
object EConnectionProtocol extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EConnectionProtocol with Double] = js.native
  
  @js.native
  sealed trait TCP extends EConnectionProtocol
  /* 1 */ @js.native
  object TCP extends TopLevel[TCP with Double]
  
  @js.native
  sealed trait UDP extends EConnectionProtocol
  /* 2 */ @js.native
  object UDP extends TopLevel[UDP with Double]
  
  @js.native
  sealed trait WebSocket extends EConnectionProtocol
  /* 3 */ @js.native
  object WebSocket extends TopLevel[WebSocket with Double]
}
