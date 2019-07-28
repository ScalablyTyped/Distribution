package typings.protractor

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumDashWebdriver.chromeMod.Driver
import typings.seleniumDashWebdriver.chromeMod.Options
import typings.seleniumDashWebdriver.httpMod.Executor
import typings.seleniumDashWebdriver.remoteMod.DriverService
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.CreateSessionCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassDriverCreateSession extends Instantiable0[Driver] {
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
  def createSession(): Driver = js.native
  def createSession(opt_config: Options): Driver = js.native
  def createSession(opt_config: Options, opt_service: Executor): Driver = js.native
  def createSession(opt_config: Options, opt_service: DriverService): Driver = js.native
  def createSession(opt_config: CreateSessionCapabilities): Driver = js.native
  def createSession(opt_config: CreateSessionCapabilities, opt_service: Executor): Driver = js.native
  def createSession(opt_config: CreateSessionCapabilities, opt_service: DriverService): Driver = js.native
}

