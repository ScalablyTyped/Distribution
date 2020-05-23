package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangedAttackRangedMassAttack extends js.Object {
  var rangedAttack: typings.screeps.screepsNumbers.`4`
  var rangedMassAttack: typings.screeps.screepsNumbers.`4`
}

object RangedAttackRangedMassAttack {
  @scala.inline
  def apply(
    rangedAttack: typings.screeps.screepsNumbers.`4`,
    rangedMassAttack: typings.screeps.screepsNumbers.`4`
  ): RangedAttackRangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedAttackRangedMassAttack]
  }
}

