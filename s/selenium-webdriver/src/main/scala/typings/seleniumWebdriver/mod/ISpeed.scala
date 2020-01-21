package typings.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpeed extends js.Object {
  var xspeed: Double
  var yspeed: Double
}

object ISpeed {
  @scala.inline
  def apply(xspeed: Double, yspeed: Double): ISpeed = {
    val __obj = js.Dynamic.literal(xspeed = xspeed.asInstanceOf[js.Any], yspeed = yspeed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpeed]
  }
}

