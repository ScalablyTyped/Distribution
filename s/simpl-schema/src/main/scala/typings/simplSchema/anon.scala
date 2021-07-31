package typings.simplSchema

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BADDATE extends StObject {
    
    var BAD_DATE: String
    
    var EXPECTED_TYPE: String
    
    var FAILED_REGULAR_EXPRESSION: String
    
    var KEY_NOT_IN_SCHEMA: String
    
    var MAX_COUNT: String
    
    var MAX_DATE: String
    
    var MAX_NUMBER: String
    
    var MAX_NUMBER_EXCLUSIVE: String
    
    var MAX_STRING: String
    
    var MIN_COUNT: String
    
    var MIN_DATE: String
    
    var MIN_NUMBER: String
    
    var MIN_NUMBER_EXCLUSIVE: String
    
    var MIN_STRING: String
    
    var MUST_BE_INTEGER: String
    
    var REQUIRED: String
    
    var VALUE_NOT_ALLOWED: String
  }
  object BADDATE {
    
    @scala.inline
    def apply(
      BAD_DATE: String,
      EXPECTED_TYPE: String,
      FAILED_REGULAR_EXPRESSION: String,
      KEY_NOT_IN_SCHEMA: String,
      MAX_COUNT: String,
      MAX_DATE: String,
      MAX_NUMBER: String,
      MAX_NUMBER_EXCLUSIVE: String,
      MAX_STRING: String,
      MIN_COUNT: String,
      MIN_DATE: String,
      MIN_NUMBER: String,
      MIN_NUMBER_EXCLUSIVE: String,
      MIN_STRING: String,
      MUST_BE_INTEGER: String,
      REQUIRED: String,
      VALUE_NOT_ALLOWED: String
    ): BADDATE = {
      val __obj = js.Dynamic.literal(BAD_DATE = BAD_DATE.asInstanceOf[js.Any], EXPECTED_TYPE = EXPECTED_TYPE.asInstanceOf[js.Any], FAILED_REGULAR_EXPRESSION = FAILED_REGULAR_EXPRESSION.asInstanceOf[js.Any], KEY_NOT_IN_SCHEMA = KEY_NOT_IN_SCHEMA.asInstanceOf[js.Any], MAX_COUNT = MAX_COUNT.asInstanceOf[js.Any], MAX_DATE = MAX_DATE.asInstanceOf[js.Any], MAX_NUMBER = MAX_NUMBER.asInstanceOf[js.Any], MAX_NUMBER_EXCLUSIVE = MAX_NUMBER_EXCLUSIVE.asInstanceOf[js.Any], MAX_STRING = MAX_STRING.asInstanceOf[js.Any], MIN_COUNT = MIN_COUNT.asInstanceOf[js.Any], MIN_DATE = MIN_DATE.asInstanceOf[js.Any], MIN_NUMBER = MIN_NUMBER.asInstanceOf[js.Any], MIN_NUMBER_EXCLUSIVE = MIN_NUMBER_EXCLUSIVE.asInstanceOf[js.Any], MIN_STRING = MIN_STRING.asInstanceOf[js.Any], MUST_BE_INTEGER = MUST_BE_INTEGER.asInstanceOf[js.Any], REQUIRED = REQUIRED.asInstanceOf[js.Any], VALUE_NOT_ALLOWED = VALUE_NOT_ALLOWED.asInstanceOf[js.Any])
      __obj.asInstanceOf[BADDATE]
    }
    
    @scala.inline
    implicit class BADDATEMutableBuilder[Self <: BADDATE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBAD_DATE(value: String): Self = StObject.set(x, "BAD_DATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXPECTED_TYPE(value: String): Self = StObject.set(x, "EXPECTED_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFAILED_REGULAR_EXPRESSION(value: String): Self = StObject.set(x, "FAILED_REGULAR_EXPRESSION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKEY_NOT_IN_SCHEMA(value: String): Self = StObject.set(x, "KEY_NOT_IN_SCHEMA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_COUNT(value: String): Self = StObject.set(x, "MAX_COUNT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_DATE(value: String): Self = StObject.set(x, "MAX_DATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_NUMBER(value: String): Self = StObject.set(x, "MAX_NUMBER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_NUMBER_EXCLUSIVE(value: String): Self = StObject.set(x, "MAX_NUMBER_EXCLUSIVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAX_STRING(value: String): Self = StObject.set(x, "MAX_STRING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIN_COUNT(value: String): Self = StObject.set(x, "MIN_COUNT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIN_DATE(value: String): Self = StObject.set(x, "MIN_DATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIN_NUMBER(value: String): Self = StObject.set(x, "MIN_NUMBER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIN_NUMBER_EXCLUSIVE(value: String): Self = StObject.set(x, "MIN_NUMBER_EXCLUSIVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIN_STRING(value: String): Self = StObject.set(x, "MIN_STRING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUST_BE_INTEGER(value: String): Self = StObject.set(x, "MUST_BE_INTEGER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREQUIRED(value: String): Self = StObject.set(x, "REQUIRED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVALUE_NOT_ALLOWED(value: String): Self = StObject.set(x, "VALUE_NOT_ALLOWED", value.asInstanceOf[js.Any])
    }
  }
  
  trait Domain extends StObject {
    
    var Domain: RegExp
    
    var Email: RegExp
    
    var EmailWithTLD: RegExp
    
    var IP: RegExp
    
    var IPv4: RegExp
    
    var IPv6: RegExp
    
    var Id: RegExp
    
    var Phone: RegExp
    
    var Url: RegExp
    
    var WeakDomain: RegExp
    
    var ZipCode: RegExp
  }
  object Domain {
    
    @scala.inline
    def apply(
      Domain: RegExp,
      Email: RegExp,
      EmailWithTLD: RegExp,
      IP: RegExp,
      IPv4: RegExp,
      IPv6: RegExp,
      Id: RegExp,
      Phone: RegExp,
      Url: RegExp,
      WeakDomain: RegExp,
      ZipCode: RegExp
    ): Domain = {
      val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], EmailWithTLD = EmailWithTLD.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], IPv4 = IPv4.asInstanceOf[js.Any], IPv6 = IPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], WeakDomain = WeakDomain.asInstanceOf[js.Any], ZipCode = ZipCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: RegExp): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: RegExp): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailWithTLD(value: RegExp): Self = StObject.set(x, "EmailWithTLD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIP(value: RegExp): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPv4(value: RegExp): Self = StObject.set(x, "IPv4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPv6(value: RegExp): Self = StObject.set(x, "IPv6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: RegExp): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: RegExp): Self = StObject.set(x, "Phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: RegExp): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakDomain(value: RegExp): Self = StObject.set(x, "WeakDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipCode(value: RegExp): Self = StObject.set(x, "ZipCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndPointsOnly extends StObject {
    
    var endPointsOnly: Boolean
  }
  object EndPointsOnly {
    
    @scala.inline
    def apply(endPointsOnly: Boolean): EndPointsOnly = {
      val __obj = js.Dynamic.literal(endPointsOnly = endPointsOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndPointsOnly]
    }
    
    @scala.inline
    implicit class EndPointsOnlyMutableBuilder[Self <: EndPointsOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndPointsOnly(value: Boolean): Self = StObject.set(x, "endPointsOnly", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeepArrays extends StObject {
    
    var keepArrays: js.UndefOr[Boolean] = js.undefined
  }
  object KeepArrays {
    
    @scala.inline
    def apply(): KeepArrays = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepArrays]
    }
    
    @scala.inline
    implicit class KeepArraysMutableBuilder[Self <: KeepArrays] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepArrays(value: Boolean): Self = StObject.set(x, "keepArrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepArraysUndefined: Self = StObject.set(x, "keepArrays", js.undefined)
    }
  }
}
