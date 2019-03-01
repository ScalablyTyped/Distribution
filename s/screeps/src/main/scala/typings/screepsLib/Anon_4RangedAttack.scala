package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_4RangedAttack extends js.Object {
  var rangedAttack: screepsLib.screepsLibNumbers.`4`
  var rangedMassAttack: screepsLib.screepsLibNumbers.`4`
}

object Anon_4RangedAttack {
  @scala.inline
  def apply(rangedAttack: screepsLib.screepsLibNumbers.`4`, rangedMassAttack: screepsLib.screepsLibNumbers.`4`): Anon_4RangedAttack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rangedAttack")(rangedAttack)
    __obj.updateDynamic("rangedMassAttack")(rangedMassAttack)
    __obj.asInstanceOf[Anon_4RangedAttack]
  }
}

