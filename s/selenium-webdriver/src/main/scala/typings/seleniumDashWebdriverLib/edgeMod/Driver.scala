package typings
package seleniumDashWebdriverLib.edgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/edge", "Driver")
@js.native
class Driver ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver {
  /**
    * This function is a no-op as file detectors are not supported by this
    * implementation.
    * @override
    */
  def setFileDetector(): scala.Unit = js.native
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
    * @param {promise.ControlFlow=} opt_flow The control flow to use, or
    *     {@code null} to use the currently active flow.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): seleniumDashWebdriverLib.edgeMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities): seleniumDashWebdriverLib.edgeMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.edgeMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.edgeMod.Driver = js.native
}

