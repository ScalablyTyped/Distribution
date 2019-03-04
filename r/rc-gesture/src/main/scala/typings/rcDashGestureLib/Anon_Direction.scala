package typings
package rcDashGestureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: java.lang.String
  var enablePinch: scala.Boolean
  var enableRotate: scala.Boolean
}

object Anon_Direction {
  @scala.inline
  def apply(direction: java.lang.String, enablePinch: scala.Boolean, enableRotate: scala.Boolean): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction, enablePinch = enablePinch, enableRotate = enableRotate)
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

