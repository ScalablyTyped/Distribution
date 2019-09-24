package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineDataFragmentSpread
  extends IR
     with Node
     with Selection
     with VisitNode {
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.InlineDataFragmentSpread
  var loc: Location
  var metadata: Metadata
  var name: String
  var selections: js.Array[Selection]
}

object InlineDataFragmentSpread {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.InlineDataFragmentSpread,
    loc: Location,
    metadata: Metadata,
    name: String,
    selections: js.Array[Selection]
  ): InlineDataFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name, selections = selections)
  
    __obj.asInstanceOf[InlineDataFragmentSpread]
  }
}

