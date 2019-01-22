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

