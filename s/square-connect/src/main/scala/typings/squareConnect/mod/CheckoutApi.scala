package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CheckoutApi")
@js.native
/**
  * Constructs a new CheckoutApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class CheckoutApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Links a `checkoutId` to a `checkout_page_url` that customers will be directed to in order to provide their payment
    * information using a payment processing workflow hosted on connect.squareup.com.
    */
  def createCheckout(locationId: String, body: CreateCheckoutRequest): js.Promise[CreateCheckoutResponse] = js.native
}
