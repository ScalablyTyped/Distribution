package typings
package seleniumDashWebdriverLib.firefoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/firefox", "Driver")
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
@JSImport("selenium-webdriver/firefox", "Driver")
@js.native
object Driver extends js.Object {
  /**
    * Creates a new Firefox session.
    *
    * @param {(Options|capabilities.Capabilities|Object)=} opt_config The
    *    configuration options for this driver, specified as either an
    *    {@link Options} or {@link capabilities.Capabilities}, or as a raw hash
    *    object.
    * @param {(http.Executor|remote.DriverService)=} opt_executor Either a
    *   pre-configured command executor to use for communicating with an
    *   externally managed remote end (which is assumed to already be running),
    *   or the `DriverService` to use to start the geckodriver in a child
    *   process.
    *
    *   If an executor is provided, care should e taken not to use reuse it with
    *   other clients as its internal command mappings will be updated to support
    *   Firefox-specific commands.
    *
    *   _This parameter may only be used with Mozilla's GeckoDriver._
    *
    * @param {promise.ControlFlow=} opt_flow The flow to
    *     schedule commands through. Defaults to the active flow object.
    * @throws {Error} If a custom command executor is provided and the driver is
    *     configured to use the legacy FirefoxDriver from the Selenium project.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.firefoxMod.Options): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.firefoxMod.Options,
    opt_executor: seleniumDashWebdriverLib.httpMod.Executor
  ): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.firefoxMod.Options,
    opt_executor: seleniumDashWebdriverLib.httpMod.Executor,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.firefoxMod.Options,
    opt_executor: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.firefoxMod.Options,
    opt_executor: seleniumDashWebdriverLib.remoteMod.DriverService,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities,
    opt_executor: seleniumDashWebdriverLib.httpMod.Executor
  ): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities,
    opt_executor: seleniumDashWebdriverLib.httpMod.Executor,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities,
    opt_executor: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities,
    opt_executor: seleniumDashWebdriverLib.remoteMod.DriverService,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.firefoxMod.Driver = js.native
}

