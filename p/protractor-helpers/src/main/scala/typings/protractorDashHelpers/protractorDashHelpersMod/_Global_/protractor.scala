package typings.protractorDashHelpers.protractorDashHelpersMod._Global_

import typings.protractorDashHelpers.protractorDashHelpersMod._Global_.protractor.ElementArrayFinder
import typings.protractorDashHelpers.protractorDashHelpersMod._Global_.protractor.ElementFinder
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ElementArrayFinder
// Locators
// TODO - find out about result of querySelector and querySelector all.
//        Are they Locator s?
@JSGlobal("protractor")
@js.native
object protractor extends js.Object {
  @js.native
  trait ElementArrayFinder extends js.Object {
    @JSName("$$data")
    def $$data(hook: String): ElementArrayFinder = js.native
    def getByText(text: String): ElementFinder = js.native
  }
  
  @js.native
  trait ElementFinder extends js.Object {
    @JSName("$data")
    def $data(hook: String): ElementFinder = js.native
  }
  
  @js.native
  trait IProtractorLocatorStrategy extends js.Object {
    def dataHook(hook: String): Locator = js.native
    def dataHook(hook: String, optParentElement: ElementFinder): Locator = js.native
    def dataHook(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
    def dataHookAll(hook: String): Locator = js.native
    def dataHookAll(hook: String, optParentElement: ElementFinder): Locator = js.native
    def dataHookAll(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
  }
  
}

