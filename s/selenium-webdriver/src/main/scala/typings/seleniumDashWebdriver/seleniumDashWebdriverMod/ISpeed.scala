package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

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
    val __obj = js.Dynamic.literal(xspeed = xspeed, yspeed = yspeed)
  
    __obj.asInstanceOf[ISpeed]
  }
}

