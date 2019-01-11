package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $: js.Function1[/* search */ java.lang.String, protractorLib.builtElementMod.ElementFinder] = js.native
  @JSName("$$")
  var $$: js.Function1[/* search */ java.lang.String, protractorLib.builtElementMod.ElementArrayFinder] = js.native
  val Browser: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IBrowser = js.native
  val Button: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IButton = js.native
  var By: protractorLib.builtLocatorsMod.ProtractorBy = js.native
  val Capability: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ICapability = js.native
  var Command: js.Any = js.native
  var CommandName: js.Any = js.native
  var ExpectedConditions: protractorLib.builtExpectedConditionsMod.ProtractorExpectedConditions = js.native
  val Key: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IKey = js.native
  var browser: protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  var by: protractorLib.builtLocatorsMod.ProtractorBy = js.native
  var element: protractorLib.builtBrowserMod.ElementHelper = js.native
  var protractor: protractorLib.builtPtorMod.Ptor = js.native
  var utils: protractorLib.Anon_Firefox = js.native
}

