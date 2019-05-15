package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0100 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`800`
  var duration: screepsLib.screepsLibNumbers.`1000`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`500000`, 
    screepsLib.screepsLibNumbers.`1000000`, 
    screepsLib.screepsLibNumbers.`2000000`, 
    screepsLib.screepsLibNumbers.`4000000`, 
    screepsLib.screepsLibNumbers.`7000000`
  ]
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

object Anon_0100 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`800`,
    duration: screepsLib.screepsLibNumbers.`1000`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`500000`, 
      screepsLib.screepsLibNumbers.`1000000`, 
      screepsLib.screepsLibNumbers.`2000000`, 
      screepsLib.screepsLibNumbers.`4000000`, 
      screepsLib.screepsLibNumbers.`7000000`
    ],
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`0`, 
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`7`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ],
    ops: screepsLib.screepsLibNumbers.`100`,
    range: screepsLib.screepsLibNumbers.`3`
  ): Anon_0100 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_0100]
  }
}

