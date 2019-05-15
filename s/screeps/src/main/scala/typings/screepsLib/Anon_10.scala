package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_10 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`100`
  var duration: screepsLib.screepsLibNumbers.`300`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`50`, 
    screepsLib.screepsLibNumbers.`100`, 
    screepsLib.screepsLibNumbers.`150`, 
    screepsLib.screepsLibNumbers.`200`, 
    screepsLib.screepsLibNumbers.`250`
  ]
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`10`, 
    screepsLib.screepsLibNumbers.`11`, 
    screepsLib.screepsLibNumbers.`12`, 
    screepsLib.screepsLibNumbers.`14`, 
    screepsLib.screepsLibNumbers.`22`
  ]
  var period: screepsLib.screepsLibNumbers.`15`
  var range: screepsLib.screepsLibNumbers.`3`
}

object Anon_10 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`100`,
    duration: screepsLib.screepsLibNumbers.`300`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`50`, 
      screepsLib.screepsLibNumbers.`100`, 
      screepsLib.screepsLibNumbers.`150`, 
      screepsLib.screepsLibNumbers.`200`, 
      screepsLib.screepsLibNumbers.`250`
    ],
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`10`, 
      screepsLib.screepsLibNumbers.`11`, 
      screepsLib.screepsLibNumbers.`12`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ],
    period: screepsLib.screepsLibNumbers.`15`,
    range: screepsLib.screepsLibNumbers.`3`
  ): Anon_10 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, level = level, period = period, range = range)
  
    __obj.asInstanceOf[Anon_10]
  }
}

