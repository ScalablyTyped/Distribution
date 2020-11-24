package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientData extends js.Object {
  
  var challenge: java.lang.String = js.native
  
  var extensions: js.UndefOr[WebAuthnExtensions] = js.native
  
  var hashAlg: java.lang.String | Algorithm = js.native
  
  var origin: java.lang.String = js.native
  
  var rpId: java.lang.String = js.native
  
  var tokenBinding: js.UndefOr[java.lang.String] = js.native
}
object ClientData {
  
  @scala.inline
  def apply(
    challenge: java.lang.String,
    hashAlg: java.lang.String | Algorithm,
    origin: java.lang.String,
    rpId: java.lang.String
  ): ClientData = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rpId = rpId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientData]
  }
  
  @scala.inline
  implicit class ClientDataOps[Self <: ClientData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChallenge(value: java.lang.String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlg(value: java.lang.String | Algorithm): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: java.lang.String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRpId(value: java.lang.String): Self = this.set("rpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: WebAuthnExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setTokenBinding(value: java.lang.String): Self = this.set("tokenBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenBinding: Self = this.set("tokenBinding", js.undefined)
  }
}
