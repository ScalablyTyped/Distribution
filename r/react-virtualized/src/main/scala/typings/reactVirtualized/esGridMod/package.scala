package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esGridMod {
  type GridCellRangeRenderer = js.Function1[
    /* params */ typings.reactVirtualized.esGridMod.GridCellRangeProps, 
    js.Array[typings.react.mod.ReactNode]
  ]
  type GridCellRenderer = js.Function1[
    /* props */ typings.reactVirtualized.esGridMod.GridCellProps, 
    typings.react.mod.ReactNode
  ]
  type OverscanIndices = typings.reactVirtualized.mod.OverscanIndexRange
  type OverscanIndicesGetter = js.Function1[
    /* params */ typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams, 
    typings.reactVirtualized.esGridMod.OverscanIndices
  ]
  type SCROLL_DIRECTION_HORIZONTAL = typings.reactVirtualized.reactVirtualizedStrings.horizontal
  type SCROLL_DIRECTION_VERTICAL = typings.reactVirtualized.reactVirtualizedStrings.vertical
  type SectionRenderedParams = typings.reactVirtualized.esGridMod.RenderedSection
}
