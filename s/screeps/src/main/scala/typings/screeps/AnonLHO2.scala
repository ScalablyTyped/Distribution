package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLHO2 extends js.Object {
  var LHO2: AnonRangedHeal
  var LO: AnonHeal
  var XLHO2: AnonHealRangedHeal
}

object AnonLHO2 {
  @scala.inline
  def apply(LHO2: AnonRangedHeal, LO: AnonHeal, XLHO2: AnonHealRangedHeal): AnonLHO2 = {
    val __obj = js.Dynamic.literal(LHO2 = LHO2.asInstanceOf[js.Any], LO = LO.asInstanceOf[js.Any], XLHO2 = XLHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLHO2]
  }
}

