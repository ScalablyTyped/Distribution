package typings
package protractorLib.builtBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementHelper
  extends js.Function {
  def apply(locator: protractorLib.builtLocatorsMod.Locator): protractorLib.builtElementMod.ElementFinder = js.native
  def all(locator: protractorLib.builtLocatorsMod.Locator): protractorLib.builtElementMod.ElementArrayFinder = js.native
}

