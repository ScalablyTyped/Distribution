package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupIntentResponse extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var setupIntent: js.UndefOr[stripeDashV3Lib.stripeNs.setupIntentsNs.SetupIntent] = js.undefined
}

object SetupIntentResponse {
  @scala.inline
  def apply(error: Error = null, setupIntent: stripeDashV3Lib.stripeNs.setupIntentsNs.SetupIntent = null): SetupIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (setupIntent != null) __obj.updateDynamic("setupIntent")(setupIntent)
    __obj.asInstanceOf[SetupIntentResponse]
  }
}

