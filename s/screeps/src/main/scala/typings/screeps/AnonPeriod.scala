package typings.screeps

import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`10`
import typings.screeps.screepsNumbers.`11`
import typings.screeps.screepsNumbers.`12`
import typings.screeps.screepsNumbers.`14`
import typings.screeps.screepsNumbers.`150`
import typings.screeps.screepsNumbers.`15`
import typings.screeps.screepsNumbers.`200`
import typings.screeps.screepsNumbers.`22`
import typings.screeps.screepsNumbers.`250`
import typings.screeps.screepsNumbers.`300`
import typings.screeps.screepsNumbers.`3`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPeriod extends js.Object {
  var className: operator
  var cooldown: `100`
  var duration: `300`
  var effect: js.Tuple5[`50`, `100`, `150`, `200`, `250`]
  var level: js.Tuple5[`10`, `11`, `12`, `14`, `22`]
  var period: `15`
  var range: `3`
}

object AnonPeriod {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `100`,
    duration: `300`,
    effect: js.Tuple5[`50`, `100`, `150`, `200`, `250`],
    level: js.Tuple5[`10`, `11`, `12`, `14`, `22`],
    period: `15`,
    range: `3`
  ): AnonPeriod = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPeriod]
  }
}

