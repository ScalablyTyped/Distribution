package typings.seleniumDashWebdriver.remoteMod

import typings.seleniumDashWebdriver.remoteMod.SeleniumServerNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/remote", "SeleniumServer")
@js.native
class SeleniumServer protected () extends DriverService {
  /**
    * @param {string} jar Path to the Selenium server jar.
    * @param {SeleniumServer.Options=} opt_options Configuration options for the
    *     server.
    * @throws {Error} If the path to the Selenium jar is not specified or if an
    *     invalid port is specified.
    **/
  def this(jar: String) = this()
  def this(jar: String, opt_options: Options) = this()
}

