package typings.screeps.anon

import typings.screeps.screepsNumbers.`10000`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`15000`
import typings.screeps.screepsNumbers.`20000`
import typings.screeps.screepsNumbers.`25000`
import typings.screeps.screepsNumbers.`5000`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Energy extends js.Object {
  var className: operator = js.native
  var cooldown: typings.screeps.screepsNumbers.`20` = js.native
  var duration: `50` = js.native
  var effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`] = js.native
  var energy: `100` = js.native
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ] = js.native
}

object Energy {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typings.screeps.screepsNumbers.`20`,
    duration: `50`,
    effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`],
    energy: `100`,
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): Energy = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Energy]
  }
  @scala.inline
  implicit class EnergyOps[Self <: Energy] (val x: Self) extends AnyVal {
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
    def setClassName(value: operator): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setCooldown(value: typings.screeps.screepsNumbers.`20`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: `50`): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`]): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnergy(value: `100`): Self = this.set("energy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`0`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`7`, 
          typings.screeps.screepsNumbers.`14`, 
          typings.screeps.screepsNumbers.`22`
        ]
    ): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

