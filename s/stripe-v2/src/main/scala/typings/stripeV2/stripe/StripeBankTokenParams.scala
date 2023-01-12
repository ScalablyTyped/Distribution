package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeBankTokenParams extends StObject {
  
  var account_holder_name: String
  
  var account_holder_type: String
  
  var account_number: Double | String
  
  var country: String
  
  var currency: String
  
  var routing_number: js.UndefOr[Double | String] = js.undefined
}
object StripeBankTokenParams {
  
  inline def apply(
    account_holder_name: String,
    account_holder_type: String,
    account_number: Double | String,
    country: String,
    currency: String
  ): StripeBankTokenParams = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeBankTokenParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StripeBankTokenParams] (val x: Self) extends AnyVal {
    
    inline def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
    
    inline def setAccount_holder_type(value: String): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
    
    inline def setAccount_number(value: Double | String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setRouting_number(value: Double | String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    inline def setRouting_numberUndefined: Self = StObject.set(x, "routing_number", js.undefined)
  }
}
