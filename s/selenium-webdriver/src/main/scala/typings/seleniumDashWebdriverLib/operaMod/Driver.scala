package typings
package seleniumDashWebdriverLib.operaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/opera", "Driver")
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

@JSImport("selenium-webdriver/opera", "Driver")
@js.native
object Driver extends js.Object {
  /**
    * Creates a new session for Opera.
    *
    * @param {(capabilities.Capabilities|Options)=} opt_config The configuration
    *     options.
    * @param {remote.DriverService=} opt_service The session to use; will use
    *     the {@link getDefaultService default service} by default.
    * @param {promise.ControlFlow=} opt_flow The control flow to use,
    *     or {@code null} to use the currently active flow.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): seleniumDashWebdriverLib.operaMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.operaMod.Options): seleniumDashWebdriverLib.operaMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.operaMod.Options,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.operaMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.operaMod.Options,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.operaMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.operaMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.operaMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.operaMod.Driver = js.native
}

