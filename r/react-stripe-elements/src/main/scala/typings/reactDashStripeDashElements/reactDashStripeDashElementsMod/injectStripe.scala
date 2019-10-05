package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod

import typings.react.reactMod.ComponentType
import typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements.InjectOptions
import typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements.InjectedStripeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-stripe-elements", "injectStripe")
@js.native
object injectStripe extends js.Object {
  def apply[P /* <: js.Object */](WrappedComponent: ComponentType[P with InjectedStripeProps]): ComponentType[P] = js.native
  def apply[P /* <: js.Object */](WrappedComponent: ComponentType[P with InjectedStripeProps], componentOptions: InjectOptions): ComponentType[P] = js.native
}

