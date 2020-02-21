package typings.relayCompiler.iRMod

import typings.relayCompiler.irvisitorMod.VisitNode
import typings.relayCompiler.schemaMod.CompositeTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineFragment
  extends IR
     with Node
     with Selection
     with VisitNode {
  var directives: js.Array[Directive]
  var kind: typings.relayCompiler.relayCompilerStrings.InlineFragment
  var loc: Location
  var metadata: Metadata
  var selections: js.Array[Selection]
  var typeCondition: CompositeTypeID
}

object InlineFragment {
  @scala.inline
  def apply(
    directives: js.Array[Directive],
    kind: typings.relayCompiler.relayCompilerStrings.InlineFragment,
    loc: Location,
    selections: js.Array[Selection],
    typeCondition: CompositeTypeID,
    metadata: Metadata = null
  ): InlineFragment = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineFragment]
  }
}

