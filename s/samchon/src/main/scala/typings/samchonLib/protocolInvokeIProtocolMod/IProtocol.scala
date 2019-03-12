package typings
package samchonLib.protocolInvokeIProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProtocol extends js.Object {
  /**
    * Sending message.
    *
    * Sends message to related system or shifts the responsibility to chain.
    *
    * @param invoke Invoke message to send
    */
  def replyData(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit
  /**
    * Handling replied message.
    *
    * Handles replied message or shifts the responsibility to chain.
    *
    * @param invoke An {@link Invoke} message has received.
    */
  def sendData(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit
}

object IProtocol {
  @scala.inline
  def apply(
    replyData: samchonLib.protocolInvokeInvokeMod.Invoke => scala.Unit,
    sendData: samchonLib.protocolInvokeInvokeMod.Invoke => scala.Unit
  ): IProtocol = {
    val __obj = js.Dynamic.literal(replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
  
    __obj.asInstanceOf[IProtocol]
  }
}

