package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Executor")
@js.native
class Executor () extends js.Object {
  /**
     * Executes the given {@code command}. If there is an error executing the
     * command, the provided callback will be invoked with the offending error.
     * Otherwise, the callback will be invoked with a null Error and non-null
     * response object.
     *
     * @param {!Command} command The command to execute.
     * @return {!promise.Promise<?>} A promise that will be fulfilled with
     *     the command result.
     */
  def execute(command: Command): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
}

