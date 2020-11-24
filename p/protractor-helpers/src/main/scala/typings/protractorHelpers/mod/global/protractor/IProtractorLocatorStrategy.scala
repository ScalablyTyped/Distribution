package typings.protractorHelpers.mod.global.protractor

import typings.seleniumWebdriver.mod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProtractorLocatorStrategy extends js.Object {
  
  def dataHook(hook: String): Locator = js.native
  def dataHook(hook: String, optParentElement: js.UndefOr[scala.Nothing], optRootSelector: String): Locator = js.native
  def dataHook(hook: String, optParentElement: ElementFinder): Locator = js.native
  def dataHook(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
  
  def dataHookAll(hook: String): Locator = js.native
  def dataHookAll(hook: String, optParentElement: js.UndefOr[scala.Nothing], optRootSelector: String): Locator = js.native
  def dataHookAll(hook: String, optParentElement: ElementFinder): Locator = js.native
  def dataHookAll(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
}
