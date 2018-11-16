package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "WebElementPromise")
@js.native
class WebElementPromise protected ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementPromise {
  /**
     * @param {!WebDriver} driver The parent WebDriver instance for this
     *     element.
     * @param {!promise.Promise<!WebElement>} el A promise
     *     that will resolve to the promised element.
     */
  def this(driver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, el: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]) = this()
}

