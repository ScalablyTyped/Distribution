package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangedAttack extends js.Object {
  var rangedAttack: typings.screeps.screepsNumbers.`2`
  var rangedMassAttack: typings.screeps.screepsNumbers.`2`
}

object RangedAttack {
  @scala.inline
  def apply(
    rangedAttack: typings.screeps.screepsNumbers.`2`,
    rangedMassAttack: typings.screeps.screepsNumbers.`2`
  ): RangedAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = rangedAttack.asInstanceOf[js.Any], rangedMassAttack = rangedMassAttack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedAttack]
  }
}

