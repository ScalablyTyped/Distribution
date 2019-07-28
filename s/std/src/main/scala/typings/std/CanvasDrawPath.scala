package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasDrawPath extends js.Object {
  def beginPath(): Unit = js.native
  def clip(): Unit = js.native
  def clip(fillRule: CanvasFillRule): Unit = js.native
  def clip(path: Path2D): Unit = js.native
  def clip(path: Path2D, fillRule: CanvasFillRule): Unit = js.native
  def fill(): Unit = js.native
  def fill(fillRule: CanvasFillRule): Unit = js.native
  def fill(path: Path2D): Unit = js.native
  def fill(path: Path2D, fillRule: CanvasFillRule): Unit = js.native
  def isPointInPath(path: Path2D, x: Double, y: Double): scala.Boolean = js.native
  def isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule): scala.Boolean = js.native
  def isPointInPath(x: Double, y: Double): scala.Boolean = js.native
  def isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): scala.Boolean = js.native
  def isPointInStroke(path: Path2D, x: Double, y: Double): scala.Boolean = js.native
  def isPointInStroke(x: Double, y: Double): scala.Boolean = js.native
  def stroke(): Unit = js.native
  def stroke(path: Path2D): Unit = js.native
}

