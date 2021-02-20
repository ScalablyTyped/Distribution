package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelPrice extends StObject {
  
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
  implicit class LabelPriceMutableBuilder[Self <: LabelPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
  }
}
