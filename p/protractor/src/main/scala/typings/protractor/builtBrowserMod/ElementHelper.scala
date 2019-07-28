package typings.protractor.builtBrowserMod

import typings.protractor.builtElementMod.ElementArrayFinder
import typings.protractor.builtElementMod.ElementFinder
import typings.protractor.builtLocatorsMod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementHelper
  extends js.Function {
  def apply(locator: Locator): ElementFinder = js.native
  def all(locator: Locator): ElementArrayFinder = js.native
}

