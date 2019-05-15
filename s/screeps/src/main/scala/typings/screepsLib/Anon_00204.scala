package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_00204 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`50`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`0DOT2`, 
    screepsLib.screepsLibNumbers.`0DOT4`, 
    screepsLib.screepsLibNumbers.`0DOT6`, 
    screepsLib.screepsLibNumbers.`0DOT8`, 
    screepsLib.screepsLibNumbers.`1DOT0`
  ]
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`0`, 
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`7`, 
    screepsLib.screepsLibNumbers.`14`, 
    screepsLib.screepsLibNumbers.`22`
  ]
  var ops: screepsLib.screepsLibNumbers.`2`
  var range: screepsLib.screepsLibNumbers.`3`
}

object Anon_00204 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`50`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`0DOT2`, 
      screepsLib.screepsLibNumbers.`0DOT4`, 
      screepsLib.screepsLibNumbers.`0DOT6`, 
      screepsLib.screepsLibNumbers.`0DOT8`, 
      screepsLib.screepsLibNumbers.`1DOT0`
    ],
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`0`, 
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`7`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ],
    ops: screepsLib.screepsLibNumbers.`2`,
    range: screepsLib.screepsLibNumbers.`3`
  ): Anon_00204 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, effect = effect, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_00204]
  }
}

