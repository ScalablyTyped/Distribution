package typings
package samchonLib.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @JSImport("samchon/protocol/communicator/client_driver/WebClientDriver", "WebClientDriver")
@js.native
class WebClientDriver protected ()
  extends samchonLib.protocolCommunicatorCommunicatorWebCommunicatorMod.WebCommunicator {
  /**
    * Initialization Constructor.
    *
    * @param connection Connection driver, a socket for web-socket.
    * @param path Requested path.
    * @param session_id Session ID, an identifier of the remote client.
    */
  def this(connection: js.Any, path: java.lang.String, session_id: java.lang.String) = this()
  /**
    * @hidden
    */
  var listening_ : js.Any = js.native
  /**
    * @hidden
    */
  var path_ : js.Any = js.native
  /**
    * @hidden
    */
  var session_id_ : js.Any = js.native
  /**
    * Get requested path.
    */
  def getPath(): java.lang.String = js.native
  /**
    * Get session ID, an identifier of the remote client.
    */
  def getSessionID(): java.lang.String = js.native
  /**
    * @inheritdoc
    */
  /**
    * Listen message from the newly connected client.
    *
    * Starts listening message from the newly connected client. Replied message from the connected client will be
    * converted to {@link Invoke} classes and shifted to the *listener*'s {@link IProtocol.replyData replyData()}
    * method.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def listen(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol): scala.Unit = js.native
}

