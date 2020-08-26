package typings.screeps.anon

import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationLevel extends js.Object {
  var className: operator = js.native
  var cooldown: typings.screeps.screepsNumbers.`5` = js.native
  var duration: js.Tuple5[
    typings.screeps.screepsNumbers.`1`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`3`, 
    typings.screeps.screepsNumbers.`4`, 
    typings.screeps.screepsNumbers.`5`
  ] = js.native
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ] = js.native
  var ops: typings.screeps.screepsNumbers.`10` = js.native
  var range: typings.screeps.screepsNumbers.`20` = js.native
}

object DurationLevel {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typings.screeps.screepsNumbers.`5`,
    duration: js.Tuple5[
      typings.screeps.screepsNumbers.`1`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`3`, 
      typings.screeps.screepsNumbers.`4`, 
      typings.screeps.screepsNumbers.`5`
    ],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ],
    ops: typings.screeps.screepsNumbers.`10`,
    range: typings.screeps.screepsNumbers.`20`
  ): DurationLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationLevel]
  }
  @scala.inline
  implicit class DurationLevelOps[Self <: DurationLevel] (val x: Self) extends AnyVal {
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
    def setCooldown(value: typings.screeps.screepsNumbers.`5`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`1`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`3`, 
          typings.screeps.screepsNumbers.`4`, 
          typings.screeps.screepsNumbers.`5`
        ]
    ): Self = this.set("duration", value.asInstanceOf[js.Any])
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
    def setRange(value: typings.screeps.screepsNumbers.`20`): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

