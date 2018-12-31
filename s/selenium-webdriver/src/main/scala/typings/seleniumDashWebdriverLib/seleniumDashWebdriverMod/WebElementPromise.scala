package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "WebElementPromise")
@js.native
class WebElementPromise protected ()
  extends WebElement
     with seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[WebElement] {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!promise.Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(driver: WebDriver, el: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[WebElement]) = this()
}

