package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
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
  var kind: typings.relayCompiler.relayCompilerStrings.Stream
  var label: String
  var loc: Location
  var metadata: Metadata
  var selections: js.Array[Selection]
  var useCustomizedBatch: ArgumentValue | Null
}

object Stream {
  @scala.inline
  def apply(
    initialCount: ArgumentValue,
    kind: typings.relayCompiler.relayCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: Metadata = null,
    useCustomizedBatch: ArgumentValue = null
  ): Stream = {
    val __obj = js.Dynamic.literal(initialCount = initialCount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (useCustomizedBatch != null) __obj.updateDynamic("useCustomizedBatch")(useCustomizedBatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}

