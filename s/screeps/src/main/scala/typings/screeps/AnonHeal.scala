package typings.screeps

import typings.screeps.screepsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeal extends js.Object {
  var heal: `2`
  var rangedHeal: `2`
}

object AnonHeal {
  @scala.inline
  def apply(heal: `2`, rangedHeal: `2`): AnonHeal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeal]
  }
}

