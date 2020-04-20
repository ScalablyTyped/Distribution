package typings.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: Boolean
  var bottomLeft: Boolean
  var bottomRight: Boolean
  var left: Boolean
  var right: Boolean
  var top: Boolean
  var topLeft: Boolean
  var topRight: Boolean
}

object AnonBottom {
  @scala.inline
  def apply(
    bottom: Boolean,
    bottomLeft: Boolean,
    bottomRight: Boolean,
    left: Boolean,
    right: Boolean,
    top: Boolean,
    topLeft: Boolean,
    topRight: Boolean
  ): AnonBottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

