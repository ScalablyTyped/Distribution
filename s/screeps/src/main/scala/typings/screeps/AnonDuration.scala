package typings.screeps

import typings.screeps.screepsNumbers.`0.2`
import typings.screeps.screepsNumbers.`0.35`
import typings.screeps.screepsNumbers.`0.5`
import typings.screeps.screepsNumbers.`0.7`
import typings.screeps.screepsNumbers.`0.9`
import typings.screeps.screepsNumbers.`0`
import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`14`
import typings.screeps.screepsNumbers.`22`
import typings.screeps.screepsNumbers.`2`
import typings.screeps.screepsNumbers.`300`
import typings.screeps.screepsNumbers.`3`
import typings.screeps.screepsNumbers.`7`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var className: operator
  var cooldown: `300`
  var duration: `1000`
  var effect: js.Tuple5[`0.9`, `0.7`, `0.5`, `0.35`, `0.2`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `100`
  var range: `3`
}

object AnonDuration {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `300`,
    duration: `1000`,
    effect: js.Tuple5[`0.9`, `0.7`, `0.5`, `0.35`, `0.2`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `100`,
    range: `3`
  ): AnonDuration = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

