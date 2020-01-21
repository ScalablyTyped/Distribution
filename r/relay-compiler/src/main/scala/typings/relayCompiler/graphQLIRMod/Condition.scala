package typings.relayCompiler.graphQLIRMod

import typings.relayCompiler.graphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition
  extends IR
     with Node
     with Selection
     with VisitNode {
  var condition: Literal | Variable
  var kind: typings.relayCompiler.relayCompilerStrings.Condition
  var loc: Location
  var metadata: Metadata
  var passingValue: Boolean
  var selections: js.Array[Selection]
}

object Condition {
  @scala.inline
  def apply(
    condition: Literal | Variable,
    kind: typings.relayCompiler.relayCompilerStrings.Condition,
    loc: Location,
    passingValue: Boolean,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

