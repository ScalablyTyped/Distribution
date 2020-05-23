package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.capabilitiesMod.Capabilities
import typings.seleniumWebdriver.mod.CreateSessionCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Desired extends CreateSessionCapabilities {
  var desired: js.UndefOr[Capabilities] = js.undefined
  var required: js.UndefOr[Capabilities] = js.undefined
}

object Desired {
  @scala.inline
  def apply(desired: Capabilities = null, required: Capabilities = null): Desired = {
    val __obj = js.Dynamic.literal()
    if (desired != null) __obj.updateDynamic("desired")(desired.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desired]
  }
}

