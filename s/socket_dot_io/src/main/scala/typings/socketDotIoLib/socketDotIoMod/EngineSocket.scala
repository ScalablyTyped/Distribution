package typings
package socketDotIoLib.socketDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A reference to the underlying engine.io Socket connection.
	 */
@js.native
trait EngineSocket
  extends nodeLib.NodeJSNs.EventEmitter {
  /**
  		 * The ID for this socket - matches Client.id
  		 */
  var id: java.lang.String = js.native
  /**
  		 * The ready state for the client. Either 'opening', 'open', 'closing', or 'closed'
  		 */
  var readyState: java.lang.String = js.native
  /**
  		 * The remote IP for this connection
  		 */
  var remoteAddress: java.lang.String = js.native
  /**
  		 * (http.IncomingMessage): request that originated the Socket
  		 */
  var request: js.Any = js.native
  /**
  		 * The Engine.io Server for this socket
  		 */
  var server: js.Any = js.native
  /**
  		 * (Transport): transport reference
  		 */
  var transport: js.Any = js.native
  /**
  		 * whether the transport has been upgraded
  		 */
  var upgraded: scala.Boolean = js.native
}

