package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_10100 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`100`
  var duration: screepsLib.screepsLibNumbers.`100`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`4`, 
    screepsLib.screepsLibNumbers.`6`, 
    screepsLib.screepsLibNumbers.`8`, 
    screepsLib.screepsLibNumbers.`10`
  ]
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`10`, 
    screepsLib.screepsLibNumbers.`11`, 
    screepsLib.screepsLibNumbers.`12`, 
    screepsLib.screepsLibNumbers.`14`, 
    screepsLib.screepsLibNumbers.`22`
  ]
  var period: screepsLib.screepsLibNumbers.`10`
  var range: screepsLib.screepsLibNumbers.`3`
}

object Anon_10100 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`100`,
    duration: screepsLib.screepsLibNumbers.`100`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`4`, 
      screepsLib.screepsLibNumbers.`6`, 
      screepsLib.screepsLibNumbers.`8`, 
      screepsLib.screepsLibNumbers.`10`
    ],
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`10`, 
      screepsLib.screepsLibNumbers.`11`, 
      screepsLib.screepsLibNumbers.`12`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ],
    period: screepsLib.screepsLibNumbers.`10`,
    range: screepsLib.screepsLibNumbers.`3`
  ): Anon_10100 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, level = level, period = period, range = range)
  
    __obj.asInstanceOf[Anon_10100]
  }
}

