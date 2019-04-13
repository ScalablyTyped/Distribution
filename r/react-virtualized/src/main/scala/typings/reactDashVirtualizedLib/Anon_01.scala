package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_01 extends js.Object {
  var `aria-label`: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.grid = js.native
  var `aria-readonly`: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`true` = js.native
  var autoContainerWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false` = js.native
  var autoHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false` = js.native
  var autoWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false` = js.native
  @JSName("cellRangeRenderer")
  var cellRangeRenderer_Original: reactDashVirtualizedLib.distEsGridMod.GridCellRangeRenderer = js.native
  var containerRole: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.rowgroup = js.native
  var estimatedColumnSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`100` = js.native
  var estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30` = js.native
  var overscanColumnCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0` = js.native
  @JSName("overscanIndicesGetter")
  var overscanIndicesGetter_Original: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter = js.native
  var overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10` = js.native
  var role: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.grid = js.native
  var scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto = js.native
  var scrollToColumn: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1` = js.native
  var scrollToRow: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1` = js.native
  var scrollingResetTimeInterval: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`150` = js.native
  var tabIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0` = js.native
  def cellRangeRenderer(params: reactDashVirtualizedLib.distEsGridMod.GridCellRangeProps): js.Array[reactLib.reactMod.ReactNode] = js.native
  def getScrollbarSize(): scala.Double = js.native
  def noContentRenderer(): reactLib.reactMod.ReactNode = js.native
  def onScroll(): scala.Unit = js.native
  def onScrollbarPresenceChange(): scala.Unit = js.native
  def onSectionRendered(): scala.Unit = js.native
  def overscanIndicesGetter(params: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetterParams): reactDashVirtualizedLib.distEsGridMod.OverscanIndices = js.native
}

