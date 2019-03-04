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
    close: js.Function0[scala.Unit],
    isConnected: js.Function0[scala.Boolean],
    onClose: js.Function,
    replyData: js.Function1[samchonLib.protocolInvokeInvokeMod.Invoke, scala.Unit],
    sendData: js.Function1[samchonLib.protocolInvokeInvokeMod.Invoke, scala.Unit]
  ): ICommunicator = {
    val __obj = js.Dynamic.literal(close = close, isConnected = isConnected, onClose = onClose, replyData = replyData, sendData = sendData)
  
    __obj.asInstanceOf[ICommunicator]
  }
}

