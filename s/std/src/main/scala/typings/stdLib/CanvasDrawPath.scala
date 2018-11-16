package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasDrawPath extends js.Object {
  def beginPath(): scala.Unit = js.native
  def clip(): scala.Unit = js.native
  def clip(fillRule: CanvasFillRule): scala.Unit = js.native
  def clip(path: Path2D): scala.Unit = js.native
  def clip(path: Path2D, fillRule: CanvasFillRule): scala.Unit = js.native
  def fill(): scala.Unit = js.native
  def fill(fillRule: CanvasFillRule): scala.Unit = js.native
  def fill(path: Path2D): scala.Unit = js.native
  def fill(path: Path2D, fillRule: CanvasFillRule): scala.Unit = js.native
  def isPointInPath(path: Path2D, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isPointInPath(path: Path2D, x: scala.Double, y: scala.Double, fillRule: CanvasFillRule): scala.Boolean = js.native
  def isPointInPath(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isPointInPath(x: scala.Double, y: scala.Double, fillRule: CanvasFillRule): scala.Boolean = js.native
  def isPointInStroke(path: Path2D, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isPointInStroke(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def stroke(): scala.Unit = js.native
  def stroke(path: Path2D): scala.Unit = js.native
}

