package typings.seleniumWebdriver.ieMod

import typings.seleniumWebdriver.remoteMod.DriverService.Builder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver/ie", "ServiceBuilder")
@js.native
/**
  * @param {string=} opt_exe Path to the server executable to use. If omitted,
  *     the builder will attempt to locate the IEDriverServer on the system PATH.
  */
class ServiceBuilder () extends Builder {
  def this(opt_exe: String) = this()
}
