package typings
package reactDashPoseLib.libComponentsPoseElementTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopStyle extends js.Object {
  var height: scala.Double
  var left: scala.Double
  var position: reactDashPoseLib.reactDashPoseLibStrings.absolute
  var top: scala.Double
  var width: scala.Double
}

object PopStyle {
  @scala.inline
  def apply(
    height: scala.Double,
    left: scala.Double,
    position: reactDashPoseLib.reactDashPoseLibStrings.absolute,
    top: scala.Double,
    width: scala.Double
  ): PopStyle = {
    val __obj = js.Dynamic.literal(height = height, left = left, position = position, top = top, width = width)
  
    __obj.asInstanceOf[PopStyle]
  }
}

