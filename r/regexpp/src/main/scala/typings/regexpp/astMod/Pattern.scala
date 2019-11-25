package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern
  extends BranchNode
     with NodeBase {
  var alternatives: js.Array[Alternative]
  @JSName("parent")
  var parent_Pattern: RegExpLiteral | Null
  @JSName("type")
  var type_Pattern: typings.regexpp.regexppStrings.Pattern
}

object Pattern {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.Pattern,
    parent: RegExpLiteral = null
  ): Pattern = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

