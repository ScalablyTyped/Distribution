package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`800`
  var duration: screepsLib.screepsLibNumbers.`1000`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`1`, 
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`3`, 
    screepsLib.screepsLibNumbers.`4`, 
    screepsLib.screepsLibNumbers.`5`
  ]
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`10`, 
    screepsLib.screepsLibNumbers.`11`, 
    screepsLib.screepsLibNumbers.`12`, 
    screepsLib.screepsLibNumbers.`14`, 
    screepsLib.screepsLibNumbers.`22`
  ]
  var ops: screepsLib.screepsLibNumbers.`200`
  var range: screepsLib.screepsLibNumbers.`3`
}

object Anon_1 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`800`,
    duration: screepsLib.screepsLibNumbers.`1000`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`1`, 
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`3`, 
      screepsLib.screepsLibNumbers.`4`, 
      screepsLib.screepsLibNumbers.`5`
    ],
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`10`, 
      screepsLib.screepsLibNumbers.`11`, 
      screepsLib.screepsLibNumbers.`12`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ],
    ops: screepsLib.screepsLibNumbers.`200`,
    range: screepsLib.screepsLibNumbers.`3`
  ): Anon_1 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_1]
  }
}

