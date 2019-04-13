package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerTouchEvent[T] extends js.Object {
  var SVGViewer: stdLib.SVGSVGElement
  var changedPoints: js.Array[Point]
  var originalEvent: reactLib.reactMod.TouchEvent[T]
  var points: js.Array[Point]
  var scaleFactor: scala.Double
  var translationX: scala.Double
  var translationY: scala.Double
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object ViewerTouchEvent {
  @scala.inline
  def apply[T](
    SVGViewer: stdLib.SVGSVGElement,
    changedPoints: js.Array[Point],
    originalEvent: reactLib.reactMod.TouchEvent[T],
    points: js.Array[Point],
    preventDefault: () => scala.Unit,
    scaleFactor: scala.Double,
    stopPropagation: () => scala.Unit,
    translationX: scala.Double,
    translationY: scala.Double
  ): ViewerTouchEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer, changedPoints = changedPoints, originalEvent = originalEvent, points = points, preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor, stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX, translationY = translationY)
  
    __obj.asInstanceOf[ViewerTouchEvent[T]]
  }
}

