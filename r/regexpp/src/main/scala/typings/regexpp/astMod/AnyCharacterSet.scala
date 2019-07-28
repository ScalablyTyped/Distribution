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
    val __obj = js.Dynamic.literal(end = end, kind = kind, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyCharacterSet]
  }
}

