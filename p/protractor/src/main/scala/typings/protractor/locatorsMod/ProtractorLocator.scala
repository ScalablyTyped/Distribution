package typings.protractor.locatorsMod

import typings.seleniumWebdriver.mod.WebDriver
import typings.seleniumWebdriver.mod.WebElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtractorLocator extends js.Object {
  var column: js.UndefOr[js.Function1[/* index */ String, Locator]] = js.native
  var row: js.UndefOr[js.Function1[/* index */ Double, Locator]] = js.native
  @JSName("toString")
  var toString_FProtractorLocator: js.UndefOr[js.Function0[String]] = js.native
  def findElementsOverride(driver: WebDriver, using: WebElement, rootSelector: String): js.Promise[js.Array[WebElement]] = js.native
}

object ProtractorLocator {
  @scala.inline
  def apply(findElementsOverride: (WebDriver, WebElement, String) => js.Promise[js.Array[WebElement]]): ProtractorLocator = {
    val __obj = js.Dynamic.literal(findElementsOverride = js.Any.fromFunction3(findElementsOverride))
    __obj.asInstanceOf[ProtractorLocator]
  }
  @scala.inline
  implicit class ProtractorLocatorOps[Self <: ProtractorLocator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindElementsOverride(value: (WebDriver, WebElement, String) => js.Promise[js.Array[WebElement]]): Self = this.set("findElementsOverride", js.Any.fromFunction3(value))
    @scala.inline
    def setColumn(value: /* index */ String => Locator): Self = this.set("column", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setRow(value: /* index */ Double => Locator): Self = this.set("row", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
  
}

