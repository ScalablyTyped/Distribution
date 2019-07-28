package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod

import typings.react.reactMod.ComponentType
import typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElementsNs.InjectOptions
import typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElementsNs.InjectedStripeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-stripe-elements", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def injectStripe[P /* <: js.Object */](WrappedComponent: ComponentType[P with InjectedStripeProps]): ComponentType[P] = js.native
  def injectStripe[P /* <: js.Object */](WrappedComponent: ComponentType[P with InjectedStripeProps], componentOptions: InjectOptions): ComponentType[P] = js.native
}

