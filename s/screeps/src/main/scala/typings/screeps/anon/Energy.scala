package typings.screeps.anon

import typings.screeps.screepsNumbers.`10000`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`15000`
import typings.screeps.screepsNumbers.`20000`
import typings.screeps.screepsNumbers.`25000`
import typings.screeps.screepsNumbers.`5000`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Energy extends js.Object {
  var className: operator
  var cooldown: typings.screeps.screepsNumbers.`20`
  var duration: `50`
  var effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`]
  var energy: `100`
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
}

object Energy {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typings.screeps.screepsNumbers.`20`,
    duration: `50`,
    effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`],
    energy: `100`,
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): Energy = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Energy]
  }
}

