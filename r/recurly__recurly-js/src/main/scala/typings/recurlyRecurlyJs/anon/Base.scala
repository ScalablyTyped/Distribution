package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingStateTax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends StObject {
  
  var addons: StringDictionary[String] = js.native
  
  var base: Plan = js.native
  
  var currency: Code = js.native
  
  var next: Addons = js.native
  
  var now: Addons = js.native
  
  var taxes: js.Array[SubscriptionPricingStateTax] = js.native
}
object Base {
  
  @scala.inline
  def apply(
    addons: StringDictionary[String],
    base: Plan,
    currency: Code,
    next: Addons,
    now: Addons,
    taxes: js.Array[SubscriptionPricingStateTax]
  ): Base = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddons(value: StringDictionary[String]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Plan): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: Code): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Addons): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: Addons): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxes(value: js.Array[SubscriptionPricingStateTax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxesVarargs(value: SubscriptionPricingStateTax*): Self = StObject.set(x, "taxes", js.Array(value :_*))
  }
}
