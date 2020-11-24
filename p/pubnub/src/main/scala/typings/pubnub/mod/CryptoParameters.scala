package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// encrypt & decrypt
@js.native
trait CryptoParameters extends js.Object {
  
  var encryptKey: js.UndefOr[Boolean] = js.native
  
  var keyEncoding: js.UndefOr[String] = js.native
  
  var keyLength: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String] = js.native
}
object CryptoParameters {
  
  @scala.inline
  def apply(): CryptoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoParameters]
  }
  
  @scala.inline
  implicit class CryptoParametersOps[Self <: CryptoParameters] (val x: Self) extends AnyVal {
    
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
    def setEncryptKey(value: Boolean): Self = this.set("encryptKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptKey: Self = this.set("encryptKey", js.undefined)
    
    @scala.inline
    def setKeyEncoding(value: String): Self = this.set("keyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyEncoding: Self = this.set("keyEncoding", js.undefined)
    
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyLength: Self = this.set("keyLength", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
