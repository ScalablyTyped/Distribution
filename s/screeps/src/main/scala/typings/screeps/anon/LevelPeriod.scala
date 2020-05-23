package typings.screeps.anon

import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelPeriod extends js.Object {
  var className: operator
  var cooldown: `100`
  var duration: `100`
  var effect: js.Tuple5[
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`4`, 
    typings.screeps.screepsNumbers.`6`, 
    typings.screeps.screepsNumbers.`8`, 
    typings.screeps.screepsNumbers.`10`
  ]
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`10`, 
    typings.screeps.screepsNumbers.`11`, 
    typings.screeps.screepsNumbers.`12`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  var period: typings.screeps.screepsNumbers.`10`
  var range: typings.screeps.screepsNumbers.`3`
}

object LevelPeriod {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `100`,
    duration: `100`,
    effect: js.Tuple5[
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`4`, 
      typings.screeps.screepsNumbers.`6`, 
      typings.screeps.screepsNumbers.`8`, 
      typings.screeps.screepsNumbers.`10`
    ],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`10`, 
      typings.screeps.screepsNumbers.`11`, 
      typings.screeps.screepsNumbers.`12`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ],
    period: typings.screeps.screepsNumbers.`10`,
    range: typings.screeps.screepsNumbers.`3`
  ): LevelPeriod = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelPeriod]
  }
}

