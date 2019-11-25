package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScrollOrigin extends js.Object {
  var scrollOrigin: SketchMSCurvePoint
  var zoomValue: Double
}

object Anon_ScrollOrigin {
  @scala.inline
  def apply(scrollOrigin: SketchMSCurvePoint, zoomValue: Double): Anon_ScrollOrigin = {
    val __obj = js.Dynamic.literal(scrollOrigin = scrollOrigin.asInstanceOf[js.Any], zoomValue = zoomValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ScrollOrigin]
  }
}

