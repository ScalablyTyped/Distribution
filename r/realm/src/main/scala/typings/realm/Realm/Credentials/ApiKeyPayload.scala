package typings.realm.Realm.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payload sent when authenticating using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
  */
@js.native
trait ApiKeyPayload extends js.Object {
  
  /**
    * The secret content of the API key.
    */
  var key: String = js.native
}
object ApiKeyPayload {
  
  @scala.inline
  def apply(key: String): ApiKeyPayload = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyPayload]
  }
  
  @scala.inline
  implicit class ApiKeyPayloadOps[Self <: ApiKeyPayload] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
