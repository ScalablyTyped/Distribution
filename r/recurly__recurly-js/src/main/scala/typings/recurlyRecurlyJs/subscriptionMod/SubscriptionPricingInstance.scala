package typings.recurlyRecurlyJs.subscriptionMod

import typings.recurlyRecurlyJs.pricingMod.PricingInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionPricingInstance
  extends PricingInstance[SubscriptionPricingPromise]
     with SubscriptionPricingMethods {
  def attach(element: String): Unit = js.native
  def attach(element: HTMLElement): Unit = js.native
}

