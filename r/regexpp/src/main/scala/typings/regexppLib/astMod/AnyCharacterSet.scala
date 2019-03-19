package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyCharacterSet
  extends CharacterSet
     with NodeBase {
  var kind: regexppLib.regexppLibStrings.any
  @JSName("parent")
  var parent_AnyCharacterSet: Alternative | Quantifier
  @JSName("type")
  var type_AnyCharacterSet: regexppLib.regexppLibStrings.CharacterSet
}

object AnyCharacterSet {
  @scala.inline
  def apply(
    end: scala.Double,
    kind: regexppLib.regexppLibStrings.any,
    parent: Alternative | Quantifier,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.CharacterSet
  ): AnyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end, kind = kind, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyCharacterSet]
  }
}

