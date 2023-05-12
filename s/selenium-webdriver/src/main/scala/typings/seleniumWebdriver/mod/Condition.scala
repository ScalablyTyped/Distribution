package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "Condition")
@js.native
open class Condition[T] protected () extends StObject {
  /**
    * @param {string} message A descriptive error message. Should complete the
    *     sentence 'Waiting [...]'
    * @param {function(!WebDriver): OUT} fn The condition function to
    *     evaluate on each iteration of the wait loop.
    */
  def this(message: String, fn: ConditionFn[T]) = this()
  
  /** @return {string} A description of this condition. */
  def description(): String = js.native
  
  def fn(webdriver: WebDriver): ConditionFn[T] = js.native
}
