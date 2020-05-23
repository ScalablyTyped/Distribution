package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components extends js.Object {
  var amount: Double
  var components: RecordDepositConstantComm
  var cooldown: Double
  var level: js.UndefOr[Double] = js.undefined
}

object Components {
  @scala.inline
  def apply(
    amount: Double,
    components: RecordDepositConstantComm,
    cooldown: Double,
    level: js.UndefOr[Double] = js.undefined
  ): Components = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
}

