package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailListUpdateOptions extends StObject {
  
  var address: String
  
  var api_key: String
  
  var api_user: String
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var toAddress: js.UndefOr[String] = js.undefined
}
object EmailListUpdateOptions {
  
  inline def apply(address: String, api_key: String, api_user: String): EmailListUpdateOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListUpdateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailListUpdateOptions] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setApi_user(value: String): Self = StObject.set(x, "api_user", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setToAddress(value: String): Self = StObject.set(x, "toAddress", value.asInstanceOf[js.Any])
    
    inline def setToAddressUndefined: Self = StObject.set(x, "toAddress", js.undefined)
  }
}
