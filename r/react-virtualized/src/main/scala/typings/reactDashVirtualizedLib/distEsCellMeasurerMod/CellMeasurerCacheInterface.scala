package typings
package reactDashVirtualizedLib.distEsCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMeasurerCacheInterface extends js.Object {
  def getHeight(rowIndex: scala.Double): scala.Double = js.native
  def getHeight(rowIndex: scala.Double, columnIndex: scala.Double): scala.Double = js.native
  def getWidth(rowIndex: scala.Double): scala.Double = js.native
  def getWidth(rowIndex: scala.Double, columnIndex: scala.Double): scala.Double = js.native
  def has(rowIndex: scala.Double, columnIndex: scala.Double): scala.Boolean = js.native
  def hasFixedHeight(): scala.Boolean = js.native
  def hasFixedWidth(): scala.Boolean = js.native
  def set(rowIndex: scala.Double, columnIndex: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
}

