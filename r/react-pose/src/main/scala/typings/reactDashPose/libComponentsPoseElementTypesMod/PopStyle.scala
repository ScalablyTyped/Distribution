package typings.reactDashPose.libComponentsPoseElementTypesMod

import typings.reactDashPose.reactDashPoseStrings.absolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopStyle extends js.Object {
  var height: Double
  var left: Double
  var position: absolute
  var top: Double
  var width: Double
}

object PopStyle {
  @scala.inline
  def apply(height: Double, left: Double, position: absolute, top: Double, width: Double): PopStyle = {
    val __obj = js.Dynamic.literal(height = height, left = left, position = position, top = top, width = width)
  
    __obj.asInstanceOf[PopStyle]
  }
}

