package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends BranchNode
     with NodeBase {
  var flags: Flags
  @JSName("parent")
  var parent_RegExpLiteral: Null
  var pattern: Pattern
  @JSName("type")
  var type_RegExpLiteral: typings.regexpp.regexppStrings.RegExpLiteral
}

object RegExpLiteral {
  @scala.inline
  def apply(
    end: Double,
    flags: Flags,
    parent: Null,
    pattern: Pattern,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.RegExpLiteral
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end, flags = flags, parent = parent, pattern = pattern, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegExpLiteral]
  }
}

