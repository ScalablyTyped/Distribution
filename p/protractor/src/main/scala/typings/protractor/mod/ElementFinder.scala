package typings.protractor.mod

import typings.protractor.builtLocatorsMod.Locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", "ElementFinder")
@js.native
open class ElementFinder protected ()
  extends typings.protractor.builtElementMod.ElementFinder {
  def this(
    browser_ : typings.protractor.builtBrowserMod.ProtractorBrowser,
    elementArrayFinder: typings.protractor.builtElementMod.ElementArrayFinder
  ) = this()
}
/* static members */
object ElementFinder {
  
  @JSImport("protractor", "ElementFinder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromWebElement_(
    browser: typings.protractor.builtBrowserMod.ProtractorBrowser,
    webElem: typings.seleniumWebdriver.mod.WebElement
  ): typings.protractor.builtElementMod.ElementFinder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebElement_")(browser.asInstanceOf[js.Any], webElem.asInstanceOf[js.Any])).asInstanceOf[typings.protractor.builtElementMod.ElementFinder]
  inline def fromWebElement_(
    browser: typings.protractor.builtBrowserMod.ProtractorBrowser,
    webElem: typings.seleniumWebdriver.mod.WebElement,
    locator: Locator
  ): typings.protractor.builtElementMod.ElementFinder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebElement_")(browser.asInstanceOf[js.Any], webElem.asInstanceOf[js.Any], locator.asInstanceOf[js.Any])).asInstanceOf[typings.protractor.builtElementMod.ElementFinder]
}
