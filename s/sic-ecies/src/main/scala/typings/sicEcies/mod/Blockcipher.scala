package typings.sicEcies.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blockcipher extends js.Object {
  
  def decrypt(encbuf: Buffer, cipherkeybuf: Buffer): Buffer = js.native
  
  def encrypt(xorbuf: Buffer, cipherkeybuf: Buffer): Buffer = js.native
}
object Blockcipher {
  
  @scala.inline
  def apply(decrypt: (Buffer, Buffer) => Buffer, encrypt: (Buffer, Buffer) => Buffer): Blockcipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt))
    __obj.asInstanceOf[Blockcipher]
  }
  
  @scala.inline
  implicit class BlockcipherOps[Self <: Blockcipher] (val x: Self) extends AnyVal {
    
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
    def setDecrypt(value: (Buffer, Buffer) => Buffer): Self = this.set("decrypt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEncrypt(value: (Buffer, Buffer) => Buffer): Self = this.set("encrypt", js.Any.fromFunction2(value))
  }
}
