package typings.scrollbooster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: Boolean
  var left: Boolean
  var right: Boolean
  var top: Boolean
}

object AnonBottom {
  @scala.inline
  def apply(bottom: Boolean, left: Boolean, right: Boolean, top: Boolean): AnonBottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

