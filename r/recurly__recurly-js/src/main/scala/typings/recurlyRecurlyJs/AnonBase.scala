package typings.recurlyRecurlyJs

import org.scalablytyped.runtime.StringDictionary
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingStateTax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var addons: StringDictionary[String]
  var base: AnonPlan
  var currency: AnonCode
  var next: AnonAddons
  var now: AnonAddons
  var taxes: js.Array[SubscriptionPricingStateTax]
}

object AnonBase {
  @scala.inline
  def apply(
    addons: StringDictionary[String],
    base: AnonPlan,
    currency: AnonCode,
    next: AnonAddons,
    now: AnonAddons,
    taxes: js.Array[SubscriptionPricingStateTax]
  ): AnonBase = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase]
  }
}

