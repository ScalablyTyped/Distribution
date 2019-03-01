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
    close: js.Function0[scala.Unit],
    isConnected: js.Function0[scala.Boolean],
    listen: js.Function1[samchonLib.protocolInvokeIProtocolMod.IProtocol, scala.Unit],
    onClose: js.Function,
    replyData: js.Function1[samchonLib.protocolInvokeInvokeMod.Invoke, scala.Unit],
    sendData: js.Function1[samchonLib.protocolInvokeInvokeMod.Invoke, scala.Unit]
  ): IClientDriver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("isConnected")(isConnected)
    __obj.updateDynamic("listen")(listen)
    __obj.updateDynamic("onClose")(onClose)
    __obj.updateDynamic("replyData")(replyData)
    __obj.updateDynamic("sendData")(sendData)
    __obj.asInstanceOf[IClientDriver]
  }
}

