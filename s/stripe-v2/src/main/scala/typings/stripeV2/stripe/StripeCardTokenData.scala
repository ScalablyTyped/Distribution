package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeCardTokenData extends StObject {
  
  var address_city: js.UndefOr[String] = js.undefined
  
  var address_country: js.UndefOr[String] = js.undefined
  
  var address_line1: js.UndefOr[String] = js.undefined
  
  var address_line2: js.UndefOr[String] = js.undefined
  
  var address_state: js.UndefOr[String] = js.undefined
  
  var address_zip: js.UndefOr[String] = js.undefined
  
  var cvc: js.UndefOr[String] = js.undefined
  
  var exp: js.UndefOr[String] = js.undefined
  
  var exp_month: js.UndefOr[Double] = js.undefined
  
  var exp_year: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var number: String
}
object StripeCardTokenData {
  
  @scala.inline
  def apply(number: String): StripeCardTokenData = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCardTokenData]
  }
  
  @scala.inline
  implicit class StripeCardTokenDataMutableBuilder[Self <: StripeCardTokenData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_cityUndefined: Self = StObject.set(x, "address_city", js.undefined)
    
    @scala.inline
    def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
    
    @scala.inline
    def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1Undefined: Self = StObject.set(x, "address_line1", js.undefined)
    
    @scala.inline
    def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
    
    @scala.inline
    def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_stateUndefined: Self = StObject.set(x, "address_state", js.undefined)
    
    @scala.inline
    def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
    
    @scala.inline
    def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvcUndefined: Self = StObject.set(x, "cvc", js.undefined)
    
    @scala.inline
    def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    @scala.inline
    def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
    
    @scala.inline
    def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
