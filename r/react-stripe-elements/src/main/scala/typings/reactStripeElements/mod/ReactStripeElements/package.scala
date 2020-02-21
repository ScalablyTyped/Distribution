package typings.reactStripeElements.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactStripeElements {
  type ElementChangeResponse = typings.stripeV3.stripe.elements.ElementChangeResponse
  type ElementsOptions = typings.stripeV3.stripe.elements.ElementsOptions
  type HTMLStripeElement = typings.stripeV3.stripe.elements.Element
  type SourceOptions = typings.stripeV3.stripe.SourceOptions
  type SourceResponse = typings.stripeV3.stripe.SourceResponse
  type StripeProviderProps = (typings.reactStripeElements.AnonApiKey with typings.reactStripeElements.mod.ReactStripeElements.StripeProviderOptions) | (typings.reactStripeElements.AnonStripe with typings.reactStripeElements.mod.ReactStripeElements.StripeProviderOptions)
  type TokenOptions = typings.stripeV3.stripe.TokenOptions with typings.reactStripeElements.AnonType
  type TokenResponse = typings.stripeV3.stripe.TokenResponse
}
