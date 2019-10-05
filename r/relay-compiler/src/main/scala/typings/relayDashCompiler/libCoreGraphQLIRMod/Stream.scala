package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream
  extends IR
     with Node
     with Selection
     with VisitNode {
  var `if`: ArgumentValue | Null
  var initialCount: ArgumentValue
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Stream
  var label: String
  var loc: Location
  var metadata: Metadata
  var selections: js.Array[Selection]
}

object Stream {
  @scala.inline
  def apply(
    initialCount: ArgumentValue,
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: Metadata = null
  ): Stream = {
    val __obj = js.Dynamic.literal(initialCount = initialCount, kind = kind, label = label, loc = loc, selections = selections)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}

