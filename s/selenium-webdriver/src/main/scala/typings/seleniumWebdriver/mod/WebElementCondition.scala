package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "WebElementCondition")
@js.native
class WebElementCondition protected () extends Condition[WebElement] {
  /**
    * @param {string} message A descriptive error message. Should complete the
    *     sentence 'Waiting [...]'
    * @param {function(!WebDriver): OUT} fn The condition function to
    *     evaluate on each iteration of the wait loop.
    * @constructor
    */
  def this(message: String, fn: js.Function1[/* webdriver */ WebDriver, WebElement]) = this()
  
  // add an unused private member so the compiler treats this
  // class distinct from other Conditions
  /* private */ var _nominal: Unit = js.native
}
