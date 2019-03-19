package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnicodePropertyCharacterSet
  extends CharacterSet
     with NodeBase
     with CharacterClassElement {
  var key: java.lang.String
  var kind: regexppLib.regexppLibStrings.property
  var negate: scala.Boolean
  @JSName("parent")
  var parent_UnicodePropertyCharacterSet: Alternative | Quantifier | CharacterClass
  @JSName("type")
  var type_UnicodePropertyCharacterSet: regexppLib.regexppLibStrings.CharacterSet
  var value: java.lang.String | scala.Null
}

object UnicodePropertyCharacterSet {
  @scala.inline
  def apply(
    end: scala.Double,
    key: java.lang.String,
    kind: regexppLib.regexppLibStrings.property,
    negate: scala.Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: java.lang.String,
    start: scala.Double,
    `type`: regexppLib.regexppLibStrings.CharacterSet,
    value: java.lang.String = null
  ): UnicodePropertyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end, key = key, kind = kind, negate = negate, parent = parent.asInstanceOf[js.Any], raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UnicodePropertyCharacterSet]
  }
}

