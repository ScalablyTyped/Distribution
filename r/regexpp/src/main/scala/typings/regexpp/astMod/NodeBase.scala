package typings.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBase extends js.Object {
  var end: Double
  var parent: /* import warning: importer.ImportType#apply Failed type conversion: regexpp.regexpp/ast.Node['parent'] */ js.Any
  var raw: String
  var start: Double
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: regexpp.regexpp/ast.Node['type'] */ js.Any
}

object NodeBase {
  @scala.inline
  def apply(
    end: Double,
    parent: /* import warning: importer.ImportType#apply Failed type conversion: regexpp.regexpp/ast.Node['parent'] */ js.Any,
    raw: String,
    start: Double,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: regexpp.regexpp/ast.Node['type'] */ js.Any
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
}

