package typings
package seleniumDashWebdriverLib.operaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/opera", "ServiceBuilder")
@js.native
/**
  * @param {string=} opt_exe Path to the server executable to use. If omitted,
  *     the builder will attempt to locate the operadriver on the current
  *     PATH.
  * @throws {Error} If provided executable does not exist, or the operadriver
  *     cannot be found on the PATH.
  */
class ServiceBuilder () extends js.Object {
  def this(opt_exe: java.lang.String) = this()
  /**
    * Creates a new DriverService using this instance's current configuration.
    * @return {!remote.DriverService} A new driver service using this instance's
    *     current configuration.
    * @throws {Error} If the driver exectuable was not specified and a default
    *     could not be found on the current PATH.
    */
  def build(): seleniumDashWebdriverLib.remoteMod.DriverService = js.native
  /**
    * Enables verbose logging.
    * @return {!ServiceBuilder} A self reference.
    */
  def enableVerboseLogging(): ServiceBuilder = js.native
  /**
    * Sets the path of the log file the driver should log to. If a log file is
    * not specified, the driver will log to stderr.
    * @param {string} path Path of the log file to use.
    * @return {!ServiceBuilder} A self reference.
    */
  def loggingTo(path: java.lang.String): ServiceBuilder = js.native
  /**
    * Defines the stdio configuration for the driver service. See
    * {@code child_process.spawn} for more information.
    * @param {(string|!Array<string|number|!stream.Stream|null|undefined>)}
    *     config The configuration to use.
    * @return {!ServiceBuilder} A self reference.
    */
  def setStdio(config: java.lang.String): ServiceBuilder = js.native
  def setStdio(config: js.Array[java.lang.String | scala.Double | _]): ServiceBuilder = js.native
  /**
    * Silence sthe drivers output.
    * @return {!ServiceBuilder} A self reference.
    */
  def silent(): ServiceBuilder = js.native
  /**
    * Sets the port to start the OperaDriver on.
    * @param {number} port The port to use, or 0 for any free port.
    * @return {!ServiceBuilder} A self reference.
    * @throws {Error} If the port is invalid.
    */
  def usingPort(port: scala.Double): ServiceBuilder = js.native
  /**
    * Defines the environment to start the server under. This settings will be
    * inherited by every browser session started by the server.
    * @param {!Object.<string, string>} env The environment to use.
    * @return {!ServiceBuilder} A self reference.
    */
  def withEnvironment(env: js.Object): ServiceBuilder = js.native
}

