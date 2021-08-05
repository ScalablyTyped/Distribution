package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientLookupValue extends StObject {
  
  var LookupId: Double
  
  var LookupValue: String
}
object ClientLookupValue {
  
  inline def apply(LookupId: Double, LookupValue: String): ClientLookupValue = {
    val __obj = js.Dynamic.literal(LookupId = LookupId.asInstanceOf[js.Any], LookupValue = LookupValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientLookupValue]
  }
  
  extension [Self <: ClientLookupValue](x: Self) {
    
    inline def setLookupId(value: Double): Self = StObject.set(x, "LookupId", value.asInstanceOf[js.Any])
    
    inline def setLookupValue(value: String): Self = StObject.set(x, "LookupValue", value.asInstanceOf[js.Any])
  }
}
