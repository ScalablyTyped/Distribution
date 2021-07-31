package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeCardTokenResponse
  extends StObject
     with StripeTokenResponse {
  
  var card: StripeCard
}
object StripeCardTokenResponse {
  
  @scala.inline
  def apply(
    card: StripeCard,
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean
  ): StripeCardTokenResponse = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCardTokenResponse]
  }
  
  @scala.inline
  implicit class StripeCardTokenResponseMutableBuilder[Self <: StripeCardTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: StripeCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
  }
}
