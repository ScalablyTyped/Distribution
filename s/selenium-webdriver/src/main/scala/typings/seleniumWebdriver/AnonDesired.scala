package typings.seleniumWebdriver

import typings.seleniumWebdriver.capabilitiesMod.Capabilities
import typings.seleniumWebdriver.mod.CreateSessionCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDesired extends CreateSessionCapabilities {
  var desired: js.UndefOr[Capabilities] = js.undefined
  var required: js.UndefOr[Capabilities] = js.undefined
}

object AnonDesired {
  @scala.inline
  def apply(desired: Capabilities = null, required: Capabilities = null): AnonDesired = {
    val __obj = js.Dynamic.literal()
    if (desired != null) __obj.updateDynamic("desired")(desired.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDesired]
  }
}

