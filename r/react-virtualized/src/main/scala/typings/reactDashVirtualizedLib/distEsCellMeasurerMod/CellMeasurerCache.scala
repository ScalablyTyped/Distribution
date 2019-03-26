package typings
package reactDashVirtualizedLib.distEsCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurerCache")
@js.native
class CellMeasurerCache () extends CellMeasurerCacheInterface {
  def this(params: CellMeasurerCacheParams) = this()
  val defaultHeight: scala.Double = js.native
  val defaultWidth: scala.Double = js.native
  def clear(rowIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def columnWidth(params: reactDashVirtualizedLib.Anon_Index): scala.Double = js.native
  def rowHeight(params: reactDashVirtualizedLib.Anon_Index): scala.Double = js.native
}

