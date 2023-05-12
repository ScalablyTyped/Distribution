package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfillmentTrackingInfo extends StObject {
  
  var number: String
  
  var url: URL
}
object FulfillmentTrackingInfo {
  
  inline def apply(number: String, url: URL): FulfillmentTrackingInfo = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentTrackingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FulfillmentTrackingInfo] (val x: Self) extends AnyVal {
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
