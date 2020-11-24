package typings.protractorBrowserLogs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type matchPredicate = java.lang.String | typings.std.RegExp | typings.protractorBrowserLogs.mod.matchPredicateFunction
  
  type matchPredicateFunction = js.Function1[/* entry */ typings.seleniumWebdriver.mod.logging.Entry, scala.Boolean]
}
