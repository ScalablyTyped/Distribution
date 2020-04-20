package typings.screeps

import typings.screeps.screepsNumbers.`0`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`14`
import typings.screeps.screepsNumbers.`200`
import typings.screeps.screepsNumbers.`22`
import typings.screeps.screepsNumbers.`2`
import typings.screeps.screepsNumbers.`300`
import typings.screeps.screepsNumbers.`3`
import typings.screeps.screepsNumbers.`400`
import typings.screeps.screepsNumbers.`500`
import typings.screeps.screepsNumbers.`7`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevelOps extends js.Object {
  var className: operator
  var cooldown: `100`
  var duration: js.Tuple5[`100`, `200`, `300`, `400`, `500`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `100`
  var range: `3`
}

object AnonLevelOps {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `100`,
    duration: js.Tuple5[`100`, `200`, `300`, `400`, `500`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `100`,
    range: `3`
  ): AnonLevelOps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevelOps]
  }
}

