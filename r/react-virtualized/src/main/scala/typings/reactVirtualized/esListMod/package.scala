package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esListMod {
  type ListRowRenderer = js.Function1[
    /* props */ typings.reactVirtualized.esListMod.ListRowProps, 
    typings.react.mod.ReactNode
  ]
  type RenderedRows = typings.reactVirtualized.mod.OverscanIndexRange with typings.reactVirtualized.mod.IndexRange
}
