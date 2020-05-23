package typings.screeps.anon

import typings.screeps.screepsNumbers.`40`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsRange extends js.Object {
  var className: operator
  var cooldown: typings.screeps.screepsNumbers.`8`
  var duration: typings.screeps.screepsNumbers.`10`
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`20`, 
    typings.screeps.screepsNumbers.`21`, 
    typings.screeps.screepsNumbers.`22`, 
    typings.screeps.screepsNumbers.`23`, 
    typings.screeps.screepsNumbers.`24`
  ]
  var ops: js.Tuple5[
    `50`, 
    `40`, 
    typings.screeps.screepsNumbers.`30`, 
    typings.screeps.screepsNumbers.`20`, 
    typings.screeps.screepsNumbers.`10`
  ]
  var range: `50`
}

object OpsRange {
  @scala.inline
  def apply(
    className: operator,
    cooldown: typings.screeps.screepsNumbers.`8`,
    duration: typings.screeps.screepsNumbers.`10`,
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`20`, 
      typings.screeps.screepsNumbers.`21`, 
      typings.screeps.screepsNumbers.`22`, 
      typings.screeps.screepsNumbers.`23`, 
      typings.screeps.screepsNumbers.`24`
    ],
    ops: js.Tuple5[
      `50`, 
      `40`, 
      typings.screeps.screepsNumbers.`30`, 
      typings.screeps.screepsNumbers.`20`, 
      typings.screeps.screepsNumbers.`10`
    ],
    range: `50`
  ): OpsRange = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsRange]
  }
}

