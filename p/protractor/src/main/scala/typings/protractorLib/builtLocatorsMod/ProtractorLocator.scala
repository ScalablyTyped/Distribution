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
    findElementsOverride: (seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement, java.lang.String) => seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]],
    column: /* index */ java.lang.String => Locator = null,
    row: /* index */ scala.Double => Locator = null,
    toString: () => java.lang.String = null
  ): ProtractorLocator = {
    val __obj = js.Dynamic.literal(findElementsOverride = js.Any.fromFunction3(findElementsOverride))
    if (column != null) __obj.updateDynamic("column")(js.Any.fromFunction1(column))
    if (row != null) __obj.updateDynamic("row")(js.Any.fromFunction1(row))
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    __obj.asInstanceOf[ProtractorLocator]
  }
}

