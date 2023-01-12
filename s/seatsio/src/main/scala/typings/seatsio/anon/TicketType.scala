package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TicketType extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var price: Double
  
  var ticketType: js.UndefOr[String] = js.undefined
}
object TicketType {
  
  inline def apply(price: Double): TicketType = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[TicketType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TicketType] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
    
    inline def setTicketTypeUndefined: Self = StObject.set(x, "ticketType", js.undefined)
  }
}
