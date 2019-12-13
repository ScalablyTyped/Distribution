package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Power extends js.Object {
  var power: PowerConstant
  var targetId: String
}

object Anon_Power {
  @scala.inline
  def apply(power: PowerConstant, targetId: String): Anon_Power = {
    val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Power]
  }
}

