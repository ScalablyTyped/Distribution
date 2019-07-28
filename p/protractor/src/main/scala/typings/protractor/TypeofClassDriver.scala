package typings.protractor

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumDashWebdriver.firefoxMod.Driver
import typings.seleniumDashWebdriver.firefoxMod.Options
import typings.seleniumDashWebdriver.httpMod.Executor
import typings.seleniumDashWebdriver.remoteMod.DriverService
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassDriver extends Instantiable0[Driver] {
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
    * @throws {Error} If a custom command executor is provided and the driver is
    *     configured to use the legacy FirefoxDriver from the Selenium project.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): Driver = js.native
  def createSession(opt_config: Options): Driver = js.native
  def createSession(opt_config: Options, opt_executor: Executor): Driver = js.native
  def createSession(opt_config: Options, opt_executor: DriverService): Driver = js.native
  def createSession(opt_config: Capabilities): Driver = js.native
  def createSession(opt_config: Capabilities, opt_executor: Executor): Driver = js.native
  def createSession(opt_config: Capabilities, opt_executor: DriverService): Driver = js.native
}

