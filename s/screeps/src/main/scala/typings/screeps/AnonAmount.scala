package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmount extends js.Object {
  var amount: Double
  var components: RecordDepositConstantComm
  var cooldown: Double
}

object AnonAmount {
  @scala.inline
  def apply(amount: Double, components: RecordDepositConstantComm, cooldown: Double): AnonAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmount]
  }
}

