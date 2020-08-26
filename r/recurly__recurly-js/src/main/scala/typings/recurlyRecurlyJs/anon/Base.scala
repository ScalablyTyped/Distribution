package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingStateTax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var addons: StringDictionary[String] = js.native
  var base: Plan = js.native
  var currency: Code = js.native
  var next: Addons = js.native
  var now: Addons = js.native
  var taxes: js.Array[SubscriptionPricingStateTax] = js.native
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
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddons(value: StringDictionary[String]): Self = this.set("addons", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: Plan): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: Code): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: Addons): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNow(value: Addons): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaxesVarargs(value: SubscriptionPricingStateTax*): Self = this.set("taxes", js.Array(value :_*))
    @scala.inline
    def setTaxes(value: js.Array[SubscriptionPricingStateTax]): Self = this.set("taxes", value.asInstanceOf[js.Any])
  }
  
}

