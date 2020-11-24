package typings.samchon.iprotocolMod

import typings.samchon.invokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProtocol extends js.Object {
  
  /**
    * Sending message.
    *
    * Sends message to related system or shifts the responsibility to chain.
    *
    * @param invoke Invoke message to send
    */
  def replyData(invoke: Invoke): Unit = js.native
  
  /**
    * Handling replied message.
    *
    * Handles replied message or shifts the responsibility to chain.
    *
    * @param invoke An {@link Invoke} message has received.
    */
  def sendData(invoke: Invoke): Unit = js.native
}
object IProtocol {
  
  @scala.inline
  def apply(replyData: Invoke => Unit, sendData: Invoke => Unit): IProtocol = {
    val __obj = js.Dynamic.literal(replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
    __obj.asInstanceOf[IProtocol]
  }
  
  @scala.inline
  implicit class IProtocolOps[Self <: IProtocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplyData(value: Invoke => Unit): Self = this.set("replyData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendData(value: Invoke => Unit): Self = this.set("sendData", js.Any.fromFunction1(value))
  }
}
