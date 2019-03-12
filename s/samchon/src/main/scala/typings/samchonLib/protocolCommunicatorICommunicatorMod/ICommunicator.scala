package typings
package samchonLib.protocolCommunicatorICommunicatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommunicator
  extends samchonLib.protocolInvokeIProtocolMod.IProtocol {
  /**
    * Callback function for connection closed.
    */
  var onClose: js.Function
  /**
    * Close connection.
    */
  def close(): scala.Unit
  /**
    * Test connection.
    *
    * Test whether this {@link ICommunicator communicator} object is connected with the remote system. If the
    * connection is alive, then returns ```true```. Otherwise, the connection is not alive or this
    * {@link ICommunicator communicator has not connected with the remote system yet, then returns ```false```.
    *
    * @return true if connected, otherwise false.
    */
  def isConnected(): scala.Boolean
}

object ICommunicator {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    isConnected: () => scala.Boolean,
    onClose: js.Function,
    replyData: samchonLib.protocolInvokeInvokeMod.Invoke => scala.Unit,
    sendData: samchonLib.protocolInvokeInvokeMod.Invoke => scala.Unit
  ): ICommunicator = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isConnected = js.Any.fromFunction0(isConnected), onClose = onClose, replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
  
    __obj.asInstanceOf[ICommunicator]
  }
}

