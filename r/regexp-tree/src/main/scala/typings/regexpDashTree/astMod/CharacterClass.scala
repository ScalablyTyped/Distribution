package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import typings.regexpDashTree.regexpDashTreeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterClass
  extends Base[typings.regexpDashTree.regexpDashTreeStrings.CharacterClass]
     with Expression {
  var expressions: js.Array[Char | ClassRange]
  var negative: js.UndefOr[`true`] = js.undefined
}

object CharacterClass {
  @scala.inline
  def apply(
    expressions: js.Array[Char | ClassRange],
    `type`: typings.regexpDashTree.regexpDashTreeStrings.CharacterClass,
    loc: Anon_End = null,
    negative: `true` = null
  ): CharacterClass = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (negative != null) __obj.updateDynamic("negative")(negative)
    __obj.asInstanceOf[CharacterClass]
  }
}

