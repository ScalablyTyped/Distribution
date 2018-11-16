package typings
package protractorDashBrowserDashLogsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protractorDashBrowserDashLogsMod {
  type matchPredicate = java.lang.String | stdLib.RegExp | matchPredicateFunction
  type matchPredicateFunction = js.Function1[
    /* entry */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry, 
    scala.Boolean
  ]
}
