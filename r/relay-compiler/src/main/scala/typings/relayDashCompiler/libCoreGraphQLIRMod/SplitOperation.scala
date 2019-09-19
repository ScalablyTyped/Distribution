package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.CompilerContextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitOperation
  extends CompilerContextDocument
     with Definition
     with GeneratedDefinition
     with IR
     with Node {
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
    metadata: Metadata,
    name: String,
    selections: js.Array[Selection],
    `type`: GraphQLCompositeType
  ): SplitOperation = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name, selections = selections)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitOperation]
  }
}

