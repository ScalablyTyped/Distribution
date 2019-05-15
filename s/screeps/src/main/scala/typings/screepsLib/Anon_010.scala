package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_010 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`10`
  var duration: screepsLib.screepsLibNumbers.`100`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`1DOT1`, 
    screepsLib.screepsLibNumbers.`1DOT2`, 
    screepsLib.screepsLibNumbers.`1DOT3`, 
    screepsLib.screepsLibNumbers.`1DOT4`, 
    screepsLib.screepsLibNumbers.`1DOT5`
  ]
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`0`, 
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`7`, 
    screepsLib.screepsLibNumbers.`14`, 
    screepsLib.screepsLibNumbers.`22`
  ]
  var ops: screepsLib.screepsLibNumbers.`10`
  var range: screepsLib.screepsLibNumbers.`3`
}

object Anon_010 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`10`,
    duration: screepsLib.screepsLibNumbers.`100`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`1DOT1`, 
      screepsLib.screepsLibNumbers.`1DOT2`, 
      screepsLib.screepsLibNumbers.`1DOT3`, 
      screepsLib.screepsLibNumbers.`1DOT4`, 
      screepsLib.screepsLibNumbers.`1DOT5`
    ],
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`0`, 
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`7`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ],
    ops: screepsLib.screepsLibNumbers.`10`,
    range: screepsLib.screepsLibNumbers.`3`
  ): Anon_010 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_010]
  }
}

