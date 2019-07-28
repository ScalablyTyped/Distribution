package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags
  extends LeafNode
     with NodeBase {
  var dotAll: Boolean
  var global: Boolean
  var ignoreCase: Boolean
  var multiline: Boolean
  @JSName("parent")
  var parent_Flags: RegExpLiteral | Null
  var sticky: Boolean
  @JSName("type")
  var type_Flags: typings.regexpp.regexppStrings.Flags
  var unicode: Boolean
}

object Flags {
  @scala.inline
  def apply(
    dotAll: Boolean,
    end: Double,
    global: Boolean,
    ignoreCase: Boolean,
    multiline: Boolean,
    raw: String,
    start: Double,
    sticky: Boolean,
    `type`: typings.regexpp.regexppStrings.Flags,
    unicode: Boolean,
    parent: RegExpLiteral = null
  ): Flags = {
    val __obj = js.Dynamic.literal(dotAll = dotAll, end = end, global = global, ignoreCase = ignoreCase, multiline = multiline, raw = raw, start = start, sticky = sticky, unicode = unicode)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Flags]
  }
}

