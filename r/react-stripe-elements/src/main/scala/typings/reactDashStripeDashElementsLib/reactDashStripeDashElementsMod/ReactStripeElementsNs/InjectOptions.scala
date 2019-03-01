package typings
package reactDashStripeDashElementsLib.reactDashStripeDashElementsMod.ReactStripeElementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectOptions extends js.Object {
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

object InjectOptions {
  @scala.inline
  def apply(withRef: js.UndefOr[scala.Boolean] = js.undefined): InjectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[InjectOptions]
  }
}

