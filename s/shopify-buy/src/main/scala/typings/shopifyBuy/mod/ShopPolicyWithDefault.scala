package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShopPolicyWithDefault extends StObject {
  
  var body: String
  
  var handle: String
  
  var id: js.UndefOr[ID] = js.undefined
  
  var title: String
  
  var url: URL
}
object ShopPolicyWithDefault {
  
  inline def apply(body: String, handle: String, title: String, url: URL): ShopPolicyWithDefault = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShopPolicyWithDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShopPolicyWithDefault] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
