package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shop extends StObject {
  
  var description: String = js.native
  
  var moneyFormat: String = js.native
  
  var name: String = js.native
  
  /**
    * TODO Add types for the Shop properties below
    * PaymentSettings, ShopPolicy etc
    */
  var paymentSettings: js.Any = js.native
  
  var primaryDomain: js.Any = js.native
  
  var privacyPolicy: js.Any = js.native
  
  var refundPolicy: js.Any = js.native
  
  var termsOfService: js.Any = js.native
}
object Shop {
  
  @scala.inline
  def apply(
    description: String,
    moneyFormat: String,
    name: String,
    paymentSettings: js.Any,
    primaryDomain: js.Any,
    privacyPolicy: js.Any,
    refundPolicy: js.Any,
    termsOfService: js.Any
  ): Shop = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], moneyFormat = moneyFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentSettings = paymentSettings.asInstanceOf[js.Any], primaryDomain = primaryDomain.asInstanceOf[js.Any], privacyPolicy = privacyPolicy.asInstanceOf[js.Any], refundPolicy = refundPolicy.asInstanceOf[js.Any], termsOfService = termsOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shop]
  }
  
  @scala.inline
  implicit class ShopMutableBuilder[Self <: Shop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoneyFormat(value: String): Self = StObject.set(x, "moneyFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentSettings(value: js.Any): Self = StObject.set(x, "paymentSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryDomain(value: js.Any): Self = StObject.set(x, "primaryDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyPolicy(value: js.Any): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundPolicy(value: js.Any): Self = StObject.set(x, "refundPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsOfService(value: js.Any): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
  }
}
