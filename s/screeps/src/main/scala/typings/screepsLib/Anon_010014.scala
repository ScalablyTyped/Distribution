package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_010014 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`100`
  var duration: js.Tuple5[
    screepsLib.screepsLibNumbers.`100`, 
    screepsLib.screepsLibNumbers.`200`, 
    screepsLib.screepsLibNumbers.`300`, 
    screepsLib.screepsLibNumbers.`400`, 
    screepsLib.screepsLibNumbers.`500`
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

object Anon_010014 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`100`,
    duration: js.Tuple5[
      screepsLib.screepsLibNumbers.`100`, 
      screepsLib.screepsLibNumbers.`200`, 
      screepsLib.screepsLibNumbers.`300`, 
      screepsLib.screepsLibNumbers.`400`, 
      screepsLib.screepsLibNumbers.`500`
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
  ): Anon_010014 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_010014]
  }
}

