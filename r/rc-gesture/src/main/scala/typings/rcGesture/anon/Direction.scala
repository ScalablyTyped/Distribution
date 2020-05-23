package typings.rcGesture.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: String
  var enablePinch: Boolean
  var enableRotate: Boolean
}

object Direction {
  @scala.inline
  def apply(direction: String, enablePinch: Boolean, enableRotate: Boolean): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], enablePinch = enablePinch.asInstanceOf[js.Any], enableRotate = enableRotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

