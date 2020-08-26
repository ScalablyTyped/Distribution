package typings.reactStripeElements.mod.ReactStripeElements

import typings.stripeV3.stripe.elements.Elements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedStripeProps extends js.Object {
  var elements: Elements | Null = js.native
  var stripe: StripeProps | Null = js.native
}

object InjectedStripeProps {
  @scala.inline
  def apply(): InjectedStripeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectedStripeProps]
  }
  @scala.inline
  implicit class InjectedStripePropsOps[Self <: InjectedStripeProps] (val x: Self) extends AnyVal {
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
    def setElements(value: Elements): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementsNull: Self = this.set("elements", null)
    @scala.inline
    def setStripe(value: StripeProps): Self = this.set("stripe", value.asInstanceOf[js.Any])
    @scala.inline
    def setStripeNull: Self = this.set("stripe", null)
  }
  
}

