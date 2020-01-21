package typings.protractor.locatorsMod

import typings.seleniumWebdriver.mod.WebDriver
import typings.seleniumWebdriver.mod.WebElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtractorLocator extends js.Object {
  var column: js.UndefOr[js.Function1[/* index */ String, Locator]] = js.undefined
  var row: js.UndefOr[js.Function1[/* index */ Double, Locator]] = js.undefined
  @JSName("toString")
  var toString_FProtractorLocator: js.UndefOr[js.Function0[String]] = js.undefined
  def findElementsOverride(driver: WebDriver, using: WebElement, rootSelector: String): js.Promise[js.Array[WebElement]]
}

object ProtractorLocator {
  @scala.inline
  def apply(
    findElementsOverride: (WebDriver, WebElement, String) => js.Promise[js.Array[WebElement]],
    column: /* index */ String => Locator = null,
    row: /* index */ Double => Locator = null,
    toString: () => String = null
  ): ProtractorLocator = {
    val __obj = js.Dynamic.literal(findElementsOverride = js.Any.fromFunction3(findElementsOverride))
    if (column != null) __obj.updateDynamic("column")(js.Any.fromFunction1(column))
    if (row != null) __obj.updateDynamic("row")(js.Any.fromFunction1(row))
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    __obj.asInstanceOf[ProtractorLocator]
  }
}

