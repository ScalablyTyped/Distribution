package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailListUpdateOptions extends StObject {
  
  var address: String = js.native
  
  var api_key: String = js.native
  
  var api_user: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var toAddress: js.UndefOr[String] = js.native
}
object EmailListUpdateOptions {
  
  @scala.inline
  def apply(address: String, api_key: String, api_user: String): EmailListUpdateOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListUpdateOptions]
  }
  
  @scala.inline
  implicit class EmailListUpdateOptionsMutableBuilder[Self <: EmailListUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_user(value: String): Self = StObject.set(x, "api_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setToAddress(value: String): Self = StObject.set(x, "toAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToAddressUndefined: Self = StObject.set(x, "toAddress", js.undefined)
  }
}
