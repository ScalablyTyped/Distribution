package typings.protractor.mod

import typings.protractor.browserMod.ElementHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  @JSName("$$")
  var $: js.Function1[/* search */ String, typings.protractor.elementMod.ElementArrayFinder] = js.native
  
  @JSName("By")
  var By_ : typings.protractor.locatorsMod.ProtractorBy = js.native
  
  var Command: js.Any = js.native
  
  var CommandName: js.Any = js.native
  
  var ExpectedConditions: typings.protractor.expectedConditionsMod.ProtractorExpectedConditions = js.native
  
  @JSName("$")
  var _empty: js.Function1[/* search */ String, typings.protractor.elementMod.ElementFinder] = js.native
  
  var browser: typings.protractor.browserMod.ProtractorBrowser = js.native
  
  var by: typings.protractor.locatorsMod.ProtractorBy = js.native
  
  var element: ElementHelper = js.native
}
