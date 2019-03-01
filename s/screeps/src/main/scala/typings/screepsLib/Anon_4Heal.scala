package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_4Heal extends js.Object {
  var heal: screepsLib.screepsLibNumbers.`4`
  var rangedHeal: screepsLib.screepsLibNumbers.`4`
}

object Anon_4Heal {
  @scala.inline
  def apply(heal: screepsLib.screepsLibNumbers.`4`, rangedHeal: screepsLib.screepsLibNumbers.`4`): Anon_4Heal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heal")(heal)
    __obj.updateDynamic("rangedHeal")(rangedHeal)
    __obj.asInstanceOf[Anon_4Heal]
  }
}

