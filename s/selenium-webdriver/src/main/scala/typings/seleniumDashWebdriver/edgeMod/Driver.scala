package typings.seleniumDashWebdriver.edgeMod

import typings.seleniumDashWebdriver.remoteMod.DriverService
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.CreateSessionCapabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/edge", "Driver")
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
@JSImport("selenium-webdriver/edge", "Driver")
@js.native
object Driver extends js.Object {
  /**
    * Creates a new browser session for Microsoft's Edge browser.
    *
    * @param {(capabilities.Capabilities|Options)=} opt_config The configuration
    *     options.
    * @param {remote.DriverService=} opt_service The session to use; will use
    *     the {@linkplain #getDefaultService default service} by default.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): Driver = js.native
  def createSession(opt_config: CreateSessionCapabilities): Driver = js.native
  def createSession(opt_config: CreateSessionCapabilities, opt_service: DriverService): Driver = js.native
}

