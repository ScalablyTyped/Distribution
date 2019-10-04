package typings.seleniumDashWebdriver.ieMod

import typings.seleniumDashWebdriver.remoteMod.DriverServiceNs.Builder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/ie", "ServiceBuilder")
@js.native
/**
  * @param {string=} opt_exe Path to the server executable to use. If omitted,
  *     the builder will attempt to locate the IEDriverServer on the system PATH.
  */
class ServiceBuilder () extends Builder {
  def this(opt_exe: String) = this()
}

