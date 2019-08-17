package typings.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object builtLocatorsMod {
  import typings.seleniumDashWebdriver.libByMod.ByHash
  import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.By

  type Locator = ProtractorLocator | WebDriverLocator
  type WebDriverLocator = By | ByHash | js.Function
}
