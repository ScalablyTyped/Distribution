package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern
  extends BranchNode
     with NodeBase {
  var alternatives: js.Array[Alternative]
  @JSName("parent")
  var parent_Pattern: RegExpLiteral | scala.Null
  @JSName("type")
  var type_Pattern: regexppLib.regexppLibStrings.Pattern
}

object Pattern {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: scala.Double,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.Pattern,
    parent: RegExpLiteral = null
  ): Pattern = {
    val __obj = js.Dynamic.literal(alternatives = alternatives, end = end, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Pattern]
  }
}

