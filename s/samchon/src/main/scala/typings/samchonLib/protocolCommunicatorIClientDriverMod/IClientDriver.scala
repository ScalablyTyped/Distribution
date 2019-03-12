package typings
package samchonLib.protocolCommunicatorIClientDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientDriver
  extends samchonLib.protocolCommunicatorICommunicatorMod.ICommunicator {
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
  def listen(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol): scala.Unit
}

object IClientDriver {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    isConnected: () => scala.Boolean,
    listen: samchonLib.protocolInvokeIProtocolMod.IProtocol => scala.Unit,
    onClose: js.Function,
    replyData: samchonLib.protocolInvokeInvokeMod.Invoke => scala.Unit,
    sendData: samchonLib.protocolInvokeInvokeMod.Invoke => scala.Unit
  ): IClientDriver = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isConnected = js.Any.fromFunction0(isConnected), listen = js.Any.fromFunction1(listen), onClose = onClose, replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
  
    __obj.asInstanceOf[IClientDriver]
  }
}

