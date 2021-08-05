package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var quantity: Double
  
  var ticketType: js.UndefOr[String] = js.undefined
}
object Category {
  
  inline def apply(quantity: Double): Category = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
    
    inline def setTicketTypeUndefined: Self = StObject.set(x, "ticketType", js.undefined)
  }
}
