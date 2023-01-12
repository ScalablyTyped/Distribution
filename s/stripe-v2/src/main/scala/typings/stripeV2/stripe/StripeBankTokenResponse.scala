package typings.stripeV2.stripe

import typings.stripeV2.anon.Bankname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeBankTokenResponse
  extends StObject
     with StripeTokenResponse {
  
  var bank_account: Bankname
}
object StripeBankTokenResponse {
  
  inline def apply(
    bank_account: Bankname,
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean
  ): StripeBankTokenResponse = {
    val __obj = js.Dynamic.literal(bank_account = bank_account.asInstanceOf[js.Any], client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeBankTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StripeBankTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setBank_account(value: Bankname): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
  }
}
