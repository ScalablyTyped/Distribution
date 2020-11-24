package typings.realm.Realm.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payload sent when authenticating using the [Apple ID Provider](https://docs.mongodb.com/realm/authentication/apple/).
  */
@js.native
trait ApplePayload extends js.Object {
  
  /**
    * The ID token from Apple.
    */
  var id_token: String = js.native
}
object ApplePayload {
  
  @scala.inline
  def apply(id_token: String): ApplePayload = {
    val __obj = js.Dynamic.literal(id_token = id_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayload]
  }
  
  @scala.inline
  implicit class ApplePayloadOps[Self <: ApplePayload] (val x: Self) extends AnyVal {
    
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
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
  }
}
