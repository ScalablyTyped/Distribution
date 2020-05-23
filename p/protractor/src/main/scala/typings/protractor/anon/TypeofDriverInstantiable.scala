package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.seleniumWebdriver.chromeMod.Driver
import typings.seleniumWebdriver.chromeMod.Options
import typings.seleniumWebdriver.httpMod.Executor
import typings.seleniumWebdriver.mod.CreateSessionCapabilities
import typings.seleniumWebdriver.remoteMod.DriverService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDriverInstantiable extends Instantiable0[Driver] {
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

