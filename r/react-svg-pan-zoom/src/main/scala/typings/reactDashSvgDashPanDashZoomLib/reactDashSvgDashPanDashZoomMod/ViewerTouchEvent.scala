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

