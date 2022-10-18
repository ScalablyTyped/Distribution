package typings.recurlyRecurlyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAddressMod {
  
  trait Address extends StObject {
    
    /**
      * First line of a street address
      */
    var address1: js.UndefOr[String] = js.undefined
    
    /**
      * Second line of a street address
      */
    var address2: js.UndefOr[String] = js.undefined
    
    /**
      * Town or locality
      */
    var city: js.UndefOr[String] = js.undefined
    
    /**
      * {@link http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2| [ISO 3166-1 alpha-2]} country code
      */
    var country: js.UndefOr[String] = js.undefined
    
    /**
      * Cardholder first name
      */
    var first_name: String
    
    /**
      * Cardholder last name
      */
    var last_name: String
    
    /**
      * Phone number
      */
    var phone: js.UndefOr[String] = js.undefined
    
    /**
      * Postal code
      */
    var postal_code: js.UndefOr[String] = js.undefined
    
    /**
      * Province or region
      */
    var state: js.UndefOr[String] = js.undefined
    
    /**
      * Customer VAT number. Used for VAT exclusion
      */
    var vat_number: js.UndefOr[String] = js.undefined
  }
  object Address {
    
    inline def apply(first_name: String, last_name: String): Address = {
      val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      inline def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
}
