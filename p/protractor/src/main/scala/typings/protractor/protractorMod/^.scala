package typings.protractor.protractorMod

import typings.protractor.builtBrowserMod.ElementHelper
import typings.seleniumDashWebdriver.libInputMod.IKey
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.IBrowser
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.ICapability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $: js.Function1[/* search */ String, typings.protractor.builtElementMod.ElementFinder] = js.native
  @JSName("$$")
  var $$: js.Function1[/* search */ String, typings.protractor.builtElementMod.ElementArrayFinder] = js.native
  val Browser: IBrowser = js.native
  var By: typings.protractor.builtLocatorsMod.ProtractorBy = js.native
  val Capability: ICapability = js.native
  var Command: js.Any = js.native
  var CommandName: js.Any = js.native
  var ExpectedConditions: typings.protractor.builtExpectedConditionsMod.ProtractorExpectedConditions = js.native
  val Key: IKey = js.native
  var browser: typings.protractor.builtBrowserMod.ProtractorBrowser = js.native
  var by: typings.protractor.builtLocatorsMod.ProtractorBy = js.native
  var element: ElementHelper = js.native
  /* Extracted nested Instantiables into classes in protractorNs */
  var protractor: typings.protractor.builtPtorMod.Ptor = js.native
}

