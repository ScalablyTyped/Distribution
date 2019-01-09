package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_1 extends js.Object {
  var autoHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false` = js.native
  var estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30` = js.native
  @JSName("overscanIndicesGetter")
  var overscanIndicesGetter_Original: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter = js.native
  var overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10` = js.native
  var scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto = js.native
  var scrollToIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1` = js.native
  def noRowsRenderer(): scala.Null = js.native
  def onRowsRendered(): scala.Unit = js.native
  def onScroll(): scala.Unit = js.native
  def overscanIndicesGetter(params: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetterParams): reactDashVirtualizedLib.distEsGridMod.OverscanIndices = js.native
}

