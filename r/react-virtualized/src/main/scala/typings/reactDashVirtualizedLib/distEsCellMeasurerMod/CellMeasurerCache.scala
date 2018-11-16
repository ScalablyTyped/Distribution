package typings
package reactDashVirtualizedLib.distEsCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 6 members from Set(react-virtualized.react-virtualized/dist/es/CellMeasurer.CellMeasurerCacheInterface) */ @JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurerCache")
@js.native
class CellMeasurerCache () extends js.Object {
  def this(params: CellMeasurerCacheParams) = this()
  val defaultHeight: scala.Double = js.native
  val defaultWidth: scala.Double = js.native
  def clear(rowIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def columnWidth(params: reactDashVirtualizedLib.Anon_Index): scala.Double = js.native
  def getHeight(rowIndex: scala.Double): scala.Double = js.native
  def getHeight(rowIndex: scala.Double, columnIndex: scala.Double): scala.Double = js.native
  def getWidth(rowIndex: scala.Double): scala.Double = js.native
  def getWidth(rowIndex: scala.Double, columnIndex: scala.Double): scala.Double = js.native
  def has(rowIndex: scala.Double, columnIndex: scala.Double): scala.Boolean = js.native
  def hasFixedHeight(): scala.Boolean = js.native
  def hasFixedWidth(): scala.Boolean = js.native
  def rowHeight(params: reactDashVirtualizedLib.Anon_Index): scala.Double = js.native
  def set(rowIndex: scala.Double, columnIndex: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
}

