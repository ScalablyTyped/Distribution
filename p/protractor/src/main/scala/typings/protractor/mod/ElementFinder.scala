package typings.protractor.mod

import typings.protractor.locatorsMod.Locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ElementFinder {
  
  @JSImport("protractor", "ElementFinder.fromWebElement_")
  @js.native
  def fromWebElement_(
    browser: typings.protractor.browserMod.ProtractorBrowser,
    webElem: typings.seleniumWebdriver.mod.WebElement
  ): typings.protractor.elementMod.ElementFinder = js.native
  @JSImport("protractor", "ElementFinder.fromWebElement_")
  @js.native
  def fromWebElement_(
    browser: typings.protractor.browserMod.ProtractorBrowser,
    webElem: typings.seleniumWebdriver.mod.WebElement,
    locator: Locator
  ): typings.protractor.elementMod.ElementFinder = js.native
}
