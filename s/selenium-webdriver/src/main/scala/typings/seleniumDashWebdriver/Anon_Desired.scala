package typings.seleniumDashWebdriver

import typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.CreateSessionCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Desired extends CreateSessionCapabilities {
  var desired: js.UndefOr[Capabilities] = js.undefined
  var required: js.UndefOr[Capabilities] = js.undefined
}

object Anon_Desired {
  @scala.inline
  def apply(desired: Capabilities = null, required: Capabilities = null): Anon_Desired = {
    val __obj = js.Dynamic.literal()
    if (desired != null) __obj.updateDynamic("desired")(desired.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Desired]
  }
}

