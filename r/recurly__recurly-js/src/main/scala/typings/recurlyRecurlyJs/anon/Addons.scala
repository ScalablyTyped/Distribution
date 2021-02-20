package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addons extends StObject {
  
  var addons: String = js.native
  
  var discount: String = js.native
  
  var plan: String = js.native
  
  var setup_fee: String = js.native
  
  var subtotal: String = js.native
  
  var tax: String = js.native
  
  var total: String = js.native
}
object Addons {
  
  @scala.inline
  def apply(
    addons: String,
    discount: String,
    plan: String,
    setup_fee: String,
    subtotal: String,
    tax: String,
    total: String
  ): Addons = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setup_fee = setup_fee.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addons]
  }
  
  @scala.inline
  implicit class AddonsMutableBuilder[Self <: Addons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddons(value: String): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscount(value: String): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetup_fee(value: String): Self = StObject.set(x, "setup_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotal(value: String): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax(value: String): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
