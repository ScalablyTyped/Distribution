package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassRange
  extends Base[typings.regexpDashTree.regexpDashTreeStrings.ClassRange] {
  var from: Char
  var to: Char
}

object ClassRange {
  @scala.inline
  def apply(
    from: Char,
    to: Char,
    `type`: typings.regexpDashTree.regexpDashTreeStrings.ClassRange,
    loc: Anon_End = null
  ): ClassRange = {
    val __obj = js.Dynamic.literal(from = from, to = to)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ClassRange]
  }
}

