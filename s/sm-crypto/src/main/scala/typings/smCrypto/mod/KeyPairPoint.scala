package typings.smCrypto.mod

import typings.bigi.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPairPoint extends KeyPairHex {
  
  var k: ^ = js.native
  
  var x1: ^ = js.native
}
object KeyPairPoint {
  
  @scala.inline
  def apply(k: ^, privateKey: String, publicKey: String, x1: ^): KeyPairPoint = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairPoint]
  }
  
  @scala.inline
  implicit class KeyPairPointOps[Self <: KeyPairPoint] (val x: Self) extends AnyVal {
    
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
    def setK(value: ^): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: ^): Self = this.set("x1", value.asInstanceOf[js.Any])
  }
}
