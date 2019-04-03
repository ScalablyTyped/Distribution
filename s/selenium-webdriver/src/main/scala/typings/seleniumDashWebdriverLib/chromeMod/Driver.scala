package typings
package seleniumDashWebdriverLib.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/chrome", "Driver")
@js.native
class Driver ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver

/* static members */
@JSImport("selenium-webdriver/chrome", "Driver")
@js.native
object Driver extends js.Object {
  /**
    * Creates a new session with the ChromeDriver.
    *
    * @param {(Capabilities|Options)=} opt_config The configuration options.
    * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
    *     a  DriverService to use for the remote end, or a preconfigured executor
    *     for an externally managed endpoint. If neither is provided, the
    *     {@linkplain ##getDefaultService default service} will be used by
    *     default.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.chromeMod.Options): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.chromeMod.Options,
    opt_service: seleniumDashWebdriverLib.httpMod.Executor
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.chromeMod.Options,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities,
    opt_service: seleniumDashWebdriverLib.httpMod.Executor
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
}

