package typings.rcTrigger.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var pageX: Double
  var pageY: Double
}

object Point {
  @scala.inline
  def apply(pageX: Double, pageY: Double): Point = {
    val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point]
  }
}

