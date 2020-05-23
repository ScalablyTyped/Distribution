package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealRangedHeal extends js.Object {
  var heal: typings.screeps.screepsNumbers.`4`
  var rangedHeal: typings.screeps.screepsNumbers.`4`
}

object HealRangedHeal {
  @scala.inline
  def apply(heal: typings.screeps.screepsNumbers.`4`, rangedHeal: typings.screeps.screepsNumbers.`4`): HealRangedHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealRangedHeal]
  }
}

