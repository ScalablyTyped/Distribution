package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_2RangedAttack extends js.Object {
  var rangedAttack: screepsLib.screepsLibNumbers.`2`
  var rangedMassAttack: screepsLib.screepsLibNumbers.`2`
}

object Anon_2RangedAttack {
  @scala.inline
  def apply(rangedAttack: screepsLib.screepsLibNumbers.`2`, rangedMassAttack: screepsLib.screepsLibNumbers.`2`): Anon_2RangedAttack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rangedAttack")(rangedAttack)
    __obj.updateDynamic("rangedMassAttack")(rangedMassAttack)
    __obj.asInstanceOf[Anon_2RangedAttack]
  }
}

