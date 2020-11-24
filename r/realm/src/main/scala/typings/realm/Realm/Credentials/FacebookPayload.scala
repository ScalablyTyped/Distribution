package typings.realm.Realm.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payload sent when authenticating using the [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
  */
@js.native
trait FacebookPayload extends js.Object {
  
  /**
    * The auth code returned from Google.
    */
  var accessToken: String = js.native
}
object FacebookPayload {
  
  @scala.inline
  def apply(accessToken: String): FacebookPayload = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacebookPayload]
  }
  
  @scala.inline
  implicit class FacebookPayloadOps[Self <: FacebookPayload] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
  }
}
