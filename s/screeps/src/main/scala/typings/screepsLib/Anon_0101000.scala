package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0101000 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`50`
  var duration: screepsLib.screepsLibNumbers.`1000`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`4`, 
    screepsLib.screepsLibNumbers.`6`, 
    screepsLib.screepsLibNumbers.`8`, 
    screepsLib.screepsLibNumbers.`10`
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

object Anon_0101000 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`50`,
    duration: screepsLib.screepsLibNumbers.`1000`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`4`, 
      screepsLib.screepsLibNumbers.`6`, 
      screepsLib.screepsLibNumbers.`8`, 
      screepsLib.screepsLibNumbers.`10`
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
  ): Anon_0101000 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_0101000]
  }
}

