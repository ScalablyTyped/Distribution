package typings.samchon.iclientdriverMod

import typings.samchon.icommunicatorMod.ICommunicator
import typings.samchon.invokeMod.Invoke
import typings.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientDriver extends ICommunicator {
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
  def listen(listener: IProtocol): Unit
}

object IClientDriver {
  @scala.inline
  def apply(
    close: () => Unit,
    isConnected: () => Boolean,
    listen: IProtocol => Unit,
    onClose: js.Function,
    replyData: Invoke => Unit,
    sendData: Invoke => Unit
  ): IClientDriver = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isConnected = js.Any.fromFunction0(isConnected), listen = js.Any.fromFunction1(listen), onClose = onClose.asInstanceOf[js.Any], replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
  
    __obj.asInstanceOf[IClientDriver]
  }
}

