package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_010010000 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`20`
  var duration: screepsLib.screepsLibNumbers.`50`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`5000`, 
    screepsLib.screepsLibNumbers.`10000`, 
    screepsLib.screepsLibNumbers.`15000`, 
    screepsLib.screepsLibNumbers.`20000`, 
    screepsLib.screepsLibNumbers.`25000`
  ]
  var energy: screepsLib.screepsLibNumbers.`100`
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`0`, 
    screepsLib.screepsLibNumbers.`2`, 
    screepsLib.screepsLibNumbers.`7`, 
    screepsLib.screepsLibNumbers.`14`, 
    screepsLib.screepsLibNumbers.`22`
  ]
}

object Anon_010010000 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`20`,
    duration: screepsLib.screepsLibNumbers.`50`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`5000`, 
      screepsLib.screepsLibNumbers.`10000`, 
      screepsLib.screepsLibNumbers.`15000`, 
      screepsLib.screepsLibNumbers.`20000`, 
      screepsLib.screepsLibNumbers.`25000`
    ],
    energy: screepsLib.screepsLibNumbers.`100`,
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`0`, 
      screepsLib.screepsLibNumbers.`2`, 
      screepsLib.screepsLibNumbers.`7`, 
      screepsLib.screepsLibNumbers.`14`, 
      screepsLib.screepsLibNumbers.`22`
    ]
  ): Anon_010010000 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, energy = energy, level = level)
  
    __obj.asInstanceOf[Anon_010010000]
  }
}

