package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPathDrawingStyles extends js.Object {
  var lineCap: CanvasLineCap
  var lineDashOffset: Double
  var lineJoin: CanvasLineJoin
  var lineWidth: Double
  var miterLimit: Double
  def getLineDash(): js.Array[Double]
  def setLineDash(segments: js.Array[Double]): Unit
}

object CanvasPathDrawingStyles {
  @scala.inline
  def apply(
    getLineDash: () => js.Array[Double],
    lineCap: CanvasLineCap,
    lineDashOffset: Double,
    lineJoin: CanvasLineJoin,
    lineWidth: Double,
    miterLimit: Double,
    setLineDash: js.Array[Double] => Unit
  ): CanvasPathDrawingStyles = {
    val __obj = js.Dynamic.literal(getLineDash = js.Any.fromFunction0(getLineDash), lineCap = lineCap, lineDashOffset = lineDashOffset, lineJoin = lineJoin, lineWidth = lineWidth, miterLimit = miterLimit, setLineDash = js.Any.fromFunction1(setLineDash))
  
    __obj.asInstanceOf[CanvasPathDrawingStyles]
  }
}

