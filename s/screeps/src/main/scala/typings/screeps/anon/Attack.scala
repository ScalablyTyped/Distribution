package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attack extends js.Object {
  var attack: typings.screeps.screepsNumbers.`2`
}

object Attack {
  @scala.inline
  def apply(attack: typings.screeps.screepsNumbers.`2`): Attack = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attack]
  }
}

