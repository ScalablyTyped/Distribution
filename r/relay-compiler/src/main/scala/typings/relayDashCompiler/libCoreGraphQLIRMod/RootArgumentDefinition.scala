package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootArgumentDefinition
  extends ArgumentDefinition
     with IR {
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
    metadata: Metadata,
    name: String,
    `type`: GraphQLInputType
  ): RootArgumentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootArgumentDefinition]
  }
}

