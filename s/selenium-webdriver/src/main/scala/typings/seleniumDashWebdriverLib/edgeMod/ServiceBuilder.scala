package typings
package seleniumDashWebdriverLib.edgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/edge", "ServiceBuilder")
@js.native
class ServiceBuilder ()
  extends seleniumDashWebdriverLib.remoteMod.DriverServiceNs.Builder {
  /**
       * @param {string=} opt_exe Path to the server executable to use. If omitted,
       *   the builder will attempt to locate the MicrosoftEdgeDriver on the current
       *   PATH.
       * @throws {Error} If provided executable does not exist, or the
       *   MicrosoftEdgeDriver cannot be found on the PATH.
       */
  def this(opt_exe: java.lang.String) = this()
}

