package typings
package seleniumDashWebdriverLib.remoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/remote", "DriverService")
@js.native
object DriverServiceNs extends js.Object {
  /**
       * Creates {@link DriverService} objects that manage a WebDriver server in a
       * child process.
       */
  @js.native
  class Builder protected () extends js.Object {
    /**
             * @param {string} exe Path to the executable to use. This executable must
             *     accept the `--port` flag for defining the port to start the server on.
             * @throws {Error} If the provided executable path does not exist.
             */
    def this(exe: java.lang.String) = this()
    /**
             * Define additional command line arguments to use when starting the server.
             *
             * @param {...CommandLineFlag} var_args The arguments to include.
             * @return {!THIS} A self reference.
             * @this {THIS}
             * @template THIS
             */
    def addArguments(var_args: java.lang.String*): this.type = js.native
    /**
             * Creates a new DriverService using this instance's current configuration.
             *
             * @return {!DriverService} A new driver service.
             */
    def build(): seleniumDashWebdriverLib.remoteMod.DriverService = js.native
    /**
             * Defines the environment to start the server under. This setting will be
             * inherited by every browser session started by the server. By default, the
             * server will inherit the enviroment of the current process.
             *
             * @param {(Map<string, string>|Object<string, string>|null)} env The desired
             *     environment to use, or `null` if the server should inherit the
             *     current environment.
             * @return {!DriverService.Builder} A self reference.
             */
    def setEnvironment(): this.type = js.native
    /**
             * Defines the environment to start the server under. This setting will be
             * inherited by every browser session started by the server. By default, the
             * server will inherit the enviroment of the current process.
             *
             * @param {(Map<string, string>|Object<string, string>|null)} env The desired
             *     environment to use, or `null` if the server should inherit the
             *     current environment.
             * @return {!DriverService.Builder} A self reference.
             */
    def setEnvironment(env: ScalablyTyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
    /**
             * Defines the environment to start the server under. This setting will be
             * inherited by every browser session started by the server. By default, the
             * server will inherit the enviroment of the current process.
             *
             * @param {(Map<string, string>|Object<string, string>|null)} env The desired
             *     environment to use, or `null` if the server should inherit the
             *     current environment.
             * @return {!DriverService.Builder} A self reference.
             */
    def setEnvironment(env: stdLib.Map[java.lang.String, java.lang.String]): this.type = js.native
    /**
             * Sets the host name to access the server on. If specified, the
             * {@linkplain #setLoopback() loopback} setting will be ignored.
             *
             * @param {string} hostname
             * @return {!DriverService.Builder} A self reference.
             */
    def setHostname(hostname: java.lang.String): this.type = js.native
    /**
             * Sets whether the service should be accessed at this host's loopback
             * address.
             *
             * @param {boolean} loopback
             * @return {!DriverService.Builder} A self reference.
             */
    def setLoopback(loopback: scala.Boolean): this.type = js.native
    /**
             * Sets the base path for WebDriver REST commands (e.g. "/wd/hub").
             * By default, the driver will accept commands relative to "/".
             *
             * @param {?string} basePath The base path to use, or `null` to use the
             *     default.
             * @return {!DriverService.Builder} A self reference.
             */
    def setPath(): this.type = js.native
    /**
             * Sets the base path for WebDriver REST commands (e.g. "/wd/hub").
             * By default, the driver will accept commands relative to "/".
             *
             * @param {?string} basePath The base path to use, or `null` to use the
             *     default.
             * @return {!DriverService.Builder} A self reference.
             */
    def setPath(basePath: java.lang.String): this.type = js.native
    /**
             * Sets the port to start the server on.
             *
             * @param {number} port The port to use, or 0 for any free port.
             * @return {!DriverService.Builder} A self reference.
             * @throws {Error} If an invalid port is specified.
             */
    def setPort(port: scala.Double): this.type = js.native
    /**
             * IO configuration for the spawned server process. For more information,
             * refer to the documentation of `child_process.spawn`.
             *
             * @param {StdIoOptions} config The desired IO configuration.
             * @return {!DriverService.Builder} A self reference.
             * @see https://nodejs.org/dist/latest-v4.x/docs/api/child_process.html#child_process_options_stdio
             */
    def setStdio(config: js.Any): this.type = js.native
  }
  
}

