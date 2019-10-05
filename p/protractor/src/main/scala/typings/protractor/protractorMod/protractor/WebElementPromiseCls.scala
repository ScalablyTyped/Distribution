package typings.protractor.protractorMod.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "protractor.WebElementPromise")
@js.native
class WebElementPromiseCls protected ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementPromise {
  /**
    * @param {!WebDriver} driver The parent WebDriver instance for this
    *     element.
    * @param {!Promise<!WebElement>} el A promise
    *     that will resolve to the promised element.
    */
  def this(
    driver: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    el: js.Promise[typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement]
  ) = this()
}

