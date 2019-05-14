package typings
package regexppLib.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBase extends js.Object {
  var end: scala.Double
  var parent: /* import warning: ImportType.apply Failed type conversion: regexpp.regexpp/ast.Node['parent'] */ js.Any
  var raw: java.lang.String
  var start: scala.Double
  var `type`: /* import warning: ImportType.apply Failed type conversion: regexpp.regexpp/ast.Node['type'] */ js.Any
}

object NodeBase {
  @scala.inline
  def apply(
    end: scala.Double,
    parent: /* import warning: ImportType.apply Failed type conversion: regexpp.regexpp/ast.Node['parent'] */ js.Any,
    raw: java.lang.String,
    start: scala.Double,
    `type`: /* import warning: ImportType.apply Failed type conversion: regexpp.regexpp/ast.Node['type'] */ js.Any
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end, parent = parent, raw = raw, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeBase]
  }
}

