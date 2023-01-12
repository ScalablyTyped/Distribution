package typings.shippo.mod.Shippo

import typings.shippo.shippoStrings.BESTVALUE
import typings.shippo.shippoStrings.CHEAPEST
import typings.shippo.shippoStrings.FASTEST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://goshippo.com/docs/reference#rates
trait Rate
  extends StObject
     with Metadata {
  
  var amount: /* template literal string: ${number} */ String
  
  var amount_local: /* template literal string: ${number} */ String
  
  var attributes: js.Array[CHEAPEST | FASTEST | BESTVALUE]
  
  var carrier_account: String
  
  var currency: String
  
  var currency_local: String
  
  var duration_terms: String
  
  var estimated_days: /* template literal string: ${number} */ String
  
  var messages: js.Array[Message]
  
  var provider: String
  
  var provider_image_200: String
  
  var provider_image_75: String
  
  var servicelevel: ServiceLevel
  
  var test: Boolean
  
  var zone: String
}
object Rate {
  
  inline def apply(
    amount: /* template literal string: ${number} */ String,
    amount_local: /* template literal string: ${number} */ String,
    attributes: js.Array[CHEAPEST | FASTEST | BESTVALUE],
    carrier_account: String,
    currency: String,
    currency_local: String,
    duration_terms: String,
    estimated_days: /* template literal string: ${number} */ String,
    messages: js.Array[Message],
    object_created: String,
    object_id: String,
    object_owner: String,
    object_updated: String,
    provider: String,
    provider_image_200: String,
    provider_image_75: String,
    servicelevel: ServiceLevel,
    test: Boolean,
    zone: String
  ): Rate = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_local = amount_local.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], carrier_account = carrier_account.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], currency_local = currency_local.asInstanceOf[js.Any], duration_terms = duration_terms.asInstanceOf[js.Any], estimated_days = estimated_days.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], provider_image_200 = provider_image_200.asInstanceOf[js.Any], provider_image_75 = provider_image_75.asInstanceOf[js.Any], servicelevel = servicelevel.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rate] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmount_local(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "amount_local", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: js.Array[CHEAPEST | FASTEST | BESTVALUE]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: (CHEAPEST | FASTEST | BESTVALUE)*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCarrier_account(value: String): Self = StObject.set(x, "carrier_account", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrency_local(value: String): Self = StObject.set(x, "currency_local", value.asInstanceOf[js.Any])
    
    inline def setDuration_terms(value: String): Self = StObject.set(x, "duration_terms", value.asInstanceOf[js.Any])
    
    inline def setEstimated_days(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "estimated_days", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProvider_image_200(value: String): Self = StObject.set(x, "provider_image_200", value.asInstanceOf[js.Any])
    
    inline def setProvider_image_75(value: String): Self = StObject.set(x, "provider_image_75", value.asInstanceOf[js.Any])
    
    inline def setServicelevel(value: ServiceLevel): Self = StObject.set(x, "servicelevel", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
