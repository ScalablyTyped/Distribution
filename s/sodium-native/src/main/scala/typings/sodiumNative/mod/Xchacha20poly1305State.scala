package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xchacha20poly1305State extends js.Object {
  
  var _pad: Buffer = js.native
  
  var k: Buffer = js.native
  
  var nonce: Buffer = js.native
}
object Xchacha20poly1305State {
  
  @scala.inline
  def apply(_pad: Buffer, k: Buffer, nonce: Buffer): Xchacha20poly1305State = {
    val __obj = js.Dynamic.literal(_pad = _pad.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xchacha20poly1305State]
  }
  
  @scala.inline
  implicit class Xchacha20poly1305StateOps[Self <: Xchacha20poly1305State] (val x: Self) extends AnyVal {
    
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
    def set_pad(value: Buffer): Self = this.set("_pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK(value: Buffer): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: Buffer): Self = this.set("nonce", value.asInstanceOf[js.Any])
  }
}
