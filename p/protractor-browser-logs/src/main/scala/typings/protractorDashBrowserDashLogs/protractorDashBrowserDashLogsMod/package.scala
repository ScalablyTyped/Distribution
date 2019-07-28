package typings.protractorDashBrowserDashLogs

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Entry
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protractorDashBrowserDashLogsMod {
  type matchPredicate = String | RegExp | matchPredicateFunction
  type matchPredicateFunction = js.Function1[/* entry */ Entry, Boolean]
}
