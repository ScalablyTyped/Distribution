package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoStreamChacha20XorWrap extends js.Object {
  
  /**
    * Finalize the stream. Zeros out internal state.
    */
  def `final`(): Unit = js.native
  
  /**
    * Encrypt the next message
    */
  def update(ciphertext: Buffer, message: Buffer): Unit = js.native
}
object CryptoStreamChacha20XorWrap {
  
  @scala.inline
  def apply(`final`: () => Unit, update: (Buffer, Buffer) => Unit): CryptoStreamChacha20XorWrap = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
    __obj.asInstanceOf[CryptoStreamChacha20XorWrap]
  }
  
  @scala.inline
  implicit class CryptoStreamChacha20XorWrapOps[Self <: CryptoStreamChacha20XorWrap] (val x: Self) extends AnyVal {
    
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
    def setFinal(value: () => Unit): Self = this.set("final", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: (Buffer, Buffer) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
}
