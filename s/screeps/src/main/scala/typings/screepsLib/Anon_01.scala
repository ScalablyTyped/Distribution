package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`5`
  var duration: js.Tuple5[
    screepsLib.screepsLibNumbers.`1`, 
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`3`, 
    screepsLib.screepsLibNumbers.`4`, 
    screepsLib.screepsLibNumbers.`5`
  ]
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`0`, 
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`7`, 
    screepsLib.screepsLibNumbers.`14`, 
    screepsLib.screepsLibNumbers.`22`
  ]
  var ops: screepsLib.screepsLibNumbers.`10`
  var range: screepsLib.screepsLibNumbers.`20`
}

object Anon_01 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`5`,
    duration: js.Tuple5[
      screepsLib.screepsLibNumbers.`1`, 
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`3`, 
      screepsLib.screepsLibNumbers.`4`, 
      screepsLib.screepsLibNumbers.`5`
    ],
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`0`, 
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`7`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ],
    ops: screepsLib.screepsLibNumbers.`10`,
    range: screepsLib.screepsLibNumbers.`20`
  ): Anon_01 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_01]
  }
}

