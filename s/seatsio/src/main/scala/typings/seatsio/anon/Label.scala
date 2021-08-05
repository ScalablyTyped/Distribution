package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var label: String
  
  var ticketType: js.UndefOr[String] = js.undefined
}
object Label {
  
  inline def apply(label: String): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
    
    inline def setTicketTypeUndefined: Self = StObject.set(x, "ticketType", js.undefined)
  }
}
