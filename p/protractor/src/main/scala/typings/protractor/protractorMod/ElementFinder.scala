package typings.protractor.protractorMod

import typings.protractor.builtLocatorsMod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementFinder")
@js.native
class ElementFinder protected ()
  extends typings.protractor.builtElementMod.ElementFinder {
  def this(
    browser_ : typings.protractor.builtBrowserMod.ProtractorBrowser,
    elementArrayFinder: typings.protractor.builtElementMod.ElementArrayFinder
  ) = this()
}

/* static members */
@JSImport("protractor", "ElementFinder")
@js.native
object ElementFinder extends js.Object {
  def fromWebElement_(
    browser: typings.protractor.builtBrowserMod.ProtractorBrowser,
    webElem: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
  ): typings.protractor.builtElementMod.ElementFinder = js.native
  def fromWebElement_(
    browser: typings.protractor.builtBrowserMod.ProtractorBrowser,
    webElem: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement,
    locator: Locator
  ): typings.protractor.builtElementMod.ElementFinder = js.native
}

