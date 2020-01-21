package typings.reactVirtualized.esCellMeasurerMod

import typings.reactVirtualized.AnonIndex
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
  def columnWidth(params: AnonIndex): Double = js.native
  def rowHeight(params: AnonIndex): Double = js.native
}

