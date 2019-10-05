package typings.seleniumDashWebdriver.remoteMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/remote", "DriverService")
@js.native
class DriverService protected () extends js.Object {
  /**
    * @param {string} executable Path to the executable to run.
    * @param {!ServiceOptions} options Configuration options for the service.
    */
  def this(executable: String, options: ServiceOptions) = this()
  /**
    * @return {!promise.Promise<string>} A promise that resolves to
    *    the server's address.
    * @throws {Error} If the server has not been started.
    */
  def address(): js.Promise[String] = js.native
  /**
    * Returns whether the underlying process is still running. This does not take
    * into account whether the process is in the process of shutting down.
    * @return {boolean} Whether the underlying service process is running.
    */
  def isRunning(): Boolean = js.native
  /**
    * Stops the service if it is not currently running. This function will kill
    * the server immediately. To synchronize with the active control flow, use
    * {@link #stop()}.
    * @return {!promise.Promise} A promise that will be resolved when
    *     the server has been stopped.
    */
  def kill(): js.Promise[_] = js.native
  /**
    * Starts the server if it is not already running.
    * @param {number=} opt_timeoutMs How long to wait, in milliseconds, for the
    *     server to start accepting requests. Defaults to 30 seconds.
    * @return {!promise.Promise<string>} A promise that will resolve
    *     to the server's base URL when it has started accepting requests. If the
    *     timeout expires before the server has started, the promise will be
    *     rejected.
    */
  def start(): js.Promise[String] = js.native
  def start(opt_timeoutMs: Double): js.Promise[String] = js.native
}

@JSImport("selenium-webdriver/remote", "DriverService")
@js.native
object DriverService extends js.Object {
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
    def this(exe: String) = this()
    /**
      * Define additional command line arguments to use when starting the server.
      *
      * @param {...CommandLineFlag} var_args The arguments to include.
      * @return {!THIS} A self reference.
      * @this {THIS}
      * @template THIS
      */
    def addArguments(var_args: String*): this.type = js.native
    /**
      * Creates a new DriverService using this instance's current configuration.
      *
      * @return {!DriverService} A new driver service.
      */
    def build(): DriverService = js.native
    def setEnvironment(): this.type = js.native
    def setEnvironment(env: StringDictionary[String]): this.type = js.native
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
    def setEnvironment(env: Map[String, String]): this.type = js.native
    /**
      * Sets the host name to access the server on. If specified, the
      * {@linkplain #setLoopback() loopback} setting will be ignored.
      *
      * @param {string} hostname
      * @return {!DriverService.Builder} A self reference.
      */
    def setHostname(hostname: String): this.type = js.native
    /**
      * Sets whether the service should be accessed at this host's loopback
      * address.
      *
      * @param {boolean} loopback
      * @return {!DriverService.Builder} A self reference.
      */
    def setLoopback(loopback: Boolean): this.type = js.native
    def setPath(): this.type = js.native
    /**
      * Sets the base path for WebDriver REST commands (e.g. "/wd/hub").
      * By default, the driver will accept commands relative to "/".
      *
      * @param {?string} basePath The base path to use, or `null` to use the
      *     default.
      * @return {!DriverService.Builder} A self reference.
      */
    def setPath(basePath: String): this.type = js.native
    /**
      * Sets the port to start the server on.
      *
      * @param {number} port The port to use, or 0 for any free port.
      * @return {!DriverService.Builder} A self reference.
      * @throws {Error} If an invalid port is specified.
      */
    def setPort(port: Double): this.type = js.native
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

