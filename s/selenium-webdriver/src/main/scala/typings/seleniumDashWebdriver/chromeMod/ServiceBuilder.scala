package typings.seleniumDashWebdriver.chromeMod

import typings.seleniumDashWebdriver.remoteMod.DriverService.Builder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/chrome", "ServiceBuilder")
@js.native
/**
  * @param {string=} opt_exe Path to the server executable to use. If omitted,
  *     the builder will attempt to locate the chromedriver on the current
  *     PATH.
  * @throws {Error} If provided executable does not exist, or the chromedriver
  *     cannot be found on the PATH.
  * @constructor
  */
class ServiceBuilder () extends Builder {
  def this(opt_exe: String) = this()
  /**
    * Enables verbose logging.
    * @return {!ServiceBuilder} A self reference.
    */
  def enableVerboseLogging(): this.type = js.native
  /**
    * Sets the path of the log file the driver should log to. If a log file is
    * not specified, the driver will log to stderr.
    * @param {string} path Path of the log file to use.
    * @return {!ServiceBuilder} A self reference.
    */
  def loggingTo(path: String): this.type = js.native
  /**
    * Sets which port adb is listening to. _The ChromeDriver will connect to adb
    * if an {@linkplain Options#androidPackage Android session} is requested, but
    * adb **must** be started beforehand._
    *
    * @param {number} port Which port adb is running on.
    * @return {!ServiceBuilder} A self reference.
    */
  def setAdbPort(port: Double): this.type = js.native
  /**
    * Sets the number of threads the driver should use to manage HTTP requests.
    * By default, the driver will use 4 threads.
    * @param {number} n The number of threads to use.
    * @return {!ServiceBuilder} A self reference.
    */
  def setNumHttpThreads(n: Double): this.type = js.native
}

