package typings.sketchapp.anon

import typings.sketchapp.SketchMSCurvePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOrigin extends js.Object {
  var scrollOrigin: SketchMSCurvePoint
  var zoomValue: Double
}

object ScrollOrigin {
  @scala.inline
  def apply(scrollOrigin: SketchMSCurvePoint, zoomValue: Double): ScrollOrigin = {
    val __obj = js.Dynamic.literal(scrollOrigin = scrollOrigin.asInstanceOf[js.Any], zoomValue = zoomValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOrigin]
  }
}

