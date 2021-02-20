package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Condition")
@js.native
class Condition[T] protected () extends StObject {
  /**
    * @param {string} message A descriptive error message. Should complete the
    *     sentence 'Waiting [...]'
    * @param {function(!WebDriver): OUT} fn The condition function to
    *     evaluate on each iteration of the wait loop.
    * @constructor
    */
  def this(message: String, fn: js.Function1[/* webdriver */ WebDriver, T]) = this()
  
  /** @return {string} A description of this condition. */
  def description(): String = js.native
  
  /** @type {function(!WebDriver): OUT} */
  def fn(webdriver: WebDriver): T = js.native
}
