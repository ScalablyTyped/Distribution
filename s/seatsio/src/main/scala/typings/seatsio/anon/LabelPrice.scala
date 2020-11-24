package typings.seatsio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelPrice extends js.Object {
  
  var label: js.UndefOr[String] = js.native
  
  var price: Double = js.native
  
  var ticketType: String = js.native
}
object LabelPrice {
  
  @scala.inline
  def apply(price: Double, ticketType: String): LabelPrice = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], ticketType = ticketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelPrice]
  }
  
  @scala.inline
  implicit class LabelPriceOps[Self <: LabelPrice] (val x: Self) extends AnyVal {
    
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
    def setTicketType(value: String): Self = this.set("ticketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
