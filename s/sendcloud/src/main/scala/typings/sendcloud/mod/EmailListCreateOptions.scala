package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailListCreateOptions extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var api_key: String
  
  var api_user: String
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object EmailListCreateOptions {
  
  @scala.inline
  def apply(api_key: String, api_user: String): EmailListCreateOptions = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListCreateOptions]
  }
  
  @scala.inline
  implicit class EmailListCreateOptionsMutableBuilder[Self <: EmailListCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_user(value: String): Self = StObject.set(x, "api_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
