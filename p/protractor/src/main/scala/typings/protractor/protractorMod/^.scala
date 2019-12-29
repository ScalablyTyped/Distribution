package typings.protractor.protractorMod

import typings.protractor.builtBrowserMod.ElementHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $: js.Function1[/* search */ String, typings.protractor.builtElementMod.ElementFinder] = js.native
  var By: typings.protractor.builtLocatorsMod.ProtractorBy = js.native
  var Command: js.Any = js.native
  var CommandName: js.Any = js.native
  @JSName("$$")
  var DollarDollar: js.Function1[/* search */ String, typings.protractor.builtElementMod.ElementArrayFinder] = js.native
  var ExpectedConditions: typings.protractor.builtExpectedConditionsMod.ProtractorExpectedConditions = js.native
  var browser: typings.protractor.builtBrowserMod.ProtractorBrowser = js.native
  var by: typings.protractor.builtLocatorsMod.ProtractorBy = js.native
  var element: ElementHelper = js.native
}

