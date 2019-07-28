package typings.seleniumDashWebdriver.ieMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/ie", "Driver")
@js.native
class Driver () extends WebDriver {
  /**
    * This function is a no-op as file detectors are not supported by this
    * implementation.
    * @override
    */
  def setFileDetector(): Unit = js.native
}

/* static members */
@JSImport("selenium-webdriver/ie", "Driver")
@js.native
object Driver extends js.Object {
  /**
    * Creates a new session for Microsoft's Internet Explorer.
    *
    * @param {(capabilities.Capabilities|Options)=} opt_config The configuration
    *     options.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): Driver = js.native
  def createSession(opt_config: Options): Driver = js.native
  def createSession(opt_config: Capabilities): Driver = js.native
}

