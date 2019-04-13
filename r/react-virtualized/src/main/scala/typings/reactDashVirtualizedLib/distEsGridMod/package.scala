package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsGridMod {
  type GridCellRangeRenderer = js.Function1[/* params */ GridCellRangeProps, js.Array[reactLib.reactMod.ReactNode]]
  type GridCellRenderer = js.Function1[/* props */ GridCellProps, reactLib.reactMod.ReactNode]
  type GridProps = GridCoreProps with reactDashVirtualizedLib.Anon_CellRenderer
  type OverscanIndicesGetter = js.Function1[/* params */ OverscanIndicesGetterParams, OverscanIndices]
  type SCROLL_DIRECTION_HORIZONTAL = reactDashVirtualizedLib.reactDashVirtualizedLibStrings.horizontal
  type SCROLL_DIRECTION_VERTICAL = reactDashVirtualizedLib.reactDashVirtualizedLibStrings.vertical
  type SectionRenderedParams = RenderedSection
}
