package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_01CellDataGetter extends js.Object {
  @JSName("cellDataGetter")
  var cellDataGetter_Original: reactDashVirtualizedLib.distEsTableMod.TableCellDataGetter = js.native
  @JSName("cellRenderer")
  var cellRenderer_Original: reactDashVirtualizedLib.distEsTableMod.TableCellRenderer = js.native
  var flexGrow: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`0` = js.native
  var flexShrink: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`1` = js.native
  @JSName("headerRenderer")
  var headerRenderer_Original: reactDashVirtualizedLib.distEsTableMod.TableHeaderRenderer = js.native
  def cellDataGetter(params: reactDashVirtualizedLib.distEsTableMod.TableCellDataGetterParams): js.Any = js.native
  def cellRenderer(props: reactDashVirtualizedLib.distEsTableMod.TableCellProps): reactLib.reactMod.ReactNs.ReactNode = js.native
  def headerRenderer(props: reactDashVirtualizedLib.distEsTableMod.TableHeaderProps): reactLib.reactMod.ReactNs.ReactNode = js.native
}

