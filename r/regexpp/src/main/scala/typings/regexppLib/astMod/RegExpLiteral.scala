package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends BranchNode
     with NodeBase {
  var flags: Flags
  @JSName("parent")
  var parent_RegExpLiteral: scala.Null
  var pattern: Pattern
  @JSName("type")
  var type_RegExpLiteral: regexppLib.regexppLibStrings.RegExpLiteral
}

object RegExpLiteral {
  @scala.inline
  def apply(
    end: scala.Double,
    flags: Flags,
    parent: scala.Null,
    pattern: Pattern,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.RegExpLiteral
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end, flags = flags, parent = parent, pattern = pattern, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegExpLiteral]
  }
}

