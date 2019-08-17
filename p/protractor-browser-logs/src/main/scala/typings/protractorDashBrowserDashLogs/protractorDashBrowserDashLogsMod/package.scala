package typings.protractorDashBrowserDashLogs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protractorDashBrowserDashLogsMod {
  import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Entry
  import typings.std.RegExp

  type matchPredicate = String | RegExp | matchPredicateFunction
  type matchPredicateFunction = js.Function1[/* entry */ Entry, Boolean]
}
