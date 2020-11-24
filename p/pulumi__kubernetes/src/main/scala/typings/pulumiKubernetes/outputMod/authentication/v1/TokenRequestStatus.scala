package typings.pulumiKubernetes.outputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TokenRequestStatus is the result of a token request.
  */
@js.native
trait TokenRequestStatus extends js.Object {
  
  /**
    * ExpirationTimestamp is the time of expiration of the returned token.
    */
  var expirationTimestamp: String = js.native
  
  /**
    * Token is the opaque bearer token.
    */
  var token: String = js.native
}
object TokenRequestStatus {
  
  @scala.inline
  def apply(expirationTimestamp: String, token: String): TokenRequestStatus = {
    val __obj = js.Dynamic.literal(expirationTimestamp = expirationTimestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequestStatus]
  }
  
  @scala.inline
  implicit class TokenRequestStatusOps[Self <: TokenRequestStatus] (val x: Self) extends AnyVal {
    
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
    def setExpirationTimestamp(value: String): Self = this.set("expirationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
