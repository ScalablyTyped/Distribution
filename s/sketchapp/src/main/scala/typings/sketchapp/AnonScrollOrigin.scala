package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScrollOrigin extends js.Object {
  var scrollOrigin: SketchMSCurvePoint
  var zoomValue: Double
}

object AnonScrollOrigin {
  @scala.inline
  def apply(scrollOrigin: SketchMSCurvePoint, zoomValue: Double): AnonScrollOrigin = {
    val __obj = js.Dynamic.literal(scrollOrigin = scrollOrigin.asInstanceOf[js.Any], zoomValue = zoomValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScrollOrigin]
  }
}

