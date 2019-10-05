package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.CompilerContextDocument
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitOperation
  extends CompilerContextDocument
     with Definition
     with GeneratedDefinition
     with IR
     with Node
     with VisitNode {
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.SplitOperation
  var loc: Location
  var metadata: Metadata
  var name: String
  var selections: js.Array[Selection]
  var `type`: GraphQLCompositeType
}

object SplitOperation {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: GraphQLCompositeType,
    metadata: Metadata = null
  ): SplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, name = name, selections = selections)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitOperation]
  }
}

