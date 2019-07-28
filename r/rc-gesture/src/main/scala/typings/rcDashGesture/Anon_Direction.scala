package typings.rcDashGesture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: String
  var enablePinch: Boolean
  var enableRotate: Boolean
}

object Anon_Direction {
  @scala.inline
  def apply(direction: String, enablePinch: Boolean, enableRotate: Boolean): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction, enablePinch = enablePinch, enableRotate = enableRotate)
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

