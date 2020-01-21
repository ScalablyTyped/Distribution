package typings.reactCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonPropTypesMod {
  type AsyncClickHandler = js.Function2[
    /* event */ typings.react.mod.MouseEventHandler[typings.std.HTMLAnchorElement], 
    /* done */ js.Function1[/* proceed */ js.UndefOr[scala.Boolean], scala.Unit], 
    scala.Unit
  ]
  type Data = js.Array[js.Object]
  type Headers = js.Array[typings.reactCsv.commonPropTypesMod.LabelKeyObject | java.lang.String]
  type SyncClickHandler = js.Function1[
    /* event */ typings.react.mod.MouseEventHandler[typings.std.HTMLAnchorElement], 
    scala.Boolean | scala.Unit
  ]
}
