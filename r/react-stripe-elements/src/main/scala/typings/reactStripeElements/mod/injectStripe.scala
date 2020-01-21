package typings.reactStripeElements.mod

import typings.react.mod.ComponentType
import typings.reactStripeElements.mod.ReactStripeElements.InjectOptions
import typings.reactStripeElements.mod.ReactStripeElements.InjectedStripeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-stripe-elements", "injectStripe")
@js.native
object injectStripe extends js.Object {
  def apply[P /* <: js.Object */](WrappedComponent: ComponentType[P with InjectedStripeProps]): ComponentType[P] = js.native
  def apply[P /* <: js.Object */](WrappedComponent: ComponentType[P with InjectedStripeProps], componentOptions: InjectOptions): ComponentType[P] = js.native
}

