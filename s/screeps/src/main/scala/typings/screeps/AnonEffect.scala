package typings.screeps

import typings.screeps.screepsNumbers.`0`
import typings.screeps.screepsNumbers.`1.1`
import typings.screeps.screepsNumbers.`1.2`
import typings.screeps.screepsNumbers.`1.3`
import typings.screeps.screepsNumbers.`1.4`
import typings.screeps.screepsNumbers.`1.5`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`10`
import typings.screeps.screepsNumbers.`14`
import typings.screeps.screepsNumbers.`22`
import typings.screeps.screepsNumbers.`2`
import typings.screeps.screepsNumbers.`3`
import typings.screeps.screepsNumbers.`7`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEffect extends js.Object {
  var className: operator
  var cooldown: `10`
  var duration: `100`
  var effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `10`
  var range: `3`
}

object AnonEffect {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `10`,
    duration: `100`,
    effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `10`,
    range: `3`
  ): AnonEffect = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEffect]
  }
}

