package typings.reactDashVirtualized.distEsCellMeasurerMod

import typings.reactDashVirtualized.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurerCache")
@js.native
class CellMeasurerCache () extends CellMeasurerCacheInterface {
  def this(params: CellMeasurerCacheParams) = this()
  val defaultHeight: Double = js.native
  val defaultWidth: Double = js.native
  def clear(rowIndex: Double, columnIndex: Double): Unit = js.native
  def clearAll(): Unit = js.native
  def columnWidth(params: Anon_Index): Double = js.native
  def rowHeight(params: Anon_Index): Double = js.native
}

