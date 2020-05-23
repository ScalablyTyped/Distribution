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

trait Level extends js.Object {
  var className: operator
  var cooldown: typings.screeps.screepsNumbers.`10`
  var duration: `100`
  var effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`]
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  var ops: typings.screeps.screepsNumbers.`10`
  var range: typings.screeps.screepsNumbers.`3`
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
}

