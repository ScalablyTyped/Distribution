package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01001000 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`1000`
  var duration: screepsLib.screepsLibNumbers.`800`
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`0`, 
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`7`, 
    screepsLib.screepsLibNumbers.`14`, 
    screepsLib.screepsLibNumbers.`22`
  ]
  var ops: screepsLib.screepsLibNumbers.`100`
  var range: screepsLib.screepsLibNumbers.`3`
}

object Anon_01001000 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`1000`,
    duration: screepsLib.screepsLibNumbers.`800`,
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`0`, 
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`7`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ],
    ops: screepsLib.screepsLibNumbers.`100`,
    range: screepsLib.screepsLibNumbers.`3`
  ): Anon_01001000 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_01001000]
  }
}

