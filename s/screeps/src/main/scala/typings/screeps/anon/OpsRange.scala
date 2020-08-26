package typings.screeps.anon

import typings.screeps.screepsNumbers.`40`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsRange extends js.Object {
  var className: operator = js.native
  var cooldown: typings.screeps.screepsNumbers.`8` = js.native
  var duration: typings.screeps.screepsNumbers.`10` = js.native
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`20`, 
    typings.screeps.screepsNumbers.`21`, 
    typings.screeps.screepsNumbers.`22`, 
    typings.screeps.screepsNumbers.`23`, 
    typings.screeps.screepsNumbers.`24`
  ] = js.native
  var ops: js.Tuple5[
    `50`, 
    `40`, 
    typings.screeps.screepsNumbers.`30`, 
    typings.screeps.screepsNumbers.`20`, 
    typings.screeps.screepsNumbers.`10`
  ] = js.native
  var range: `50` = js.native
}

object OpsRange {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typings.screeps.screepsNumbers.`8`,
    duration: typings.screeps.screepsNumbers.`10`,
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`20`, 
      typings.screeps.screepsNumbers.`21`, 
      typings.screeps.screepsNumbers.`22`, 
      typings.screeps.screepsNumbers.`23`, 
      typings.screeps.screepsNumbers.`24`
    ],
    ops: js.Tuple5[
      `50`, 
      `40`, 
      typings.screeps.screepsNumbers.`30`, 
      typings.screeps.screepsNumbers.`20`, 
      typings.screeps.screepsNumbers.`10`
    ],
    range: `50`
  ): OpsRange = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsRange]
  }
  @scala.inline
  implicit class OpsRangeOps[Self <: OpsRange] (val x: Self) extends AnyVal {
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
    def setCooldown(value: typings.screeps.screepsNumbers.`8`): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: typings.screeps.screepsNumbers.`10`): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`20`, 
          typings.screeps.screepsNumbers.`21`, 
          typings.screeps.screepsNumbers.`22`, 
          typings.screeps.screepsNumbers.`23`, 
          typings.screeps.screepsNumbers.`24`
        ]
    ): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setOps(
      value: js.Tuple5[
          `50`, 
          `40`, 
          typings.screeps.screepsNumbers.`30`, 
          typings.screeps.screepsNumbers.`20`, 
          typings.screeps.screepsNumbers.`10`
        ]
    ): Self = this.set("ops", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: `50`): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

