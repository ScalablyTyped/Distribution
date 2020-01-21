package typings.socketIo.mod

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A reference to the underlying engine.io Socket connection.
	 */
@js.native
trait EngineSocket extends EventEmitter {
  /**
  		 * The ID for this socket - matches Client.id
  		 */
  var id: String = js.native
  /**
  		 * The ready state for the client. Either 'opening', 'open', 'closing', or 'closed'
  		 */
  var readyState: String = js.native
  /**
  		 * The remote IP for this connection
  		 */
  var remoteAddress: String = js.native
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
  var upgraded: Boolean = js.native
}

