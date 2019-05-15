package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1020 extends js.Object {
  var className: screepsLib.screepsLibStrings.operator
  var cooldown: screepsLib.screepsLibNumbers.`8`
  var duration: screepsLib.screepsLibNumbers.`10`
  var level: js.Tuple5[
    screepsLib.screepsLibNumbers.`20`, 
    screepsLib.screepsLibNumbers.`21`, 
    screepsLib.screepsLibNumbers.`22`, 
    screepsLib.screepsLibNumbers.`23`, 
    screepsLib.screepsLibNumbers.`24`
  ]
  var ops: js.Tuple5[
    screepsLib.screepsLibNumbers.`50`, 
    screepsLib.screepsLibNumbers.`40`, 
    screepsLib.screepsLibNumbers.`30`, 
    screepsLib.screepsLibNumbers.`20`, 
    screepsLib.screepsLibNumbers.`10`
  ]
  var range: screepsLib.screepsLibNumbers.`50`
}

object Anon_1020 {
  @scala.inline
  def apply(
    className: screepsLib.screepsLibStrings.operator,
    cooldown: screepsLib.screepsLibNumbers.`8`,
    duration: screepsLib.screepsLibNumbers.`10`,
    level: js.Tuple5[
      screepsLib.screepsLibNumbers.`20`, 
      screepsLib.screepsLibNumbers.`21`, 
      screepsLib.screepsLibNumbers.`22`, 
      screepsLib.screepsLibNumbers.`23`, 
      screepsLib.screepsLibNumbers.`24`
    ],
    ops: js.Tuple5[
      screepsLib.screepsLibNumbers.`50`, 
      screepsLib.screepsLibNumbers.`40`, 
      screepsLib.screepsLibNumbers.`30`, 
      screepsLib.screepsLibNumbers.`20`, 
      screepsLib.screepsLibNumbers.`10`
    ],
    range: screepsLib.screepsLibNumbers.`50`
  ): Anon_1020 = {
    val __obj = js.Dynamic.literal(className = className, cooldown = cooldown, duration = duration, level = level, ops = ops, range = range)
  
    __obj.asInstanceOf[Anon_1020]
  }
}

