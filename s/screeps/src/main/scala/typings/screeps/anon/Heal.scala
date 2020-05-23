package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heal extends js.Object {
  var heal: typings.screeps.screepsNumbers.`2`
  var rangedHeal: typings.screeps.screepsNumbers.`2`
}

object Heal {
  @scala.inline
  def apply(heal: typings.screeps.screepsNumbers.`2`, rangedHeal: typings.screeps.screepsNumbers.`2`): Heal = {
    val __obj = js.Dynamic.literal(heal = heal.asInstanceOf[js.Any], rangedHeal = rangedHeal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heal]
  }
}

