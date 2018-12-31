package typings
package seleniumDashWebdriverLib.firefoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/firefox", "Binary")
@js.native
/**
  * @param {string=} opt_exe Path to the Firefox binary to use. If not
  *     specified, will attempt to locate Firefox on the current system.
  * @constructor
  */
class Binary () extends js.Object {
  def this(opt_exe: java.lang.String) = this()
  /**
    * Add arguments to the command line used to start Firefox.
    * @param {...(string|!Array.<string>)} var_args Either the arguments to add as
    *     varargs, or the arguments as an array.
    */
  def addArguments(var_args: java.lang.String*): scala.Unit = js.native
  /**
    * Kills the managed Firefox process.
    * @return {!promise.Promise} A promise for when the process has terminated.
    */
  def kill(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
    * Launches Firefox and eturns a promise that will be fulfilled when the process
    * terminates.
    * @param {string} profile Path to the profile directory to use.
    * @return {!promise.Promise.<!exec.Result>} A promise for the process result.
    * @throws {Error} If this instance has already been started.
    */
  def launch(profile: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
}

