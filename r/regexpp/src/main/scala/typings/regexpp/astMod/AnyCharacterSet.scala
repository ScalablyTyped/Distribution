package typings.regexpp.astMod

import typings.regexpp.regexppStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyCharacterSet
  extends CharacterSet
     with NodeBase {
  var kind: any
  @JSName("parent")
  var parent_AnyCharacterSet: Alternative | Quantifier
  @JSName("type")
  var type_AnyCharacterSet: typings.regexpp.regexppStrings.CharacterSet
}

object AnyCharacterSet {
  @scala.inline
  def apply(
    end: Double,
    kind: any,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet
  ): AnyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyCharacterSet]
  }
}

