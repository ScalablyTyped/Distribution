package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootArgumentDefinition
  extends ArgumentDefinition
     with IR
     with VisitNode {
  var kind: typings.relayDashCompiler.relayDashCompilerStrings.RootArgumentDefinition
  var loc: Location
  var metadata: Metadata
  var name: String
  var `type`: GraphQLInputType
}

object RootArgumentDefinition {
  @scala.inline
  def apply(
    kind: typings.relayDashCompiler.relayDashCompilerStrings.RootArgumentDefinition,
    loc: Location,
    name: String,
    `type`: GraphQLInputType,
    metadata: Metadata = null
  ): RootArgumentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootArgumentDefinition]
  }
}

