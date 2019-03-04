package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementFinder")
@js.native
class ElementFinder protected ()
  extends protractorLib.builtElementMod.ElementFinder {
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser, elementArrayFinder: protractorLib.builtElementMod.ElementArrayFinder) = this()
}

/* static members */
@JSImport("protractor", "ElementFinder")
@js.native
object ElementFinder extends js.Object {
  def fromWebElement_(
    browser: protractorLib.builtBrowserMod.ProtractorBrowser,
    webElem: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
  ): protractorLib.builtElementMod.ElementFinder = js.native
  def fromWebElement_(
    browser: protractorLib.builtBrowserMod.ProtractorBrowser,
    webElem: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    locator: protractorLib.builtLocatorsMod.Locator
  ): protractorLib.builtElementMod.ElementFinder = js.native
}

