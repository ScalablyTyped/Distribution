package typings.stompit.clientMod

import typings.node.streamMod.WritableOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendOptions extends WritableOptions {
  
  def onError(err: Error): Unit = js.native
  
  def onReceipt(): Unit = js.native
}
object SendOptions {
  
  @scala.inline
  def apply(onError: Error => Unit, onReceipt: () => Unit): SendOptions = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onReceipt = js.Any.fromFunction0(onReceipt))
    __obj.asInstanceOf[SendOptions]
  }
  
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
    
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
    def setOnError(value: Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReceipt(value: () => Unit): Self = this.set("onReceipt", js.Any.fromFunction0(value))
  }
}
