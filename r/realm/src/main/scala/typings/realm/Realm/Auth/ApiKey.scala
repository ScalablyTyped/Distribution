package typings.realm.Realm.Auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The representation of an API-key stored in the service.
  */
@js.native
trait ApiKey extends js.Object {
  
  /**
    * The internal identifier of the key.
    */
  var _id: String = js.native
  
  /**
    * When disabled, the key cannot authenticate.
    */
  var disabled: Boolean = js.native
  
  /**
    * The secret part of the key.
    */
  var key: String = js.native
  
  /**
    * A name for the key.
    */
  var name: String = js.native
}
object ApiKey {
  
  @scala.inline
  def apply(_id: String, disabled: Boolean, key: String, name: String): ApiKey = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
  
  @scala.inline
  implicit class ApiKeyOps[Self <: ApiKey] (val x: Self) extends AnyVal {
    
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
