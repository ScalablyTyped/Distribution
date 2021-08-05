package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingStateTax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var addons: StringDictionary[String]
  
  var base: Plan
  
  var currency: Code
  
  var next: Addons
  
  var now: Addons
  
  var taxes: js.Array[SubscriptionPricingStateTax]
}
object Base {
  
  inline def apply(
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
  
  extension [Self <: Base](x: Self) {
    
    inline def setAddons(value: StringDictionary[String]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    inline def setBase(value: Plan): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: Code): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Addons): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNow(value: Addons): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setTaxes(value: js.Array[SubscriptionPricingStateTax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesVarargs(value: SubscriptionPricingStateTax*): Self = StObject.set(x, "taxes", js.Array(value :_*))
  }
}
