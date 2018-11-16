package typings
package seleniumDashWebdriverLib.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/chrome", "Driver")
@js.native
class Driver ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver

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
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(opt_config: seleniumDashWebdriverLib.chromeMod.Options): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(
    opt_config: seleniumDashWebdriverLib.chromeMod.Options,
    opt_service: seleniumDashWebdriverLib.httpMod.Executor
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(
    opt_config: seleniumDashWebdriverLib.chromeMod.Options,
    opt_service: seleniumDashWebdriverLib.httpMod.Executor,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(
    opt_config: seleniumDashWebdriverLib.chromeMod.Options,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(
    opt_config: seleniumDashWebdriverLib.chromeMod.Options,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities,
    opt_service: seleniumDashWebdriverLib.httpMod.Executor
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities,
    opt_service: seleniumDashWebdriverLib.httpMod.Executor,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
  /**
       * Creates a new session with the ChromeDriver.
       *
       * @param {(Capabilities|Options)=} opt_config The configuration options.
       * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
       *     a  DriverService to use for the remote end, or a preconfigured executor
       *     for an externally managed endpoint. If neither is provided, the
       *     {@linkplain ##getDefaultService default service} will be used by
       *     default.
       * @param {promise.ControlFlow=} opt_flow The control flow to use, or `null`
       *     to use the currently active flow.
       * @return {!Driver} A new driver instance.
       */
  def createSession(
    opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.CreateSessionCapabilities,
    opt_service: seleniumDashWebdriverLib.remoteMod.DriverService,
    opt_flow: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.ControlFlow
  ): seleniumDashWebdriverLib.chromeMod.Driver = js.native
}

