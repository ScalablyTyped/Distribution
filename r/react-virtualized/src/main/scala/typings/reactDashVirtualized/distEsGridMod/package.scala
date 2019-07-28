package typings.reactDashVirtualized

import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.Anon_CellRenderer
import typings.reactDashVirtualized.reactDashVirtualizedStrings.horizontal
import typings.reactDashVirtualized.reactDashVirtualizedStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsGridMod {
  type GridCellRangeRenderer = js.Function1[/* params */ GridCellRangeProps, js.Array[ReactNode]]
  type GridCellRenderer = js.Function1[/* props */ GridCellProps, ReactNode]
  type GridProps = GridCoreProps with Anon_CellRenderer
  type OverscanIndicesGetter = js.Function1[/* params */ OverscanIndicesGetterParams, OverscanIndices]
  type SCROLL_DIRECTION_HORIZONTAL = horizontal
  type SCROLL_DIRECTION_VERTICAL = vertical
  type SectionRenderedParams = RenderedSection
}
