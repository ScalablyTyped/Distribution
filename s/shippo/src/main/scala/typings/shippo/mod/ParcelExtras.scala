package typings.shippo.mod

import typings.shippo.mod.ParcelExtras.COD
import typings.shippo.mod.ParcelExtras.COD.PaymentMethod
import typings.shippo.mod.ParcelExtras.Insurance
import typings.shippo.mod.ParcelExtras.Insurance.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParcelExtras extends StObject {
  
  var COD: js.UndefOr[COD] = js.undefined
  
  var insurance: js.UndefOr[Insurance] = js.undefined
}
object ParcelExtras {
  
  inline def apply(): ParcelExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParcelExtras]
  }
  
  trait COD extends StObject {
    
    var amount: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var payment_method: js.UndefOr[PaymentMethod] = js.undefined
  }
  object COD {
    
    inline def apply(): COD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[COD]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: COD] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setPayment_method(value: PaymentMethod): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.shippo.shippoStrings.SECURED_FUNDS
      - typings.shippo.shippoStrings.CASH
      - typings.shippo.shippoStrings.ANY
    */
    trait PaymentMethod extends StObject
    object PaymentMethod {
      
      inline def ANY: typings.shippo.shippoStrings.ANY = "ANY".asInstanceOf[typings.shippo.shippoStrings.ANY]
      
      inline def CASH: typings.shippo.shippoStrings.CASH = "CASH".asInstanceOf[typings.shippo.shippoStrings.CASH]
      
      inline def SECURED_FUNDS: typings.shippo.shippoStrings.SECURED_FUNDS = "SECURED_FUNDS".asInstanceOf[typings.shippo.shippoStrings.SECURED_FUNDS]
    }
  }
  
  trait Insurance extends StObject {
    
    var amount: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
  }
  object Insurance {
    
    inline def apply(): Insurance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Insurance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Insurance] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.shippo.shippoStrings.FEDEX
      - typings.shippo.shippoStrings.UPS
    */
    trait Provider extends StObject
    object Provider {
      
      inline def FEDEX: typings.shippo.shippoStrings.FEDEX = "FEDEX".asInstanceOf[typings.shippo.shippoStrings.FEDEX]
      
      inline def UPS: typings.shippo.shippoStrings.UPS = "UPS".asInstanceOf[typings.shippo.shippoStrings.UPS]
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParcelExtras] (val x: Self) extends AnyVal {
    
    inline def setCOD(value: COD): Self = StObject.set(x, "COD", value.asInstanceOf[js.Any])
    
    inline def setCODUndefined: Self = StObject.set(x, "COD", js.undefined)
    
    inline def setInsurance(value: Insurance): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
  }
}
