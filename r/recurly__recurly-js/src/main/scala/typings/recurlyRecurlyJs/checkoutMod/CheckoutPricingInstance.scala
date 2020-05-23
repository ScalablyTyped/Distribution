package typings.recurlyRecurlyJs.checkoutMod

import typings.recurlyRecurlyJs.pricingMod.PricingInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckoutPricingInstance
  extends PricingInstance[CheckoutPricingPromise]
     with CheckoutPricingMethods {
  def attach(element: String): Unit = js.native
  def attach(element: HTMLElement): Unit = js.native
}

