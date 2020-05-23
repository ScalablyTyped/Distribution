package typings.screeps

import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait POWER_CLASS extends js.Object {
  var OPERATOR: operator
}

object POWER_CLASS {
  @scala.inline
  def apply(OPERATOR: operator): POWER_CLASS = {
    val __obj = js.Dynamic.literal(OPERATOR = OPERATOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[POWER_CLASS]
  }
}

