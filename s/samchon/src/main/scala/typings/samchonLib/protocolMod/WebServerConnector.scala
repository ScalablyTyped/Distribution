package typings
package samchonLib.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "WebServerConnector")
@js.native
class WebServerConnector protected ()
  extends samchonLib.protocolCommunicatorServerUnderscoreConnectorWebServerConnectorMod.WebServerConnector {
  /**
    * Construct from *listener*.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def this(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol) = this()
}

