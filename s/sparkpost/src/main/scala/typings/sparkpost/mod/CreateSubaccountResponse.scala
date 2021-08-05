package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubaccountResponse extends StObject {
  
  var key: String
  
  var label: String
  
  var short_key: String
  
  var subaccount_id: Double
}
object CreateSubaccountResponse {
  
  inline def apply(key: String, label: String, short_key: String, subaccount_id: Double): CreateSubaccountResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], short_key = short_key.asInstanceOf[js.Any], subaccount_id = subaccount_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubaccountResponse]
  }
  
  extension [Self <: CreateSubaccountResponse](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setShort_key(value: String): Self = StObject.set(x, "short_key", value.asInstanceOf[js.Any])
    
    inline def setSubaccount_id(value: Double): Self = StObject.set(x, "subaccount_id", value.asInstanceOf[js.Any])
  }
}
