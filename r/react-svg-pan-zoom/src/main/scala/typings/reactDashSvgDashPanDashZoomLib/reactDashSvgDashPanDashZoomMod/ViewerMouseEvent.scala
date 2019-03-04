package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerMouseEvent[T] extends js.Object {
  var SVGViewer: reactLib.SVGSVGElement
  var originalEvent: reactLib.reactMod.ReactNs.MouseEvent[T, reactLib.NativeMouseEvent]
  var point: Point
  var scaleFactor: scala.Double
  var translationX: scala.Double
  var translationY: scala.Double
  var x: scala.Double
  var y: scala.Double
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object ViewerMouseEvent {
  @scala.inline
  def apply[T](
    SVGViewer: reactLib.SVGSVGElement,
    originalEvent: reactLib.reactMod.ReactNs.MouseEvent[T, reactLib.NativeMouseEvent],
    point: Point,
    preventDefault: js.Function0[scala.Unit],
    scaleFactor: scala.Double,
    stopPropagation: js.Function0[scala.Unit],
    translationX: scala.Double,
    translationY: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): ViewerMouseEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer, originalEvent = originalEvent, point = point, preventDefault = preventDefault, scaleFactor = scaleFactor, stopPropagation = stopPropagation, translationX = translationX, translationY = translationY, x = x, y = y)
  
    __obj.asInstanceOf[ViewerMouseEvent[T]]
  }
}

