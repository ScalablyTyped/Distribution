package typings
package seleniumDashWebdriverLib.remoteMod

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
  def this(executable: java.lang.String, options: ServiceOptions) = this()
  /**
    * @return {!promise.Promise<string>} A promise that resolves to
    *    the server's address.
    * @throws {Error} If the server has not been started.
    */
  def address(): js.Promise[java.lang.String] = js.native
  /**
    * Returns whether the underlying process is still running. This does not take
    * into account whether the process is in the process of shutting down.
    * @return {boolean} Whether the underlying service process is running.
    */
  def isRunning(): scala.Boolean = js.native
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
  def start(): js.Promise[java.lang.String] = js.native
  def start(opt_timeoutMs: scala.Double): js.Promise[java.lang.String] = js.native
}

