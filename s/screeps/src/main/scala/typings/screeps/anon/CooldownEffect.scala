package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.2`
import typings.screeps.screepsNumbers.`0.4`
import typings.screeps.screepsNumbers.`0.6`
import typings.screeps.screepsNumbers.`0.8`
import typings.screeps.screepsNumbers.`1.0`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CooldownEffect extends js.Object {
  var className: operator
  var cooldown: `50`
  var effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`]
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  var ops: typings.screeps.screepsNumbers.`2`
  var range: typings.screeps.screepsNumbers.`3`
}

object CooldownEffect {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `50`,
    effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ],
    ops: typings.screeps.screepsNumbers.`2`,
    range: typings.screeps.screepsNumbers.`3`
  ): CooldownEffect = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CooldownEffect]
  }
}

