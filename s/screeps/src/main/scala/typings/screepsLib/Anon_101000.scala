package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_101000 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`800`
  var duration: screepsLib.screepsLibNumbers.`1000`
  var effect: js.Tuple5[
    screepsLib.screepsLibNumbers.`10`, 
    screepsLib.screepsLibNumbers.`20`, 
    screepsLib.screepsLibNumbers.`30`, 
    screepsLib.screepsLibNumbers.`40`, 
    screepsLib.screepsLibNumbers.`50`
  ]
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`20`, 
    screepsLib.screepsLibNumbers.`21`, 
    screepsLib.screepsLibNumbers.`22`, 
    screepsLib.screepsLibNumbers.`23`, 
    screepsLib.screepsLibNumbers.`24`
  ]
  var ops: screepsLib.screepsLibNumbers.`200`
  var range: screepsLib.screepsLibNumbers.`3`
}

object Anon_101000 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`800`,
    duration: screepsLib.screepsLibNumbers.`1000`,
    effect: js.Tuple5[
      screepsLib.screepsLibNumbers.`10`, 
      screepsLib.screepsLibNumbers.`20`, 
      screepsLib.screepsLibNumbers.`30`, 
      screepsLib.screepsLibNumbers.`40`, 
      screepsLib.screepsLibNumbers.`50`
    ],
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`20`, 
      screepsLib.screepsLibNumbers.`21`, 
      screepsLib.screepsLibNumbers.`22`, 
      screepsLib.screepsLibNumbers.`23`, 
      screepsLib.screepsLibNumbers.`24`
    ],
    ops: screepsLib.screepsLibNumbers.`200`,
    range: screepsLib.screepsLibNumbers.`3`
  ): Anon_101000 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, effect = effect, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_101000]
  }
}

