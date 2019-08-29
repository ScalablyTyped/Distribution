package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPathDrawingStyles extends js.Object {
  var lineCap: CanvasLineCap = js.native
  var lineDashOffset: Double = js.native
  var lineJoin: CanvasLineJoin = js.native
  var lineWidth: Double = js.native
  var miterLimit: Double = js.native
  def getLineDash(): js.Array[Double] = js.native
  def setLineDash(segments: js.Array[Double]): Unit = js.native
  def setLineDash(segments: Iterable[Double]): Unit = js.native
}

