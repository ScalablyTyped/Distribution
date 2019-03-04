package typings
package protractorLib.builtLocatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtractorLocator extends js.Object {
  var column: js.UndefOr[js.Function1[/* index */ java.lang.String, Locator]] = js.undefined
  var row: js.UndefOr[js.Function1[/* index */ scala.Double, Locator]] = js.undefined
  @JSName("toString")
  var toString_FProtractorLocator: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  def findElementsOverride(
    driver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver,
    using: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    rootSelector: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]]
}

object ProtractorLocator {
  @scala.inline
  def apply(
    findElementsOverride: js.Function3[
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement, 
      java.lang.String, 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]]
    ],
    column: js.Function1[/* index */ java.lang.String, Locator] = null,
    row: js.Function1[/* index */ scala.Double, Locator] = null,
    toString: js.Function0[java.lang.String] = null
  ): ProtractorLocator = {
    val __obj = js.Dynamic.literal(findElementsOverride = findElementsOverride)
    if (column != null) __obj.updateDynamic("column")(column)
    if (row != null) __obj.updateDynamic("row")(row)
    if (toString != null) __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[ProtractorLocator]
  }
}

