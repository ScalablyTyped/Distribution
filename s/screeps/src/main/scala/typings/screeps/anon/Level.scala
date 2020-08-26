package typings.screeps.anon

import typings.screeps.screepsNumbers.`1.1`
import typings.screeps.screepsNumbers.`1.2`
import typings.screeps.screepsNumbers.`1.3`
import typings.screeps.screepsNumbers.`1.4`
import typings.screeps.screepsNumbers.`1.5`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  var className: operator = js.native
  var cooldown: typings.screeps.screepsNumbers.`10` = js.native
  var duration: `100` = js.native
  var effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`] = js.native
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ] = js.native
  var ops: typings.screeps.screepsNumbers.`10` = js.native
  var range: typings.screeps.screepsNumbers.`3` = js.native
}

object Level {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typings.screeps.screepsNumbers.`10`,
    duration: `100`,
    effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ],
    ops: typings.screeps.screepsNumbers.`10`,
    range: typings.screeps.screepsNumbers.`3`
  ): Level = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
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
    def setCooldown(value: typings.screeps.screepsNumbers.`10`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: `100`): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`]): Self = this.set("effect", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setOps(value: typings.screeps.screepsNumbers.`10`): Self = this.set("ops", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

