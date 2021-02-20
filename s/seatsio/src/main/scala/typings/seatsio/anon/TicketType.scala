package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TicketType extends StObject {
  
  var label: js.UndefOr[String] = js.native
  
  var price: Double = js.native
  
  var ticketType: js.UndefOr[String] = js.native
}
object TicketType {
  
  @scala.inline
  def apply(price: Double): TicketType = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[TicketType]
  }
  
  @scala.inline
  implicit class TicketTypeMutableBuilder[Self <: TicketType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketTypeUndefined: Self = StObject.set(x, "ticketType", js.undefined)
  }
}
