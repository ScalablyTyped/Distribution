package typings.stripeV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bankname extends StObject {
    
    var bank_name: String
    
    var country: String
    
    var last4: Double
    
    var `object`: String
    
    var validated: Boolean
  }
  object Bankname {
    
    @scala.inline
    def apply(bank_name: String, country: String, last4: Double, `object`: String, validated: Boolean): Bankname = {
      val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bankname]
    }
    
    @scala.inline
    implicit class BanknameMutableBuilder[Self <: Bankname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast4(value: Double): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: String
  }
  object Message {
    
    @scala.inline
    def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
