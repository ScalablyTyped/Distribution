package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defer
  extends IR
     with Node
     with Selection
     with VisitNode {
  var `if`: ArgumentValue | Null
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Defer
  var label: String
  var loc: Location
  var metadata: Metadata
  var selections: js.Array[Selection]
}

object Defer {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Defer,
    label: String,
    loc: Location,
    metadata: Metadata,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null
  ): Defer = {
    val __obj = js.Dynamic.literal(kind = kind, label = label, loc = loc, metadata = metadata.asInstanceOf[js.Any], selections = selections)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    __obj.asInstanceOf[Defer]
  }
}

