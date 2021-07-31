package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.errorMod.RecurlyError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object giftCardMod {
  
  type Done = js.Function2[/* error */ RecurlyError, /* result */ GiftCardResult, Unit]
  
  type GiftCard = js.Function2[/* giftCardOptions */ GiftCardOptions, /* done */ Done, Unit]
  
  trait GiftCardOptions extends StObject {
    
    var code: String
  }
  object GiftCardOptions {
    
    @scala.inline
    def apply(code: String): GiftCardOptions = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[GiftCardOptions]
    }
    
    @scala.inline
    implicit class GiftCardOptionsMutableBuilder[Self <: GiftCardOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait GiftCardResult extends StObject {
    
    var currency: String
    
    var unit_amount: Double
  }
  object GiftCardResult {
    
    @scala.inline
    def apply(currency: String, unit_amount: Double): GiftCardResult = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], unit_amount = unit_amount.asInstanceOf[js.Any])
      __obj.asInstanceOf[GiftCardResult]
    }
    
    @scala.inline
    implicit class GiftCardResultMutableBuilder[Self <: GiftCardResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit_amount(value: Double): Self = StObject.set(x, "unit_amount", value.asInstanceOf[js.Any])
    }
  }
}
