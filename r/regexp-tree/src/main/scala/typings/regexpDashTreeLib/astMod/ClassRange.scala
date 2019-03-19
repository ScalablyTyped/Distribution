package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassRange
  extends Base[regexpDashTreeLib.regexpDashTreeLibStrings.ClassRange] {
  var from: Char
  var to: Char
}

object ClassRange {
  @scala.inline
  def apply(
    from: Char,
    to: Char,
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.ClassRange,
    loc: regexpDashTreeLib.Anon_End = null
  ): ClassRange = {
    val __obj = js.Dynamic.literal(from = from, to = to)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ClassRange]
  }
}

