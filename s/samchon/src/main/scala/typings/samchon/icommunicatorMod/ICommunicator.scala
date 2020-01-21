package typings.samchon.icommunicatorMod

import typings.samchon.invokeMod.Invoke
import typings.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommunicator extends IProtocol {
  /**
    * Callback function for connection closed.
    */
  var onClose: js.Function
  /**
    * Close connection.
    */
  def close(): Unit
  /**
    * Test connection.
    *
    * Test whether this {@link ICommunicator communicator} object is connected with the remote system. If the
    * connection is alive, then returns ```true```. Otherwise, the connection is not alive or this
    * {@link ICommunicator communicator has not connected with the remote system yet, then returns ```false```.
    *
    * @return true if connected, otherwise false.
    */
  def isConnected(): Boolean
}

object ICommunicator {
  @scala.inline
  def apply(
    close: () => Unit,
    isConnected: () => Boolean,
    onClose: js.Function,
    replyData: Invoke => Unit,
    sendData: Invoke => Unit
  ): ICommunicator = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isConnected = js.Any.fromFunction0(isConnected), onClose = onClose.asInstanceOf[js.Any], replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
  
    __obj.asInstanceOf[ICommunicator]
  }
}

