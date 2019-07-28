package typings.protractor

import typings.seleniumDashWebdriver.libByMod.ByHash
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.By
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object builtLocatorsMod {
  type Locator = ProtractorLocator | WebDriverLocator
  type WebDriverLocator = By | ByHash | js.Function
}
