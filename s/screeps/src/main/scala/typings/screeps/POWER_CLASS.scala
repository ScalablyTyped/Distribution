package typings.screeps

import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait POWER_CLASS extends js.Object {
  var OPERATOR: operator = js.native
}

object POWER_CLASS {
  @scala.inline
  def apply(OPERATOR: operator): POWER_CLASS = {
    val __obj = js.Dynamic.literal(OPERATOR = OPERATOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[POWER_CLASS]
  }
  @scala.inline
  implicit class POWER_CLASSOps[Self <: POWER_CLASS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOPERATOR(value: operator): Self = this.set("OPERATOR", value.asInstanceOf[js.Any])
  }
  
}

