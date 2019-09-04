package typings.prettyDashFormat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  type Indent = js.Function1[/* arg0 */ String, String]
  type Plugins = js.Array[Plugin]
  type Print = js.Function1[/* arg0 */ js.Any, String]
  type Printer = js.Function6[
    /* val */ js.Any, 
    /* config */ Config, 
    /* indentation */ String, 
    /* depth */ Double, 
    /* refs */ Refs, 
    /* hasCalledToJSON */ js.UndefOr[Boolean], 
    String
  ]
  type Refs = js.Array[js.Any]
  type Test = js.Function1[/* arg0 */ js.Any, Boolean]
}
