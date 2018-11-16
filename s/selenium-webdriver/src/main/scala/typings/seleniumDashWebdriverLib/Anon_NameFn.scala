package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NameFn extends js.Object {
  /**
      * Registers a new test suite.
      * @param name The suite name.
      * @param fn The suite function, or {@code undefined} to define a pending test suite.
      */
  def apply(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
       * An alias for {@link #describe()} that marks the suite as exclusive,
       * suppressing all other test suites.
       * @param {string} name The suite name.
       * @param {function()=} opt_fn The suite function, or `undefined` to define
       *     a pending test suite.
       */
  def only(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
       * Defines a suppressed test suite.
       * @param name The suite name.
       * @param fn The suite function, or {@code undefined} to define a pending test suite.
       */
  def skip(name: java.lang.String, fn: js.Function): scala.Unit = js.native
}

