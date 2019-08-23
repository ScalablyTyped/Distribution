package typings.relayDashCompiler.libGraphQLIRMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalArgumentDefinition
  extends ArgumentDefinition
     with IR {
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
    metadata: Metadata,
    name: String,
    `type`: GraphQLInputType
  ): LocalArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, kind = kind, loc = loc, metadata = metadata.asInstanceOf[js.Any], name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalArgumentDefinition]
  }
}

