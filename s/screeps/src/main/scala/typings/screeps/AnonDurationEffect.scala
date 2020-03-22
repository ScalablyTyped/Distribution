package typings.screeps

import typings.screeps.screepsNumbers.`0.5`
import typings.screeps.screepsNumbers.`0.6`
import typings.screeps.screepsNumbers.`0.7`
import typings.screeps.screepsNumbers.`0.8`
import typings.screeps.screepsNumbers.`0.9`
import typings.screeps.screepsNumbers.`0`
import typings.screeps.screepsNumbers.`10`
import typings.screeps.screepsNumbers.`14`
import typings.screeps.screepsNumbers.`22`
import typings.screeps.screepsNumbers.`2`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsNumbers.`5`
import typings.screeps.screepsNumbers.`7`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationEffect extends js.Object {
  var className: operator
  var cooldown: `0`
  var duration: `5`
  var effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `10`
  var range: `50`
}

object AnonDurationEffect {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `0`,
    duration: `5`,
    effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `10`,
    range: `50`
  ): AnonDurationEffect = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDurationEffect]
  }
}

