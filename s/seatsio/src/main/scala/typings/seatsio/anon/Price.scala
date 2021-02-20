package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Price extends StObject {
  
  var price: Double = js.native
  
  var ticketType: js.UndefOr[String] = js.native
}
object Price {
  
  @scala.inline
  def apply(price: Double): Price = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  
  @scala.inline
  implicit class PriceMutableBuilder[Self <: Price] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketTypeUndefined: Self = StObject.set(x, "ticketType", js.undefined)
  }
}
