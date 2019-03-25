package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementArrayFinder")
@js.native
class ElementArrayFinder protected ()
  extends protractorLib.builtElementMod.ElementArrayFinder {
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser) = this()
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser, getWebElements: js.Function0[
      js.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]]
    ]) = this()
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser, getWebElements: js.Function0[
      js.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]]
    ], locator_ : js.Any) = this()
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser, getWebElements: js.Function0[
      js.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]]
    ], locator_ : js.Any, actionResults_ : js.Promise[_]) = this()
}

