package typings
package reactDashStripeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ClientSecretData extends js.Object {
  def apply(
    clientSecret: java.lang.String,
    data: stripeDashV3Lib.stripeNs.HandleCardSetupOptionsWithoutElementsOptions
  ): js.Promise[stripeDashV3Lib.stripeNs.SetupIntentResponse] = js.native
  def apply(
    clientSecret: java.lang.String,
    element: stripeDashV3Lib.stripeNs.elementsNs.Element,
    data: stripeDashV3Lib.stripeNs.HandleCardSetupOptions
  ): js.Promise[stripeDashV3Lib.stripeNs.SetupIntentResponse] = js.native
}

