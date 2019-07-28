package typings.reactDashStripeDashElements

import typings.stripeDashV3.stripeNs.HandleCardSetupOptions
import typings.stripeDashV3.stripeNs.HandleCardSetupOptionsWithoutElementsOptions
import typings.stripeDashV3.stripeNs.SetupIntentResponse
import typings.stripeDashV3.stripeNs.elementsNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ClientSecretData extends js.Object {
  def apply(clientSecret: String, data: HandleCardSetupOptionsWithoutElementsOptions): js.Promise[SetupIntentResponse] = js.native
  def apply(clientSecret: String, element: Element, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
}

