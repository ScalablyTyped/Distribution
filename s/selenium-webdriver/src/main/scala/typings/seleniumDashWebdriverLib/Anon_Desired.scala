package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Desired
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities {
  var desired: js.UndefOr[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities] = js.undefined
  var required: js.UndefOr[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities] = js.undefined
}

object Anon_Desired {
  @scala.inline
  def apply(
    desired: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = null,
    required: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = null
  ): Anon_Desired = {
    val __obj = js.Dynamic.literal()
    if (desired != null) __obj.updateDynamic("desired")(desired)
    if (required != null) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Anon_Desired]
  }
}

