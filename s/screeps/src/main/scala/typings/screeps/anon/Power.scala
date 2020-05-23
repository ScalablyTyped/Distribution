package typings.screeps.anon

import typings.screeps.PowerConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Power extends js.Object {
  var power: PowerConstant
  var targetId: String
}

object Power {
  @scala.inline
  def apply(power: PowerConstant, targetId: String): Power = {
    val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Power]
  }
}

