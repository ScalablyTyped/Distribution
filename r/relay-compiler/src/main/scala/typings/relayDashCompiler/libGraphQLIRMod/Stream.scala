package typings.relayDashCompiler.libGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream
  extends IR
     with Node
     with Selection {
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
    metadata: Metadata,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null
  ): Stream = {
    val __obj = js.Dynamic.literal(initialCount = initialCount, kind = kind, label = label, loc = loc, metadata = metadata.asInstanceOf[js.Any], selections = selections)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    __obj.asInstanceOf[Stream]
  }
}

