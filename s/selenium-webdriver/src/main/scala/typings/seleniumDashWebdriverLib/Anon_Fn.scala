package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Fn extends js.Object {
  /**
    * Add a test to the current suite.
    * @param name The test name.
    * @param fn The test function, or {@code undefined} to define a pending test case.
    */
  def apply(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
    * An alias for {@link #it()} that flags the test as the only one that should
    * be run within the current suite.
    * @param {string} name The test name.
    * @param {function()=} opt_fn The test function, or `undefined` to define
    *     a pending test case.
    */
  def only(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
    * Adds a test to the current suite while suppressing it so it is not run.
    * @param name The test name.
    * @param fn The test function, or {@code undefined} to define a pending test case.
    */
  def skip(name: java.lang.String, fn: js.Function): scala.Unit = js.native
}

