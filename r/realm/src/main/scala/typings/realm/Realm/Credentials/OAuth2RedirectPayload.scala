package typings.realm.Realm.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payload sent when authenticating using an OAuth 2.0 provider:
  * - [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
  * - [Facebook Provider](https://docs.mongodb.com/realm/authentication/facebook/).
  */
@js.native
trait OAuth2RedirectPayload extends js.Object {
  
  /**
    * The auth code returned from Google.
    */
  var redirectUrl: String = js.native
}
object OAuth2RedirectPayload {
  
  @scala.inline
  def apply(redirectUrl: String): OAuth2RedirectPayload = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2RedirectPayload]
  }
  
  @scala.inline
  implicit class OAuth2RedirectPayloadOps[Self <: OAuth2RedirectPayload] (val x: Self) extends AnyVal {
    
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
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
  }
}
