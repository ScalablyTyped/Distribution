package typings
package seleniumDashWebdriverLib.firefoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/firefox", "ServiceBuilder")
@js.native
class ServiceBuilder ()
  extends seleniumDashWebdriverLib.remoteMod.DriverServiceNs.Builder {
  /**
       * @param {string=} opt_exe Path to the server executable to use. If omitted,
       *     the builder will attempt to locate the geckodriver on the system PATH.
       */
  def this(opt_exe: java.lang.String) = this()
  /**
       * Enables verbose logging.
       *
       * @param {boolean=} opt_trace Whether to enable trace-level logging. By
       *     default, only debug logging is enabled.
       * @return {!ServiceBuilder} A self reference.
       */
  def enableVerboseLogging(): this.type = js.native
  /**
       * Enables verbose logging.
       *
       * @param {boolean=} opt_trace Whether to enable trace-level logging. By
       *     default, only debug logging is enabled.
       * @return {!ServiceBuilder} A self reference.
       */
  def enableVerboseLogging(opt_trace: scala.Boolean): this.type = js.native
  /**
       * Sets the path to the executable Firefox binary that the geckodriver should
       * use. If this method is not called, this builder will attempt to locate
       * Firefox in the default installation location for the current platform.
       *
       * @param {(string|!Binary)} binary Path to the executable Firefox binary to use.
       * @return {!ServiceBuilder} A self reference.
       * @see Binary#locate()
       */
  def setFirefoxBinary(binary: java.lang.String): this.type = js.native
  /**
       * Sets the path to the executable Firefox binary that the geckodriver should
       * use. If this method is not called, this builder will attempt to locate
       * Firefox in the default installation location for the current platform.
       *
       * @param {(string|!Binary)} binary Path to the executable Firefox binary to use.
       * @return {!ServiceBuilder} A self reference.
       * @see Binary#locate()
       */
  def setFirefoxBinary(binary: Binary): this.type = js.native
}

