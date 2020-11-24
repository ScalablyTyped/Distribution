package typings.reactVirtualized.esCellMeasurerMod

import typings.reactVirtualized.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurerCache")
@js.native
class CellMeasurerCache () extends CellMeasurerCacheInterface {
  def this(params: CellMeasurerCacheParams) = this()
  
  def clear(rowIndex: Double, columnIndex: Double): Unit = js.native
  
  def clearAll(): Unit = js.native
  
  def columnWidth(params: Index): Double = js.native
  
  val defaultHeight: Double = js.native
  
  val defaultWidth: Double = js.native
  
  def rowHeight(params: Index): Double = js.native
}
