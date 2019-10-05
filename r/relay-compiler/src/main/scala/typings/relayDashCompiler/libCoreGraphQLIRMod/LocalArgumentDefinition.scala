package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalArgumentDefinition
  extends ArgumentDefinition
     with IR
     with VisitNode {
  var defaultValue: js.Any
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.LocalArgumentDefinition
  var loc: Location
  var metadata: Metadata
  var name: String
  var `type`: GraphQLInputType
}

object LocalArgumentDefinition {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    kind: typings.relayDashCompiler.relayDashCompilerStrings.LocalArgumentDefinition,
    loc: Location,
    name: String,
    `type`: GraphQLInputType,
    metadata: Metadata = null
  ): LocalArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, kind = kind, loc = loc, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalArgumentDefinition]
  }
}

