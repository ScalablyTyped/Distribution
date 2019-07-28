package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "WebElementPromise")
@js.native
class WebElementPromise protected ()
  extends WebElement
     with Promise[WebElement] {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(driver: WebDriver, el: js.Promise[WebElement]) = this()
}

