package typings.recurlyRecurlyJs.checkoutMod

import typings.recurlyRecurlyJs.pricingMod.PricingInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckoutPricingInstance
  extends PricingInstance[CheckoutPricingPromise]
     with CheckoutPricingMethods {
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-checkoutpricingattach|CheckoutPricing.attach}
    */
  def attach(element: String): Unit = js.native
  def attach(element: HTMLElement): Unit = js.native
}
