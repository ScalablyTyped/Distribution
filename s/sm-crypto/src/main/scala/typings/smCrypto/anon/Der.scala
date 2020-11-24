package typings.smCrypto.anon

import typings.smCrypto.mod.KeyPairPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Der extends js.Object {
  
  var der: js.UndefOr[Boolean] = js.native
  
  var hash: js.UndefOr[Boolean] = js.native
  
  var pointPool: js.UndefOr[js.Array[KeyPairPoint]] = js.native
  
  var publicKey: js.UndefOr[String] = js.native
}
object Der {
  
  @scala.inline
  def apply(): Der = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Der]
  }
  
  @scala.inline
  implicit class DerOps[Self <: Der] (val x: Self) extends AnyVal {
    
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
    def setDer(value: Boolean): Self = this.set("der", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDer: Self = this.set("der", js.undefined)
    
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setPointPoolVarargs(value: KeyPairPoint*): Self = this.set("pointPool", js.Array(value :_*))
    
    @scala.inline
    def setPointPool(value: js.Array[KeyPairPoint]): Self = this.set("pointPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointPool: Self = this.set("pointPool", js.undefined)
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
  }
}
