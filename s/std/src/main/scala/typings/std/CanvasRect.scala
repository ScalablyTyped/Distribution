package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRect extends js.Object {
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit
}

object CanvasRect {
  @scala.inline
  def apply(
    clearRect: (Double, Double, Double, Double) => Unit,
    fillRect: (Double, Double, Double, Double) => Unit,
    strokeRect: (Double, Double, Double, Double) => Unit
  ): CanvasRect = {
    val __obj = js.Dynamic.literal(clearRect = js.Any.fromFunction4(clearRect), fillRect = js.Any.fromFunction4(fillRect), strokeRect = js.Any.fromFunction4(strokeRect))
    __obj.asInstanceOf[CanvasRect]
  }
}

