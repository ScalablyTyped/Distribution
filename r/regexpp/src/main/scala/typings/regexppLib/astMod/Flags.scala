package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags
  extends LeafNode
     with NodeBase {
  var dotAll: scala.Boolean
  var global: scala.Boolean
  var ignoreCase: scala.Boolean
  var multiline: scala.Boolean
  @JSName("parent")
  var parent_Flags: RegExpLiteral | scala.Null
  var sticky: scala.Boolean
  @JSName("type")
  var type_Flags: regexppLib.regexppLibStrings.Flags
  var unicode: scala.Boolean
}

object Flags {
  @scala.inline
  def apply(
    dotAll: scala.Boolean,
    end: scala.Double,
    global: scala.Boolean,
    ignoreCase: scala.Boolean,
    multiline: scala.Boolean,
    raw: java.lang.String,
    start: scala.Double,
    sticky: scala.Boolean,
    `type`: regexppLib.regexppLibStrings.Flags,
    unicode: scala.Boolean,
    parent: RegExpLiteral = null
  ): Flags = {
    val __obj = js.Dynamic.literal(dotAll = dotAll, end = end, global = global, ignoreCase = ignoreCase, multiline = multiline, raw = raw, start = start, sticky = sticky, unicode = unicode)
    __obj.updateDynamic("type")(`type`)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Flags]
  }
}

