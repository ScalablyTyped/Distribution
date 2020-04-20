package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPower extends js.Object {
  var power: PowerConstant
  var targetId: String
}

object AnonPower {
  @scala.inline
  def apply(power: PowerConstant, targetId: String): AnonPower = {
    val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPower]
  }
}

