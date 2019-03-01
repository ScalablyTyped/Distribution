package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerTouchEvent[T] extends js.Object {
  var SVGViewer: reactLib.SVGSVGElement
  var changedPoints: js.Array[Point]
  var originalEvent: reactLib.reactMod.ReactNs.TouchEvent[T]
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
    SVGViewer: reactLib.SVGSVGElement,
    changedPoints: js.Array[Point],
    originalEvent: reactLib.reactMod.ReactNs.TouchEvent[T],
    points: js.Array[Point],
    preventDefault: js.Function0[scala.Unit],
    scaleFactor: scala.Double,
    stopPropagation: js.Function0[scala.Unit],
    translationX: scala.Double,
    translationY: scala.Double
  ): ViewerTouchEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SVGViewer")(SVGViewer)
    __obj.updateDynamic("changedPoints")(changedPoints)
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.updateDynamic("points")(points)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("scaleFactor")(scaleFactor)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("translationX")(translationX)
    __obj.updateDynamic("translationY")(translationY)
    __obj.asInstanceOf[ViewerTouchEvent[T]]
  }
}

