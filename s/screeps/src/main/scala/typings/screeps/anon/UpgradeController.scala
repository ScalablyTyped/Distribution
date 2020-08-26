package typings.screeps.anon

import typings.screeps.screepsNumbers.`1.5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeController extends js.Object {
  var upgradeController: `1.5` = js.native
}

object UpgradeController {
  @scala.inline
  def apply(upgradeController: `1.5`): UpgradeController = {
    val __obj = js.Dynamic.literal(upgradeController = upgradeController.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeController]
  }
  @scala.inline
  implicit class UpgradeControllerOps[Self <: UpgradeController] (val x: Self) extends AnyVal {
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
    def setUpgradeController(value: `1.5`): Self = this.set("upgradeController", value.asInstanceOf[js.Any])
  }
  
}

