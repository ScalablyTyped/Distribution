package typings.screeps.anon

import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`200`
import typings.screeps.screepsNumbers.`40`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsNumbers.`800`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationEffectLevel extends js.Object {
  var className: operator
  var cooldown: `800`
  var duration: `1000`
  var effect: js.Tuple5[
    typings.screeps.screepsNumbers.`10`, 
    typings.screeps.screepsNumbers.`20`, 
    typings.screeps.screepsNumbers.`30`, 
    `40`, 
    `50`
  ]
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`20`, 
    typings.screeps.screepsNumbers.`21`, 
    typings.screeps.screepsNumbers.`22`, 
    typings.screeps.screepsNumbers.`23`, 
    typings.screeps.screepsNumbers.`24`
  ]
  var ops: `200`
  var range: typings.screeps.screepsNumbers.`3`
}

object DurationEffectLevel {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `800`,
    duration: `1000`,
    effect: js.Tuple5[
      typings.screeps.screepsNumbers.`10`, 
      typings.screeps.screepsNumbers.`20`, 
      typings.screeps.screepsNumbers.`30`, 
      `40`, 
      `50`
    ],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`20`, 
      typings.screeps.screepsNumbers.`21`, 
      typings.screeps.screepsNumbers.`22`, 
      typings.screeps.screepsNumbers.`23`, 
      typings.screeps.screepsNumbers.`24`
    ],
    ops: `200`,
    range: typings.screeps.screepsNumbers.`3`
  ): DurationEffectLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationEffectLevel]
  }
}

