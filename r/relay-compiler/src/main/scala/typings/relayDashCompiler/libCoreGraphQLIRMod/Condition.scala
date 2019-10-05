package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition
  extends IR
     with Node
     with Selection
     with VisitNode {
  var condition: Literal | Variable
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Condition
  var loc: Location
  var metadata: Metadata
  var passingValue: Boolean
  var selections: js.Array[Selection]
}

object Condition {
  @scala.inline
  def apply(
    condition: Literal | Variable,
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Condition,
    loc: Location,
    passingValue: Boolean,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind, loc = loc, passingValue = passingValue, selections = selections)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

