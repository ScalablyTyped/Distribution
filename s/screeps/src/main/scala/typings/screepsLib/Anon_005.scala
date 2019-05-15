package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_005 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`500`
  var duration: screepsLib.screepsLibNumbers.`1000`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`0DOT9`, 
    screepsLib.screepsLibNumbers.`0DOT8`, 
    screepsLib.screepsLibNumbers.`0DOT7`, 
    screepsLib.screepsLibNumbers.`0DOT6`, 
    screepsLib.screepsLibNumbers.`0DOT5`
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

object Anon_005 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`500`,
    duration: screepsLib.screepsLibNumbers.`1000`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`0DOT9`, 
      screepsLib.screepsLibNumbers.`0DOT8`, 
      screepsLib.screepsLibNumbers.`0DOT7`, 
      screepsLib.screepsLibNumbers.`0DOT6`, 
      screepsLib.screepsLibNumbers.`0DOT5`
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
  ): Anon_005 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_005]
  }
}

