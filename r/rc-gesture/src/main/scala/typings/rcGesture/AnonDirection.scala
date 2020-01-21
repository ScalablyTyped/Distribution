package typings.rcGesture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: String
  var enablePinch: Boolean
  var enableRotate: Boolean
}

object AnonDirection {
  @scala.inline
  def apply(direction: String, enablePinch: Boolean, enableRotate: Boolean): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], enablePinch = enablePinch.asInstanceOf[js.Any], enableRotate = enableRotate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirection]
  }
}

