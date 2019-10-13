package typings.protractorDashHelpers.protractorDashHelpersMod._Global_.protractor

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProtractorLocatorStrategy extends js.Object {
  def dataHook(hook: String): Locator = js.native
  def dataHook(hook: String, optParentElement: ElementFinder): Locator = js.native
  def dataHook(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
  def dataHookAll(hook: String): Locator = js.native
  def dataHookAll(hook: String, optParentElement: ElementFinder): Locator = js.native
  def dataHookAll(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
}

