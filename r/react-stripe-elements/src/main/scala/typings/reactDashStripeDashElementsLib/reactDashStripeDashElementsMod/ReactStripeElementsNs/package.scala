package typings
package reactDashStripeDashElementsLib.reactDashStripeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactStripeElementsNs {
  type ElementChangeResponse = stripeDashV3Lib.stripeNs.elementsNs.ElementChangeResponse
  type ElementsOptions = stripeDashV3Lib.stripeNs.elementsNs.ElementsOptions
  /**
  	 * There's a bug in @types/stripe which defines the property as
  	 * `declined_code` (with a 'd') but it's in fact `decline_code`
  	 */
  type PatchedTokenResponse = TokenResponse with reactDashStripeDashElementsLib.Anon_Error
  type SourceOptions = stripeDashV3Lib.stripeNs.SourceOptions
  type SourceResponse = stripeDashV3Lib.stripeNs.SourceResponse
  type StripeProviderProps = reactDashStripeDashElementsLib.Anon_ApiKey with (StripeProviderOptions | reactDashStripeDashElementsLib.Anon_ApiKeyStripe) with StripeProviderOptions
  type TokenOptions = stripeDashV3Lib.stripeNs.TokenOptions
  type TokenResponse = stripeDashV3Lib.stripeNs.TokenResponse
}
