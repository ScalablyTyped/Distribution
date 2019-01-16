package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPathDrawingStyles extends js.Object {
  var lineCap: CanvasLineCap
  var lineDashOffset: scala.Double
  var lineJoin: CanvasLineJoin
  var lineWidth: scala.Double
  var miterLimit: scala.Double
  def getLineDash(): Array[scala.Double]
  def setLineDash(segments: Array[scala.Double]): scala.Unit
}

