package typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerMouseEvent[T] extends js.Object {
  var SVGViewer: SVGSVGElement
  var originalEvent: MouseEvent[T, NativeMouseEvent]
  var point: Point
  var scaleFactor: Double
  var translationX: Double
  var translationY: Double
  var x: Double
  var y: Double
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object ViewerMouseEvent {
  @scala.inline
  def apply[T](
    SVGViewer: SVGSVGElement,
    originalEvent: MouseEvent[T, NativeMouseEvent],
    point: Point,
    preventDefault: () => Unit,
    scaleFactor: Double,
    stopPropagation: () => Unit,
    translationX: Double,
    translationY: Double,
    x: Double,
    y: Double
  ): ViewerMouseEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer, originalEvent = originalEvent, point = point, preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor, stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX, translationY = translationY, x = x, y = y)
  
    __obj.asInstanceOf[ViewerMouseEvent[T]]
  }
}

