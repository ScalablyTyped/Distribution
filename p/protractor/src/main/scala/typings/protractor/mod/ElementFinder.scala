package typings.protractor.mod

import typings.protractor.locatorsMod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementFinder")
@js.native
class ElementFinder protected ()
  extends typings.protractor.elementMod.ElementFinder {
  def this(
    browser_ : typings.protractor.browserMod.ProtractorBrowser,
    elementArrayFinder: typings.protractor.elementMod.ElementArrayFinder
  ) = this()
}

/* static members */
@JSImport("protractor", "ElementFinder")
@js.native
object ElementFinder extends js.Object {
  def fromWebElement_(
    browser: typings.protractor.browserMod.ProtractorBrowser,
    webElem: typings.seleniumWebdriver.mod.WebElement
  ): typings.protractor.elementMod.ElementFinder = js.native
  def fromWebElement_(
    browser: typings.protractor.browserMod.ProtractorBrowser,
    webElem: typings.seleniumWebdriver.mod.WebElement,
    locator: Locator
  ): typings.protractor.elementMod.ElementFinder = js.native
}

