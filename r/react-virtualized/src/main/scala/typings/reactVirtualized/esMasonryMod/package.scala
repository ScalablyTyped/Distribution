package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMasonryMod {
  type CellRenderer = js.Function1[
    /* props */ typings.reactVirtualized.esMasonryMod.MasonryCellProps, 
    typings.react.mod.ReactNode
  ]
  type OnCellsRenderedCallback = js.Function1[/* params */ typings.reactVirtualized.mod.IndexRange, scala.Unit]
  type OnScrollCallback = js.Function1[/* params */ typings.reactVirtualized.AnonClientHeight, scala.Unit]
  type Positioner = (js.Function1[/* index */ scala.Double, typings.reactVirtualized.esMasonryMod.Position]) with typings.reactVirtualized.AnonReset
  type emptyObject = js.Object
  type identity = js.Function1[/* value */ js.Any, js.Any]
  type noop = js.Function0[scala.Unit]
}
