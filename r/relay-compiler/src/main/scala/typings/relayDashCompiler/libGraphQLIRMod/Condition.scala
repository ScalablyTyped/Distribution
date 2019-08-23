package typings.relayDashCompiler.libGraphQLIRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition
  extends IR
     with Node
     with Selection {
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
    metadata: Metadata,
    passingValue: Boolean,
    selections: js.Array[Selection]
  ): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], passingValue = passingValue, selections = selections)
  
    __obj.asInstanceOf[Condition]
  }
}

