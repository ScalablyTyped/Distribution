package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.2`
import typings.screeps.screepsNumbers.`0.35`
import typings.screeps.screepsNumbers.`0.5`
import typings.screeps.screepsNumbers.`0.7`
import typings.screeps.screepsNumbers.`0.9`
import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`300`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  var className: operator = js.native
  var cooldown: `300` = js.native
  var duration: `1000` = js.native
  var effect: js.Tuple5[`0.9`, `0.7`, `0.5`, `0.35`, `0.2`] = js.native
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ] = js.native
  var ops: `100` = js.native
  var range: typings.screeps.screepsNumbers.`3` = js.native
}

object Duration {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `300`,
    duration: `1000`,
    effect: js.Tuple5[`0.9`, `0.7`, `0.5`, `0.35`, `0.2`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ],
    ops: `100`,
    range: typings.screeps.screepsNumbers.`3`
  ): Duration = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setCooldown(value: `300`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: `1000`): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: js.Tuple5[`0.9`, `0.7`, `0.5`, `0.35`, `0.2`]): Self = this.set("effect", value.asInstanceOf[js.Any])
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
    def setOps(value: `100`): Self = this.set("ops", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

