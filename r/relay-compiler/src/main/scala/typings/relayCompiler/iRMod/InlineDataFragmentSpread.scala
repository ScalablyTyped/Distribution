package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineDataFragmentSpread
  extends IR
     with Node
     with Selection
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.InlineDataFragmentSpread
  var loc: Location
  var metadata: Metadata
  var name: String
  var selections: js.Array[Selection]
}

object InlineDataFragmentSpread {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.InlineDataFragmentSpread,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): InlineDataFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineDataFragmentSpread]
  }
}

