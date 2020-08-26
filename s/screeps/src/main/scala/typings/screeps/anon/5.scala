package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `5` extends js.Object {
  var upgradeController: typings.screeps.screepsNumbers.`2` = js.native
}

object `5` {
  @scala.inline
  def apply(upgradeController: typings.screeps.screepsNumbers.`2`): `5` = {
    val __obj = js.Dynamic.literal(upgradeController = upgradeController.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  @scala.inline
  implicit class `5Ops`[Self <: `5`] (val x: Self) extends AnyVal {
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
    def setUpgradeController(value: typings.screeps.screepsNumbers.`2`): Self = this.set("upgradeController", value.asInstanceOf[js.Any])
  }
  
}

