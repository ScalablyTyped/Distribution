package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object builtLocatorsMod {
  type Locator = ProtractorLocator | WebDriverLocator
  type WebDriverLocator = seleniumDashWebdriverLib.seleniumDashWebdriverMod.By | seleniumDashWebdriverLib.seleniumDashWebdriverMod.ByHash | js.Function
}
