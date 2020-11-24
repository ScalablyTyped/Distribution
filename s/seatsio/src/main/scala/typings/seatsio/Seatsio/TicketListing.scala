package typings.seatsio.Seatsio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TicketListing extends js.Object {
  
  var price: Double = js.native
  
  var quantity: Double = js.native
  
  var section: String = js.native
}
object TicketListing {
  
  @scala.inline
  def apply(price: Double, quantity: Double, section: String): TicketListing = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[TicketListing]
  }
  
  @scala.inline
  implicit class TicketListingOps[Self <: TicketListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
  }
}
