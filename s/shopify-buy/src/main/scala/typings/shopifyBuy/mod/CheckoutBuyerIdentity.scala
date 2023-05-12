package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutBuyerIdentity extends StObject {
  
  var countryCode: CountryCode
}
object CheckoutBuyerIdentity {
  
  inline def apply(countryCode: CountryCode): CheckoutBuyerIdentity = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutBuyerIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutBuyerIdentity] (val x: Self) extends AnyVal {
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
  }
}
