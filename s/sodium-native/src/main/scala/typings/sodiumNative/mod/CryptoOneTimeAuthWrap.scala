package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoOneTimeAuthWrap extends js.Object {
  
  /**
    * Finalize the instance.
    *
    * * `output` should be a buffer of length `crypto_onetimeauth_BYTES`.
    *
    * The generated hash is stored in `output`.
    */
  def `final`(output: Buffer): Unit = js.native
  
  /**
    * Update the instance with a new piece of data.
    *
    * * `input` should be a buffer of any size.
    */
  def update(input: Buffer): Unit = js.native
}
object CryptoOneTimeAuthWrap {
  
  @scala.inline
  def apply(`final`: Buffer => Unit, update: Buffer => Unit): CryptoOneTimeAuthWrap = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
    __obj.asInstanceOf[CryptoOneTimeAuthWrap]
  }
  
  @scala.inline
  implicit class CryptoOneTimeAuthWrapOps[Self <: CryptoOneTimeAuthWrap] (val x: Self) extends AnyVal {
    
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
    def setFinal(value: Buffer => Unit): Self = this.set("final", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: Buffer => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
