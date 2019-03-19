package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EscapeCharacterSet
  extends CharacterSet
     with NodeBase
     with CharacterClassElement {
  var kind: regexppLib.regexppLibStrings.digit | regexppLib.regexppLibStrings.space | regexppLib.regexppLibStrings.word
  var negate: scala.Boolean
  @JSName("parent")
  var parent_EscapeCharacterSet: Alternative | Quantifier | CharacterClass
  @JSName("type")
  var type_EscapeCharacterSet: regexppLib.regexppLibStrings.CharacterSet
}

object EscapeCharacterSet {
  @scala.inline
  def apply(
    end: scala.Double,
    kind: regexppLib.regexppLibStrings.digit | regexppLib.regexppLibStrings.space | regexppLib.regexppLibStrings.word,
    negate: scala.Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.CharacterSet
  ): EscapeCharacterSet = {
    val __obj = js.Dynamic.literal(end = end, kind = kind.asInstanceOf[js.Any], negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EscapeCharacterSet]
  }
}

