package typings.recurlyRecurlyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  @js.native
  trait Address extends StObject {
    
    /**
      * First line of a street address
      */
    var address1: js.UndefOr[String] = js.native
    
    /**
      * Second line of a street address
      */
    var address2: js.UndefOr[String] = js.native
    
    /**
      * Town or locality
      */
    var city: js.UndefOr[String] = js.native
    
    /**
      * {@link http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2| [ISO 3166-1 alpha-2]} country code
      */
    var country: js.UndefOr[String] = js.native
    
    /**
      * Cardholder first name
      */
    var first_name: String = js.native
    
    /**
      * Cardholder last name
      */
    var last_name: String = js.native
    
    /**
      * Phone number
      */
    var phone: js.UndefOr[String] = js.native
    
    /**
      * Postal code
      */
    var postal_code: js.UndefOr[String] = js.native
    
    /**
      * Province or region
      */
    var state: js.UndefOr[String] = js.native
    
    /**
      * Customer VAT number. Used for VAT exclusion
      */
    var vat_number: js.UndefOr[String] = js.native
  }
  object Address {
    
    @scala.inline
    def apply(first_name: String, last_name: String): Address = {
      val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
    }
  }
}
