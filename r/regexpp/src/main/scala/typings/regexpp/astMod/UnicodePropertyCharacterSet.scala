package typings.regexpp.astMod

import typings.regexpp.regexppStrings.property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnicodePropertyCharacterSet
  extends CharacterSet
     with NodeBase
     with CharacterClassElement {
  var key: String
  var kind: property
  var negate: Boolean
  @JSName("parent")
  var parent_UnicodePropertyCharacterSet: Alternative | Quantifier | CharacterClass
  @JSName("type")
  var type_UnicodePropertyCharacterSet: typings.regexpp.regexppStrings.CharacterSet
  var value: String | Null
}

object UnicodePropertyCharacterSet {
  @scala.inline
  def apply(
    end: Double,
    key: String,
    kind: property,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typings.regexpp.regexppStrings.CharacterSet,
    value: String = null
  ): UnicodePropertyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end, key = key, kind = kind, negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UnicodePropertyCharacterSet]
  }
}

