package typings.scrollbooster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  var bottom: Boolean
  var left: Boolean
  var right: Boolean
  var top: Boolean
}

object Bottom {
  @scala.inline
  def apply(bottom: Boolean, left: Boolean, right: Boolean, top: Boolean): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

