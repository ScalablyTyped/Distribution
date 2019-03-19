package typings
package regexpDashTreeLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterClass
  extends Base[regexpDashTreeLib.regexpDashTreeLibStrings.CharacterClass]
     with Expression {
  var expressions: js.Array[Char | ClassRange]
  var negative: js.UndefOr[regexpDashTreeLib.regexpDashTreeLibNumbers.`true`] = js.undefined
}

object CharacterClass {
  @scala.inline
  def apply(
    expressions: js.Array[Char | ClassRange],
    `type`: regexpDashTreeLib.regexpDashTreeLibStrings.CharacterClass,
    loc: regexpDashTreeLib.Anon_End = null,
    negative: regexpDashTreeLib.regexpDashTreeLibNumbers.`true` = null
  ): CharacterClass = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (negative != null) __obj.updateDynamic("negative")(negative)
    __obj.asInstanceOf[CharacterClass]
  }
}

