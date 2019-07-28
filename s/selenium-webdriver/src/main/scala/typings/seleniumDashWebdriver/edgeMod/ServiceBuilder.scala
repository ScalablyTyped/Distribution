package typings.seleniumDashWebdriver.edgeMod

import typings.seleniumDashWebdriver.remoteMod.DriverServiceNs.Builder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/edge", "ServiceBuilder")
@js.native
/**
  * @param {string=} opt_exe Path to the server executable to use. If omitted,
  *   the builder will attempt to locate the MicrosoftEdgeDriver on the current
  *   PATH.
  * @throws {Error} If provided executable does not exist, or the
  *   MicrosoftEdgeDriver cannot be found on the PATH.
  */
class ServiceBuilder () extends Builder {
  def this(opt_exe: String) = this()
}

