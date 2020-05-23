package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingStateTax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var addons: StringDictionary[String]
  var base: Plan
  var currency: Code
  var next: Addons
  var now: Addons
  var taxes: js.Array[SubscriptionPricingStateTax]
}

object Base {
  @scala.inline
  def apply(
    addons: StringDictionary[String],
    base: Plan,
    currency: Code,
    next: Addons,
    now: Addons,
    taxes: js.Array[SubscriptionPricingStateTax]
  ): Base = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

