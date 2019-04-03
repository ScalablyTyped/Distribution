package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Condition")
@js.native
class Condition[T] protected () extends js.Object {
  /**
    * @param {string} message A descriptive error message. Should complete the
    *     sentence 'Waiting [...]'
    * @param {function(!WebDriver): OUT} fn The condition function to
    *     evaluate on each iteration of the wait loop.
    * @constructor
    */
  def this(message: java.lang.String, fn: js.Function1[/* webdriver */ WebDriver, T]) = this()
  /** @return {string} A description of this condition. */
  def description(): java.lang.String = js.native
  /** @type {function(!WebDriver): OUT} */
  def fn(webdriver: WebDriver): T = js.native
}

