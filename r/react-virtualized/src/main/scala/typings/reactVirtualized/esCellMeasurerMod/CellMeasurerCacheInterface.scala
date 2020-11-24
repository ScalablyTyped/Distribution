package typings.reactVirtualized.esCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellMeasurerCacheInterface extends js.Object {
  
  def getHeight(rowIndex: Double): Double = js.native
  def getHeight(rowIndex: Double, columnIndex: Double): Double = js.native
  
  def getWidth(rowIndex: Double): Double = js.native
  def getWidth(rowIndex: Double, columnIndex: Double): Double = js.native
  
  def has(rowIndex: Double, columnIndex: Double): Boolean = js.native
  
  def hasFixedHeight(): Boolean = js.native
  
  def hasFixedWidth(): Boolean = js.native
  
  def set(rowIndex: Double, columnIndex: Double, width: Double, height: Double): Unit = js.native
}
