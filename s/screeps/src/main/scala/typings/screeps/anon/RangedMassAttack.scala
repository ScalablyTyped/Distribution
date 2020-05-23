package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangedMassAttack extends js.Object {
  var rangedAttack: typings.screeps.screepsNumbers.`3`
  var rangedMassAttack: typings.screeps.screepsNumbers.`3`
}

object RangedMassAttack {
  @scala.inline
  def apply(
    rangedAttack: typings.screeps.screepsNumbers.`3`,
    rangedMassAttack: typings.screeps.screepsNumbers.`3`
  ): RangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedMassAttack]
  }
}

