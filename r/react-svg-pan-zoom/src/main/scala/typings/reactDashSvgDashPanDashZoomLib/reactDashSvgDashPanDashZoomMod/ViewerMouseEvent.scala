package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerMouseEvent[T] extends js.Object {
  var SVGViewer: stdLib.SVGSVGElement
  var originalEvent: reactLib.reactMod.MouseEvent[T, reactLib.NativeMouseEvent]
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
    SVGViewer: stdLib.SVGSVGElement,
    originalEvent: reactLib.reactMod.MouseEvent[T, reactLib.NativeMouseEvent],
    point: Point,
    preventDefault: () => scala.Unit,
    scaleFactor: scala.Double,
    stopPropagation: () => scala.Unit,
    translationX: scala.Double,
    translationY: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): ViewerMouseEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer, originalEvent = originalEvent, point = point, preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor, stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX, translationY = translationY, x = x, y = y)
  
    __obj.asInstanceOf[ViewerMouseEvent[T]]
  }
}

