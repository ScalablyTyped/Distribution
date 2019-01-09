package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_0110 extends js.Object {
  var disableHeader: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false` = js.native
  var estimatedRowSize: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`30` = js.native
  var headerHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0` = js.native
  @JSName("headerRowRenderer")
  var headerRowRenderer_Original: reactDashVirtualizedLib.distEsTableMod.TableHeaderRenderer = js.native
  var overscanRowCount: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`10` = js.native
  @JSName("rowRenderer")
  var rowRenderer_Original: reactDashVirtualizedLib.distEsTableMod.TableRowRenderer = js.native
  var scrollToAlignment: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.auto = js.native
  var scrollToIndex: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`-1` = js.native
  def headerRowRenderer(props: reactDashVirtualizedLib.distEsTableMod.TableHeaderProps): reactLib.reactMod.ReactNs.ReactNode = js.native
  def noRowsRenderer(): scala.Null = js.native
  def onRowsRendered(): scala.Null = js.native
  def onScroll(): scala.Null = js.native
  def rowRenderer(props: reactDashVirtualizedLib.distEsTableMod.TableRowProps): reactLib.reactMod.ReactNs.ReactNode = js.native
}

