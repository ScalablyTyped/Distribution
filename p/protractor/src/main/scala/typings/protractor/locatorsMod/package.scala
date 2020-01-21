package typings.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object locatorsMod {
  type Locator = typings.protractor.locatorsMod.ProtractorLocator | typings.protractor.locatorsMod.WebDriverLocator
  type WebDriverLocator = typings.seleniumWebdriver.mod.By | typings.seleniumWebdriver.byMod.ByHash | js.Function
}
