package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpeed extends js.Object {
  var xspeed: scala.Double
  var yspeed: scala.Double
}

object ISpeed {
  @scala.inline
  def apply(xspeed: scala.Double, yspeed: scala.Double): ISpeed = {
    val __obj = js.Dynamic.literal(xspeed = xspeed, yspeed = yspeed)
  
    __obj.asInstanceOf[ISpeed]
  }
}

