package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentOptions extends js.Object {
  
  var requestPayerEmail: js.UndefOr[scala.Boolean] = js.native
  
  var requestPayerName: js.UndefOr[scala.Boolean] = js.native
  
  var requestPayerPhone: js.UndefOr[scala.Boolean] = js.native
  
  var requestShipping: js.UndefOr[scala.Boolean] = js.native
  
  var shippingType: js.UndefOr[java.lang.String] = js.native
}
object PaymentOptions {
  
  @scala.inline
  def apply(): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentOptions]
  }
  
  @scala.inline
  implicit class PaymentOptionsOps[Self <: PaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequestPayerEmail(value: scala.Boolean): Self = this.set("requestPayerEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayerEmail: Self = this.set("requestPayerEmail", js.undefined)
    
    @scala.inline
    def setRequestPayerName(value: scala.Boolean): Self = this.set("requestPayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayerName: Self = this.set("requestPayerName", js.undefined)
    
    @scala.inline
    def setRequestPayerPhone(value: scala.Boolean): Self = this.set("requestPayerPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayerPhone: Self = this.set("requestPayerPhone", js.undefined)
    
    @scala.inline
    def setRequestShipping(value: scala.Boolean): Self = this.set("requestShipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestShipping: Self = this.set("requestShipping", js.undefined)
    
    @scala.inline
    def setShippingType(value: java.lang.String): Self = this.set("shippingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingType: Self = this.set("shippingType", js.undefined)
  }
}
