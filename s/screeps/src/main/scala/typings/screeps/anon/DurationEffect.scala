package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.5`
import typings.screeps.screepsNumbers.`0.6`
import typings.screeps.screepsNumbers.`0.7`
import typings.screeps.screepsNumbers.`0.8`
import typings.screeps.screepsNumbers.`0.9`
import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`500`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationEffect extends js.Object {
  var className: operator
  var cooldown: `500`
  var duration: `1000`
  var effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  var ops: `100`
  var range: typings.screeps.screepsNumbers.`3`
}

object DurationEffect {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `500`,
    duration: `1000`,
    effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ],
    ops: `100`,
    range: typings.screeps.screepsNumbers.`3`
  ): DurationEffect = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEffect]
  }
}

