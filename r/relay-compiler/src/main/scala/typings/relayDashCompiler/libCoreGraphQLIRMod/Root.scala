package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.CompilerContextDocument
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import typings.relayDashCompiler.relayDashCompilerStrings.mutation
import typings.relayDashCompiler.relayDashCompilerStrings.query
import typings.relayDashCompiler.relayDashCompilerStrings.subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root
  extends CompilerContextDocument
     with Definition
     with IR
     with Node
     with VisitNode {
  var argumentDefinitions: js.Array[LocalArgumentDefinition]
  var directives: js.Array[Directive]
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.Root
  var loc: Location
  var metadata: Metadata
  var name: String
  var operation: query | mutation | subscription
  var selections: Selection
  var `type`: GraphQLCompositeType
}

object Root {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[LocalArgumentDefinition],
    directives: js.Array[Directive],
    kind: typings.relayDashCompiler.relayDashCompilerStrings.Root,
    loc: Location,
    name: String,
    operation: query | mutation | subscription,
    selections: Selection,
    `type`: GraphQLCompositeType,
    metadata: Metadata = null
  ): Root = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, directives = directives, kind = kind, loc = loc, name = name, operation = operation.asInstanceOf[js.Any], selections = selections)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
}

